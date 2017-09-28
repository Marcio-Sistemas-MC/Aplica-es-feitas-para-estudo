/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import banco.controle.QueixaControle;
import banco.entidades.Queixa;
import healthwatcher.HealthWatcherApp;
import healthwatcher.QueixaAlimentarApp;
import healthwatcher.QueixaAnimalApp;
import healthwatcher.QueixaApp;
import healthwatcher.QueixaDiversaApp;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Danielle
 */
public class QueixaController implements Initializable {

    @FXML
    private TextArea taDescricao;
    @FXML
    private TextArea taObservacao;
    @FXML
    private TextField tfSituacao;
    @FXML
    private ComboBox<String> cbTipoQueixa;
    @FXML
    private Button bnContinuar;
    @FXML
    private Button btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTipoQueixa.getItems().addAll("Queixa Alimentar", "Queixa Animal", "Queixa Diversa");
    }

    @FXML
    private void handleBtnContinuar(ActionEvent event) throws Exception {
        //chamar  tela para cadastro do reclamante
        if (!this.verificaPreenchimentoObrigatorio()) {
            JOptionPane.showMessageDialog(null, "DESCRIÇÃO DA QUEIXA \n TIPO DE QUEIXA \n VERIFIQUE!!",
                    "OS SEGIINTES CAPOS SÃO DE PREENCHIMENTO OBRIGATÓRIO",JOptionPane.ERROR_MESSAGE);
        } else {
            Queixa qx = this.carregaDadosQueixa();
            qx.setReclamante(HealthWatcherApp.RclAtual);
            QueixaControle qxCtr = new QueixaControle();
            try {
                qxCtr.cadastrarQueixa(qx);
                qx.setId(qxCtr.obtemNextValID());
                System.out.println(qx.getId() + "ID Queixa");
                HealthWatcherApp.qxAtual = qx;
                System.out.println("Até aqui tá certo");
                if (this.cbTipoQueixa.getValue().equalsIgnoreCase("Queixa Alimentar")) {
                    new QueixaAlimentarApp().start(new Stage());
                } else if (this.cbTipoQueixa.getValue().equalsIgnoreCase("Queixa Animal")) {
                    new QueixaAnimalApp().start(new Stage());
                } else if (this.cbTipoQueixa.getValue().equalsIgnoreCase("Queixa Diversa")) {
                    new QueixaDiversaApp().start(new Stage());
                }
                QueixaApp.myStage.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QueixaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean verificaPreenchimentoObrigatorio() {
        return !(this.cbTipoQueixa.getValue().isEmpty() || this.taDescricao.getText().isEmpty());
    }

    private Queixa carregaDadosQueixa() {
        Queixa qx = new Queixa();
        qx.setDescricao(this.taDescricao.getText());
        qx.setObservacao(this.taObservacao.getText());
        qx.setSituacao(this.tfSituacao.getText());
        return qx;
    }

    @FXML
    private void handleBtnCancelar(ActionEvent event) {
        QueixaApp.myStage.close();
    }

}
