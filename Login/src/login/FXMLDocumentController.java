/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author marcio e polliny
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField txfUsuario;
    @FXML
    private PasswordField psfSenha;
    @FXML
    private Button BtnCancelar;
    @FXML
    private Button btnConfirmar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handerBtnConfirmar(ActionEvent event) {
        if(this.txfUsuario.getText().equalsIgnoreCase("Marcio")) {
            
        }else {
            
        }
    }

    @FXML
    private void handleBtnCancelar(ActionEvent event) {
        Login.myStage.close();
    }
    
}
