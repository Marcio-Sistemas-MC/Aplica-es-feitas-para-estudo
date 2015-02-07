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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
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

    @FXML
    private ComboBox seletorMes;
    private HashMap<String, DespesasMensal> despMensal;
    private HashMap<String, ReceitaMensal> recMensal;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configuraSeletorMes();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    private void carregaDadosGrafico() {
        despMensal = EntradaDespesasController.mapaDespesas;
        recMensal = EntradaReceitasController.receitas;
        grafico.setData(FXCollections.observableArrayList(
                new PieChart.Data("Receitas",recMensal.get(seletorMes.getPromptText()).somaReceitas()),
                new PieChart.Data("Moradia", despMensal.get(seletorMes.getPromptText()).getDespesaMoradia().somaDespesasMoradia()),
                new PieChart.Data("Alimentação", despMensal.get(seletorMes.getPromptText()).getDespesaAlimentacao().somaDespesasAlimentacao()),
                new PieChart.Data("Lazer", despMensal.get(seletorMes.getPromptText()).getDespasaLazer().somaDespesasLazer()),
                new PieChart.Data("Bancárias", despMensal.get(seletorMes.getPromptText()).getDespesaBancaria().somaDespesasBancarias()),
                new PieChart.Data("Saúde", despMensal.get(seletorMes.getPromptText()).getDespesaSaude().somaDespesasSaude()),
                new PieChart.Data("Transporte", despMensal.get(seletorMes.getPromptText()).getDespesaTransporte().somaDespesasTranspote()),
                new PieChart.Data("Vestuário", despMensal.get(seletorMes.getPromptText()).getDespesaVestuario().somaDespesasVestuario()),
                new PieChart.Data("Educação", despMensal.get(seletorMes.getPromptText()).getDespesaaEducacao().somaDespesasEducacao()),
                new PieChart.Data("Outros \n Gastos", despMensal.get(seletorMes.getPromptText()).getDespesaOutros().somaDespesasOutrosGastos())
        ));
        grafico.setTitle("Demonstração Resultados do mês " + seletorMes.getPromptText());
    }

    private void configuraSeletorMes() {
        seletorMes.setPromptText("SELECIONE O MÊS");
        seletorMes.getItems().addAll("JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL",
                "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO");
        seletorMes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                seletorMes.setPromptText(newValue);
                carregaDadosGrafico();
            }
        });
        seletorMes.setEditable(true);
    }

}
