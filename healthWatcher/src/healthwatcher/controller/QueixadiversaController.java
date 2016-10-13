/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import banco.controle.QueixaDiversaControle;
import banco.entidades.Queixa;
import banco.entidades.QueixaDiversa;
import healthwatcher.HealthWatcherApp;
import healthwatcher.QueixaDiversaApp;
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
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Danielle
 */
public class QueixadiversaController implements Initializable {

    @FXML
    private Label label;
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
    private Button btnSalvar;
    @FXML
    private Button btnLimpar;
    @FXML
    private Tab vitima;
    @FXML
    private Tab outrosDados;
    @FXML
    private TextField tfIdade;
    @FXML
    private TextField tfOcupacao;
    @FXML
    private TextField tfEscolaridade;
    @FXML
    private Button btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> estados = FXCollections.observableArrayList(
                "SELECIONE UM ESTADO", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "SC", "SP", "SE", "TO");
        this.cbEstado.getItems().addAll(estados);
    }    
    
    @FXML
    private void handleBtnSalvar(ActionEvent event) {
        Queixa queixa = HealthWatcherApp.qxAtual;
        QueixaDiversa qx = this.carregarDadosQueixa();
        qx.setQueixa(queixa);
        QueixaDiversaControle qxCtr = new QueixaDiversaControle();
        try {
            qxCtr.cadastrarQueixaDiversa(qx);
            JOptionPane.showMessageDialog(null,"ACOMPANHE SUAS QUEIXAS PELO NUMERO: " + qxCtr.obtenNextValID(),
                        "DADOS DA QUEIXA SALVOS COM SUCESSO!!!", JOptionPane.ERROR_MESSAGE);
            QueixaDiversaApp.myStage.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueixadiversaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QueixadiversaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private QueixaDiversa carregarDadosQueixa() {
        QueixaDiversa qx = new QueixaDiversa();
        if (this.tfIdade.getText().isEmpty()) {
            qx.setIdade(0);
        } else {
            qx.setIdade(Integer.parseInt(this.tfIdade.getText()));
        }
        qx.setOcupacao(this.tfOcupacao.getText());
        qx.setEscolaridade(this.tfEscolaridade.getText());
        qx.setVitimaBairro(this.tfBairro.getText());
        qx.setVitimaCep(this.tfCEP.getText());
        qx.setVitimaCidade(this.tfCidade.getText());
        qx.setVitimaEstado(this.cbEstado.getValue());
        if (this.tfNum.getText().isEmpty()) {
            qx.setVitimaNum(0);
        } else {
            qx.setVitimaNum(Integer.parseInt(this.tfNum.getText()));
        }
        qx.setVitimaRua(this.tfRua.getText());
        qx.setVitimaTelefone(this.tfTelefone.getText());
        return qx;
    }
    
    @FXML
    private void handleBtnLimpar(ActionEvent event) {
        
    }
    
    @FXML
    private void handleBtnCancelar(ActionEvent event) {
    }
    
}
