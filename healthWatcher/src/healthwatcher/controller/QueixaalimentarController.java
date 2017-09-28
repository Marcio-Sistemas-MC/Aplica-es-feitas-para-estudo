/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import banco.controle.QueixaAlimentarControle;
import banco.entidades.Queixa;
import banco.entidades.QueixaAlimentar;
import healthwatcher.HealthWatcherApp;
import healthwatcher.QueixaAlimentarApp;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Danielle
 */
public class QueixaalimentarController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Tab reclamante;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfRua;
    @FXML
    private TextField tfNum;
    @FXML
    private TextField tfComp;
    @FXML
    private TextField tfBairro;
    @FXML
    private TextField tfCidade;
    @FXML
    private ComboBox<String> cbEstado;
    @FXML
    private TextField tfCEP;
    @FXML
    private TextField tfTelefone;
    @FXML
    private TextField tfEmail;
    @FXML
    private Tab ocorrencia;
    @FXML
    private TextArea taDescricao;
    @FXML
    private TextArea taObservacao;
    @FXML
    private TextField tfSituacao;
    @FXML
    private Tab outros;
    @FXML
    private TextField tfQtdeComensais;
    @FXML
    private TextField tfQtdeDoentes;
    @FXML
    private TextField tfQtdeObitos;
    @FXML
    private TextField tfQtdeInternacoes;
    @FXML
    private TextField tfLocalAtendimento;
    @FXML
    private TextField tfRefeicao;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnSair;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> estados = FXCollections.observableArrayList(
                "SELECIONE UM ESTADO","AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "SC", "SP", "SE", "TO");
        this.cbEstado.getItems().addAll(estados);
    }

    @FXML
    private void handleBtnSalvar(ActionEvent event) {
        if (! this.verificaOutrosDados()) {
            JOptionPane.showMessageDialog(null,"CAMPOS DA ABA OUTROS DADOS",
                    "OS SEGINTES CAMPOS SÃO DE PREENCHIMENTO OBRIGATÓRIO:",JOptionPane.ERROR_MESSAGE);
        } else {
            Queixa queixa = HealthWatcherApp.qxAtual;
            QueixaAlimentar qx = this.preencheDadosQueixa();
            qx.setQueixa(queixa);
            QueixaAlimentarControle qxCtr = new QueixaAlimentarControle();
            try {
                qxCtr.cadastrarQueixaAlimentar(qx);
                JOptionPane.showMessageDialog(null,"ACOMPANHE SUAS QUEIXAS PELO NUMERO: " + qxCtr.obtemNetxValID(),
                        "DADOS DA QUEIXA SALVOS COM SUCESSO!!!", JOptionPane.ERROR_MESSAGE);
                QueixaAlimentarApp.myStage.close();
            } catch (SQLException ex) {
                Logger.getLogger(QueixaalimentarController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QueixaalimentarController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private QueixaAlimentar preencheDadosQueixa() {
        QueixaAlimentar qx = new QueixaAlimentar();
        qx.setNomeVitima(this.tfNome.getText());
        qx.setLocalAtendiento(this.tfLocalAtendimento.getText());
        qx.setQtdeComensais(Integer.parseInt(this.tfQtdeComensais.getText()));
        qx.setQtdeDoentes(Integer.parseInt(this.tfQtdeDoentes.getText()));
        qx.setQtdeInternados(Integer.parseInt(this.tfQtdeInternacoes.getText()));
        qx.setQtdeObitos(Integer.parseInt(this.tfQtdeObitos.getText()));
        qx.setRefeicaoSuspeita(this.tfRefeicao.getText());
        qx.setVitima_bairro(this.tfBairro.getText());
        qx.setVitima_cep(this.tfCEP.getText());
        qx.setVitima_cidade(this.tfCidade.getText());
        qx.setVitima_estado(this.cbEstado.getValue());
        qx.setVitima_nome(this.tfNome.getText());
        if (this.tfNum.getText().isEmpty()) {
            qx.setVitima_num(0);
        } else {
            qx.setVitima_num(Integer.parseInt(this.tfNum.getText()));
        }
        qx.setVitima_rua(this.tfRua.getText());
        qx.setVitima_telefone(this.tfTelefone.getText());
        return qx;
    }

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
        if (this.reclamante.isSelected()) {
            this.tfNome.clear();
            this.tfRua.clear();
            this.tfNum.clear();
            this.tfComp.clear();
            this.tfBairro.clear();
            this.tfCidade.clear();
            this.cbEstado.setValue("Selecione um Estado");
            this.tfCEP.clear();
            this.tfTelefone.clear();
            this.tfEmail.clear();
        } else {
            this.tfQtdeComensais.clear();
            this.tfQtdeDoentes.clear();
            this.tfQtdeInternacoes.clear();
            this.tfQtdeObitos.clear();
            this.tfLocalAtendimento.clear();
            this.tfRefeicao.clear();
        }
    }

    private boolean verificaOutrosDados() {
        boolean ret = true;
        if (this.tfQtdeComensais.getText().isEmpty()) {
            ret = false;
        } if (this.tfQtdeDoentes.getText().isEmpty()) {
            ret = false;
        }if (this.tfQtdeInternacoes.getText().isEmpty()) {
            ret = false;
        } if (this.tfQtdeObitos.getText().isEmpty()) {
            ret = false;
        }
        return ret;
    }

    @FXML
    private void handleBtnSair(ActionEvent event) {
        QueixaAlimentarApp.myStage.close();
    }

}
