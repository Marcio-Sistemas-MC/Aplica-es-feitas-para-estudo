/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visao.ProjetoHealthWatcher;
import Visao.QueixaAlimentarApp;
import Visao.QueixaAnimalApp;
import Visao.QueixaDiversaApp;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 *
 */
public class HealthWatcherController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private final ToggleGroup tg = new ToggleGroup();
    @FXML
    private Button btnVoltar;
    @FXML
    private RadioButton rbtnAlimentar;
    @FXML
    private RadioButton rbtnAnimal;
    @FXML
    private RadioButton rbtnDiversa;
    @FXML
    private Button btnProsseguir;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.rbtnAlimentar.setToggleGroup(tg);
        this.rbtnAnimal.setToggleGroup(tg);
        this.rbtnDiversa.setToggleGroup(tg);
        this.rbtnAlimentar.setSelected(true);
    }

    @FXML
    private void handleBtnVoltar(ActionEvent event) {
        System.out.println("Clicou em Voltar");
        ProjetoHealthWatcher.myStage.close();
    }

    @FXML
    private void handleBtnProsseguir(ActionEvent event) {
        try {
            Stage stg = new Stage();
            if (this.rbtnAlimentar.isSelected()) {
                new QueixaAlimentarApp().start(stg);
            } else if (this.rbtnAnimal.isSelected()) {
                new QueixaAnimalApp().start(stg);
            } else if (this.rbtnDiversa.isSelected()) {
                new QueixaDiversaApp().start(stg);
            } else {
                System.out.println("Selecione um item");
            }
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }

    }

}
