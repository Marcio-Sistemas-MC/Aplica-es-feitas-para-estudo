package Visao;


import Controle.Banco.LoginControle;
import Modelo.login;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class InicialLogin implements Initializable {

    @FXML
    private TextField txtLogin;
    @FXML
    private PasswordField txtSenha;

    @FXML
    private void b_loginActionPerformed(ActionEvent evt) {
        String login = txtLogin.getText();
        System.out.println(txtLogin.getText());
        String senha = txtSenha.getText();
        try {
            int cont = 0;
            LoginControle lc = new LoginControle();
            ArrayList<login> Array = lc.buscarLoginSenha();
            System.out.println("Conectou");
            for (login l : Array) {
                if (l.getLogin().equalsIgnoreCase(login) && l.getSenha().equalsIgnoreCase(senha)) {
                    System.out.println(l.getLogin() + "Logado ");
                    this.b_limparActionPerformed(evt);
                    new HealthWatcherApp().start(new Stage());
                    //new QueixaDiversaApp().start(new Stage());
                    ProjetoHealthWatcher.myStage.close();
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O seguinte erro ocorreu: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    private void b_limparActionPerformed(ActionEvent evt) {
        txtLogin.clear();
        txtSenha.clear();
        txtLogin.requestFocus();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
