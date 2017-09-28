/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import healthwatcher.Consultas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

/**
 * FXML Controller class
 *
 * @author marcio e polliny
 */
public class ConsultasController implements Initializable {
    @FXML
    private Button btnGuia;
    @FXML
    private Button btnQueixas;
    @FXML
    private Button btnDoenaas;
    @FXML
    private Button btnSair;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtnGuia(ActionEvent event) {
    }

    @FXML
    private void HandleBtnqueixas(ActionEvent event) {
        
    }

    @FXML
    private void handleBnDoencas(ActionEvent event) {
    }

    @FXML
    private void hndleBtnSair(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Sair da página");
        alert.setHeaderText("Você está prestes a deixar esta janela!!!");
        alert.setContentText("Desej confirmar?");
        alert.showAndWait();
        //System.out.println(btn.getButtonData().isCancelButton())
            Consultas.myStage.close();
    }
    
}
