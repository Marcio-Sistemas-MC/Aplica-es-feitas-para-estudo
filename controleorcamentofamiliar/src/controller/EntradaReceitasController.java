/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controleorcamentofamiliar.Contoleorcamentofamiliar;
import model.ReceitaMensal;
import util.ScreensController;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javax.swing.JOptionPane;
import util.ControlledScreen;

/**
 * FXML Controller class
 *
 * @author Marcio e Polliny
 */
public class EntradaReceitasController implements Initializable, ControlledScreen {

    ScreensController myController = new ScreensController();

    @FXML
    private TextField salPrevisto;
    @FXML
    private TextField salRecebido;
    @FXML
    private TextField extPrevisto;
    @FXML
    private TextField extRecebido;
    @FXML
    private TextField outPrevisto;
    @FXML
    private TextField outRecebido;
    @FXML
    private ToggleButton ativaDesativa;
    @FXML
    private Button entradados;
    @FXML
    private ComboBox<String> seletorMes;

    private boolean desabilitado = false;
    //private ReceitaMensal receitaEntrada;
    public static HashMap<String, ReceitaMensal> receitas = new HashMap<>();

    @FXML
    private void handleButtonDesativarPrevisao(ActionEvent ev) {
        if (!desabilitado) {
            this.salPrevisto.setDisable(true);
            this.outPrevisto.setDisable(true);
            this.extPrevisto.setDisable(true);
            this.ativaDesativa.setText("HABILITAR PREVISÃO");
            desabilitado = true;
        } else {
            this.salPrevisto.setDisable(false);
            this.outPrevisto.setDisable(false);
            this.extPrevisto.setDisable(false);
            this.ativaDesativa.setText("DESABILITAR PREVISÃO");
            desabilitado = false;
        }
    }

    @FXML
    private void HandleButtonEntrarDados(ActionEvent ev) {
        ReceitaMensal receitaEntrada = new ReceitaMensal();

        try {
            if (!desabilitado) {
                receitaEntrada.setSalarioPrevisto(Double.parseDouble(this.salPrevisto.getText()));
                receitaEntrada.setExtrasPrevisto(Double.parseDouble(this.extPrevisto.getText()));
                receitaEntrada.setOutroPrevisto(Double.parseDouble(this.outPrevisto.getText()));
            }
            receitaEntrada.setSalárioRecebido(Double.parseDouble(this.salRecebido.getText()));
            receitaEntrada.setExtraRecebido(Double.parseDouble(this.extRecebido.getText()));
            receitaEntrada.setOutroRecebido(Double.parseDouble(this.outRecebido.getText()));
            if (seletorMes.getPromptText().equalsIgnoreCase("Selecione o mês")) {
                JOptionPane.showMessageDialog(null, "Selecione o mês de referência...");
            } else {
                receitaEntrada.setMesExercicio(this.seletorMes.getPromptText());
                receitaEntrada.gravarDados();
                receitas.put(seletorMes.getPromptText(), receitaEntrada);
                resetEntradas();
                JOptionPane.showMessageDialog(null, "RECEITA INSERIDA COM SUCESSO.");
                this.HandleButtonVoltarInicio(ev);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entre como os dados no formato 0.00\n Com um ponto separando os centavos.");
        }
    }

    private void resetEntradas() {
        this.outRecebido.clear();
        this.extRecebido.clear();
        this.salRecebido.clear();
        this.seletorMes.setPromptText("SELECIONE O MÊS");
    }

    @FXML
    private void HandleButtonVoltarInicio(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaPrincipal);
    }

    private void configuraSeletorMes() {
        seletorMes.setPromptText("SELECIONE O MÊS");
        seletorMes.getItems().addAll("JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL",
                "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO");
        seletorMes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                seletorMes.setPromptText(newValue);
            }
        });
        seletorMes.setEditable(true);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configuraSeletorMes();
        this.handleButtonDesativarPrevisao(new ActionEvent());
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

}
