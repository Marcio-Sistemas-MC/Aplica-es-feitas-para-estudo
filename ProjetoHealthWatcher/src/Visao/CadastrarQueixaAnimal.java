package Visao;

import Controle.Banco.QueixaAnimalControle;
import Modelo.QueixaAnimal;
import java.net.URL;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class CadastrarQueixaAnimal implements Initializable {

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
    private TextField tfAnimal;
    @FXML
    private TextField tfQtdeAnimal;
    @FXML
    private DatePicker dtOcorrencia;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnLimpar;

    /* private void b_cadastrarActionPerformed(ActionEvent evt) {

     if (tipoAnimal.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Campo tipo animal esta vazio", "Erro de validacao", JOptionPane.ERROR_MESSAGE);
     } else if (qtdAnimal.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Campo quantidade animal esta vazio", "Erro de validacao", JOptionPane.ERROR_MESSAGE);
     } else if (dtIncomodo.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Campo data incomodo esta vazio", "Erro de validacao", JOptionPane.ERROR_MESSAGE);
     } else if (endOcorrencia.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Campo endereco de ocorrencia esta vazio", "Erro de validacao", JOptionPane.ERROR_MESSAGE);
     } else if (codigo.isEmpty()) {
     JOptionPane.showMessageDialog(null, "Campo codigo esta vazio", "Erro de validacao", JOptionPane.ERROR_MESSAGE);

     } else {
     QueixaAnimal A = new QueixaAnimal();
     A.setTipoAnimal(tipoAnimal);
     A.setQtdAnimal(Integer.parseInt(qtdAnimal));
     A.setDataIncomodo(dtIncomodo);
     A.setEndereco(endOcorrencia);
     A.setCodigo(codigo);

     try {
     QueixaAnimalControle ac = new QueixaAnimalControle();
     ac.cadastrarQueixaAnimal(A);
     } catch (SQLException se) {
     JOptionPane.showMessageDialog(null, "O seguinte erro ocorreu: " + se.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
     } catch (Exception ex) {
     JOptionPane.showMessageDialog(null, "O seguinte erro ocorreu: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
     }

     }

     }*/
    @FXML
    private void handleBtnSalvar(ActionEvent event) {
       /* QueixaAnimal A = new QueixaAnimal();
        A.setTipoAnimal(this.tfAnimal.getText());
        A.setQtdAnimal(Integer.parseInt(this.tfQtdeAnimal.getText()));
        System.out.println(this.dtOcorrencia.getPromptText());
        A.setDataIncomodo(this.dtOcorrencia.getPromptText());
        A.setEndereco(this.tfRua.getText() + " " + this.tfNum.getText());
        A.setCodigo("0");
        try {
            QueixaAnimalControle ac = new QueixaAnimalControle();
            ac.cadastrarQueixaAnimal(A);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "O seguinte erro ocorreu: " + se.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "O seguinte erro ocorreu: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }*/
    }

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
