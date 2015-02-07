/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import contoleorcamentofamiliar.Contoleorcamentofamiliar;
import util.ScreensController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import util.ControlledScreen;

/**
 *
 * @author Marcio e Polliny
 */
public class TelaInicioController implements Initializable,ControlledScreen {
    
    ScreensController myController = new ScreensController();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleBotaoReceitas(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaReceitas);
    }
    
    @FXML
    private void handleBotaoDespesas(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaDespesas);
    }
    
    @FXML
    private void handleBoatoInvetimento(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaInvestimentos);
    }
    
    @FXML
    private void handleBotaoRelatorioGastoMensal(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaRelatorio);
    }
    
    @FXML
    private void handleBotaoRelatorioGrafico(ActionEvent ev){
        myController.setScreen(Contoleorcamentofamiliar.telaRelatorioGrafico);
    }
    
    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    
}
