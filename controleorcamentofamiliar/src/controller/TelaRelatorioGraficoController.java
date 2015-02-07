/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DespesasMensal;
import model.ReceitaMensal;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import util.ControlledScreen;
import util.ScreensController;

/**
 * FXML Controller class
 *
 * @author Marcio e Polliny
 */
public class TelaRelatorioGraficoController implements Initializable, ControlledScreen {

    ScreensController myController = new ScreensController();
    @FXML
    private PieChart grafico;
    private HashMap<String,DespesasMensal> despMensal;
    private HashMap<String,ReceitaMensal> recMensal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    
    private void carregaDadosGrafico() {
        despMensal = EntradaDespesasController.mapaDespesas;
        recMensal = EntradaReceitasController.receitas;
    }

}
