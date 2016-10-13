/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import banco.controle.ReclamanteControle;
import banco.entidades.Reclamante;
import healthwatcher.HealthWatcherApp;
import healthwatcher.QueixaApp;
import healthwatcher.ReclamanteApp;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Danielle
 */
public class ReclamanteController implements Initializable {

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
    private Button btnCancelar;
    @FXML
    private Button btnContinuar;
    @FXML
    private CheckBox ckIdentificar;
    @FXML
    private GridPane grid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> estados = FXCollections.observableArrayList(
                "SELECIONE UM ESTADO","AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "SC", "SP", "SE", "TO");
        this.cbEstado.getItems().addAll(estados);
        this.cbEstado.setValue("SELECIONE UM ESTADO");
    }

    @FXML
    private void handleBtnCancelar(ActionEvent event) {
        ReclamanteApp.myStage.close();
    }

    @FXML
    private void handleBtnContinuar(ActionEvent event) throws Exception {
        if (!this.ckIdentificar.isSelected()) {
            Reclamante rec = this.carregaDadosReclamante();
            ReclamanteControle rcCtr = new ReclamanteControle();
            try {
                rcCtr.cadastrarReclamante(rec);
                int idAtual = rcCtr.obtemCurrenttValID();
                rec.setId(idAtual);
                HealthWatcherApp.RclAtual = rec;
            } catch (SQLException ex) {
                Logger.getLogger(ReclamanteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            new QueixaApp().start(new Stage());
            ReclamanteApp.myStage.close();
        }

    }

    private Reclamante carregaDadosReclamante() {
        Reclamante rec = new Reclamante();
        rec.setNome(this.tfNome.getText());
        rec.setEnderecoRua(this.tfRua.getText());
        if (this.tfNum.getText().isEmpty()) {
            rec.setEnderecoNum(0);
        } else {
            rec.setEnderecoNum(Integer.parseInt(this.tfNum.getText()));
        }
        rec.setEnderecpoBairro(this.tfBairro.getText());
        rec.setEnderecoComplemento(this.tfComp.getText());
        rec.setEnderecoCidade(this.tfCidade.getText());
        rec.setEnderecoCEP(this.tfCEP.getText());
        rec.setEnderecoEstado(this.cbEstado.getValue());
        rec.setEnderecoTelefone(this.tfTelefone.getText());
        rec.setEmail(this.tfEmail.getText());
        return rec;
    }

    @FXML
    private void handlecheckIdentificar(ActionEvent event) {
        if(this.ckIdentificar.isSelected()) {
            this.grid.setDisable(true);
        }else {
            this.grid.setDisable(false);
        }
    }

}
