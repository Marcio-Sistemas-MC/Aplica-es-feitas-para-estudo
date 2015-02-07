/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controleorcamentofamiliar.Contoleorcamentofamiliar;
import model.DespesasMensal;
import model.ReceitaMensal;
import util.ScreensController;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import util.ControlledScreen;

/**
 * FXML Controller class
 *
 * @author Marcio e Polliny
 */
public class TelaRelatorioController implements Initializable, ControlledScreen {

    ScreensController myController = new ScreensController();

    @FXML
    private ComboBox<String> seletorMes;
    @FXML
    private Label receita;
    @FXML
    private Label despMoradia;
    @FXML
    private Label despAlimentacao;
    @FXML
    private Label despVestuario;
    @FXML
    private Label despTransporte;
    @FXML
    private Label despSaude;
    @FXML
    private Label despEducacao;
    @FXML
    private Label despLazer;
    @FXML
    private Label despOutGastos;
    @FXML
    private Label despBancarias;
    @FXML
    private Label subtotal;
    @FXML
    private Label resultadoFinal;
    @FXML
    private Label mesMsg;
    
    private HashMap<String, DespesasMensal> despesas;
    private HashMap<String, ReceitaMensal> receitas;
    private ReceitaMensal receitaMensal;
    private DespesasMensal despesaMensal;
    private ArrayList<String> meses = new ArrayList<>();
    
    private void configuraSeletorMes() {
        seletorMes.setPromptText("SELECIONE O MÊS");
        seletorMes.getItems().addAll("JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL",
                "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO");
        seletorMes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                seletorMes.setPromptText(newValue);
                carregaDados(newValue);
            }
        });
        seletorMes.setEditable(true);
    }

    private void carregaDados(String mes) {
        this.despesas = EntradaDespesasController.mapaDespesas;
        this.despesaMensal = despesas.get(mes);
        this.receitas = EntradaReceitasController.receitas;
        this.receitaMensal = receitas.get(mes);
        
        this.receita.setText(String.valueOf(receitaMensal.somaReceitas()));
        this.despAlimentacao.setText(String.valueOf(despesaMensal.getDespesaAlimentacao().somaDespesasAlimentacao()));
        this.despBancarias.setText(String.valueOf(despesaMensal.getDespesaBancaria().somaDespesasBancarias()));
        this.despEducacao.setText(String.valueOf(despesaMensal.getDespesaaEducacao().somaDespesasEducacao()));
        this.despLazer.setText(String.valueOf(despesaMensal.getDespasaLazer().somaDespesasLazer()));
        this.despMoradia.setText(String.valueOf(despesaMensal.getDespesaMoradia().somaDespesasMoradia()));
        this.despOutGastos.setText(String.valueOf(despesaMensal.getDespesaOutros().somaDespesasOutrosGastos()));
        this.despSaude.setText(String.valueOf(despesaMensal.getDespesaSaude().somaDespesasSaude()));
        this.despTransporte.setText(String.valueOf(despesaMensal.getDespesaTransporte().somaDespesasTranspote()));
        this.despVestuario.setText(String.valueOf(despesaMensal.getDespesaVestuario().somaDespesasVestuario()));
        this.subtotal.setText(String.valueOf(despesaMensal.somaDespesaMensal()));
        this.resultadoFinal.setText(String.valueOf(receitaMensal.somaReceitas() - despesaMensal.somaDespesaMensal()));
    }
    
    @FXML
    private void handleBotaoVoltarInicio(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaPrincipal);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configuraSeletorMes();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

}
