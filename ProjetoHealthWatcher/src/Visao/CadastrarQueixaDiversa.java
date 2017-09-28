package Visao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CadastrarQueixaDiversa implements Initializable {
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
    private ComboBox<?> cbEstado;
    @FXML
    private TextField tfCEP;
    @FXML
    private TextField tfTelefone;
    @FXML
    private TextField tfEmail;
    @FXML
    private TextArea taDescricao;
    @FXML
    private TextArea taObservacao;
    @FXML
    private TextField tfSituacao;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnLimpar;

  

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @FXML
    private void handleBtnSalvar(ActionEvent event) {
    }

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
    }
}
