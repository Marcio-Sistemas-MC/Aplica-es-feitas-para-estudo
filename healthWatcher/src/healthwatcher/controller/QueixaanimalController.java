/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import banco.controle.QueixaAnimalControle;
import banco.entidades.Queixa;
import banco.entidades.QueixaAnimal;
import healthwatcher.HealthWatcherApp;
import healthwatcher.QueixaAnimalApp;
import java.net.URL;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Danielle
 */
public class QueixaanimalController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Tab vitima;
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
    private Tab animais;
    @FXML
    private TextField tfAnimal;
    @FXML
    private TextField tfQtdeAnimal;
    @FXML
    private DatePicker dtOcorrencia;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnSalvar;

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
    private void handleBtnCancelar(ActionEvent event) {

    }

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
        if (this.vitima.isSelected()) {
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
            this.dtOcorrencia.setValue(null);
            this.tfAnimal.clear();
            this.tfQtdeAnimal.clear();
        }
    }

    @FXML
    private void handleBtnSalvar(ActionEvent event) {
        if (!this.verificaDadosObrigatorios()) {
            JOptionPane.showMessageDialog(null,"CAMPOS DA ABA ANIMAIS",
                    "OS SEGINTES CAMPOS SÃO DE PREENCHIMENTO OBRIGATÓRIO:",JOptionPane.ERROR_MESSAGE);
        } else {
            Queixa queixa = HealthWatcherApp.qxAtual;
            QueixaAnimal qa = this.preencheDadosQueixa();
            qa.setQueixa(queixa);
            QueixaAnimalControle qaCtr = new QueixaAnimalControle();
            try {
                qaCtr.cadastrarQueixaAnimal(qa);
                JOptionPane.showMessageDialog(null,"ACOMPANHE SUAS QUEIXAS PELO NUMERO: " + qaCtr.obtenNextValID(),
                        "DADOS DA QUEIXA SALVOS COM SUCESSO!!!", JOptionPane.ERROR_MESSAGE);
                QueixaAnimalApp.myStage.close();
            }catch(Exception ex) {
                Logger.getLogger(QueixaalimentarController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean verificaDadosObrigatorios() {
        boolean ret = true;
        if (this.dtOcorrencia.getValue() == null) {
            ret = false;
        } if ( this.tfAnimal.getText().isEmpty()) {
            ret = false;
        } if (this.tfQtdeAnimal.getText().isEmpty()) {
            ret = false;
        }
        return ret;
    }

    private QueixaAnimal preencheDadosQueixa() {
        QueixaAnimal qa = new QueixaAnimal();
        qa.setDataIncomodo(this.dtOcorrencia.getValue().toString());
        qa.setQtdeAnimais(Integer.parseInt(this.tfQtdeAnimal.getText()));
        qa.setTipoAnimal(this.tfAnimal.getText());
        qa.setVitimaBairro(this.tfBairro.getText());
        qa.setVitimaCep(this.tfCEP.getText());
        qa.setVitimaCidade(this.tfCidade.getText());
        qa.setVitimaEstado(this.cbEstado.getValue());
        if (this.tfNum.getText().isEmpty()) {
            qa.setVitimaNum(0);
        } else {
            qa.setVitimaNum(Integer.parseInt(this.tfNum.getText()));
        }
        qa.setVitimaRua(this.tfRua.getText());
        qa.setVitimaTelefone(this.tfTelefone.getText());
        return qa;
    }

}
