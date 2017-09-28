/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import healthwatcher.Consultas;
import healthwatcher.HealthWatcherApp;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;
import healthwatcher.LoginApp;
import healthwatcher.QueixaAlimentarApp;
import healthwatcher.QueixaAnimalApp;
import healthwatcher.QueixaDiversaApp;
import healthwatcher.ReclamanteApp;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Danielle
 */
public class principalController implements Initializable {
    private HBox hbMenu;
    @FXML
    private Button btnLogin;
    @FXML
    private Button btnSair;
    @FXML
    private MenuBar barraMenu;
    @FXML
    private Button btCadastroQueixas;
    @FXML
    private Button btnConsultas;
    @FXML
    private AnchorPane painel;
    @FXML
    private MenuItem mnQxaAlimentar;
    @FXML
    private MenuItem mnQxaAnimal;
    @FXML
    private MenuItem mnQxaDiversa;
    @FXML
    private MenuItem mnUnidadeSaude;
    @FXML
    private MenuItem mnEspecialidades;
    @FXML
    private MenuItem mnConsQueixaAlimentar;
    @FXML
    private MenuItem mnConsQueixaAnimal;
    @FXML
    private MenuItem mnConsQueixaDiversa;
    @FXML
    private MenuItem mnConsDoencas;
    @FXML
    private ImageView imgFundo;
    @FXML
    private Label usuarioLogado;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.usuarioLogado.setText(HealthWatcherApp.logado.getNome().toUpperCase());
       this.btCadastroQueixas.setText("Cadastrar \n Queixas".toUpperCase());
       this.btnConsultas.setText("CONSULTAR \n QUEIXAS");
       //redimensionar();
    }    
    
    private void redimensionar() {
        if(HealthWatcherApp.myStage.isMaximized()) {
            this.imgFundo.setFitHeight(HealthWatcherApp.myStage.getHeight());
        }
        /*this.painel.prefHeightProperty().bind(HealthWatcherApp.myStage.getScene().heightProperty());
        this.painel.prefWidthProperty().bind(HealthWatcherApp.myStage.getScene().widthProperty());
        this.barraMenu.prefHeightProperty().bind(HealthWatcherApp.myStage.getScene().heightProperty());
        this.barraMenu.prefWidthProperty().bind(HealthWatcherApp.myStage.getScene().widthProperty());
        this.hbMenu.prefHeightProperty().bind(HealthWatcherApp.myStage.getScene().heightProperty());
        this.hbMenu.prefWidthProperty().bind(HealthWatcherApp.myStage.getScene().widthProperty());*/
    }

    @FXML
    private void handleBtnLogin(ActionEvent event) throws Exception {
        new LoginApp().start(new Stage());
    }

    @FXML
    private void handleBtnSair(ActionEvent event) {
        HealthWatcherApp.myStage.close();
    }

    @FXML
    private void handleBtnCadastrarQueixas(ActionEvent event) throws Exception {
        //new QueixaApp().start(new Stage());
        new ReclamanteApp().start(new Stage());
    }

    @FXML
    private void handleBtnConsultas(ActionEvent event) throws Exception {
       // new ConsultaQueixaAlimentarApp().start(new Stage());
        new Consultas().start(new Stage());
    }

    @FXML
    private void handleMnQxaAlimentar(ActionEvent event) throws Exception {
        new QueixaAlimentarApp().start(new Stage());
    }

    @FXML
    private void handleMnQxaAnimal(ActionEvent event) throws Exception {
        new QueixaAnimalApp().start(new Stage());
    }

    @FXML
    private void handleQxaDiversa(ActionEvent event) throws Exception {
        new QueixaDiversaApp().start(new Stage());
    }

    @FXML
    private void handleMnUnidadeSaude(ActionEvent event) {
        Informacao();
    }

    @FXML
    private void hanldeMnEspecialidades(ActionEvent event) {
        Informacao();
    }

    @FXML
    private void handleMnConsQueixaAlimentar(ActionEvent event) {
    }

    @FXML
    private void hanldeMnConsQueixaAnimal(ActionEvent event) {
    }

    @FXML
    private void handleMnConsQueixaDiversa(ActionEvent event) {
    }

    @FXML
    private void handleMnConsDoencas(ActionEvent event) {
        Informacao();
    }
    
    private void Informacao() {
        Alert al = new Alert(AlertType.INFORMATION);
        al.setContentText("Recurso ainda não implementado!!!");
        al.setHeaderText("Atenção!!!");
        al.show();
    }
    
}
