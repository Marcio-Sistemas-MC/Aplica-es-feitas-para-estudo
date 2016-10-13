package healthwatcher.controller;

import banco.controle.LoginControle;
import banco.entidades.Login;
import banco.entidades.Usuario;
import healthwatcher.HealthWatcherApp;
import healthwatcher.LoginApp;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginController implements Initializable {

    @FXML
    private TextField txtLogin;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Button btnLogar;
    @FXML
    private Button btnLimpar;
    @FXML
    private Pane painelInicial;
    @FXML
    private ImageView imgCidadao;
    @FXML
    private ImageView imgFuncionario;

    @FXML
    private void b_limparActionPerformed(ActionEvent evt) {
        txtLogin.clear();
        txtSenha.clear();
        txtLogin.requestFocus();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void b_loginActionPerformed(ActionEvent event) {
        String Login = txtLogin.getText();
        System.out.println(txtLogin.getText());
        String senha = txtSenha.getText();
        try {
            int cont = 0;
            LoginControle lc = new LoginControle();
            ArrayList<Login> Array = lc.buscarLoginSenha();
            System.out.println("Conectou");
            for (Login l : Array) {
                if (l.getLogin().equalsIgnoreCase(Login) && l.getSenha().equalsIgnoreCase(senha)) {
                    System.out.println(l.getLogin() + "Logado ");
                    this.b_limparActionPerformed(event);
                    Usuario u = new Usuario(l.getLogin());
                    HealthWatcherApp.logado = u;
                    LoginApp.myStage.close();
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

    private void redimensionar(ImageView img, int i) {
        if (i == 0) {
            img.setScaleX(img.getScaleX() - 0.2);
            img.setScaleY(img.getScaleY() - 0.2);
        } else {
            img.setScaleX(img.getScaleX() + 0.2);
            img.setScaleY(img.getScaleY() + 0.2);
        }
    }

    @FXML
    private void imgFocusExit(MouseEvent event) {
        ImageView img = (ImageView) event.getTarget();
        redimensionar(img, 0);
    }

    @FXML
    private void imgFocus(MouseEvent event) {
        ImageView img = (ImageView) event.getTarget();
        redimensionar(img, 1);
    }

    @FXML
    private void hanldeImgCidado(MouseEvent event) throws Exception {
        this.redimensionar(imgCidadao, 0);
        Usuario u = new Usuario();
        u.setNome("Cidadão");
        HealthWatcherApp.logado = u;
        new HealthWatcherApp().start(new Stage());
        LoginApp.myStage.close();
    }

    @FXML
    private void handleImgFuncionario(MouseEvent event) {
        this.redimensionar(this.imgFuncionario, 0);
        this.painelInicial.setVisible(false);
    }

}
