/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controleorcamentofamiliar.Contoleorcamentofamiliar;
import model.InvestimentoMensal;
import util.ScreensController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class EntradaInvestimentoController implements Initializable, ControlledScreen {

    ScreensController myController = new ScreensController();
    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField finanCasaPrevisto;
    @FXML
    private TextField finanCasaEfetivado;
    @FXML
    private TextField aplicacaoPrevisto;
    @FXML
    private TextField aplicacaoEfetivado;
    @FXML
    private TextField resImpostosPrevisto;
    @FXML
    private TextField resImpostoEfetivado;
    @FXML
    private TextField resUniversidadePrevisto;
    @FXML
    private TextField resUniversidadeEfetivado;
    @FXML
    private TextField resViagemPrevisto;
    @FXML
    private TextField resViagemEfetivado;
    @FXML
    private TextField resOutrosPrervisto;
    @FXML
    private TextField resOutrosEfetivado;
    @FXML
    private ComboBox<String> seletorMes;
    @FXML
    private ToggleButton desabilita;

    private boolean desabilitado = false;
    private InvestimentoMensal investimento;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configuraSeletorMes();
    }

    @FXML
    private void HandleButtonVoltarInicio(ActionEvent event) {
        myController.setScreen(Contoleorcamentofamiliar.telaPrincipal);
    }

    @FXML
    private void handleButtonDesativarPrevisao(ActionEvent event) {
        if (!desabilitado) {
            this.desabilitaPrevisao();
            desabilita.setText("HABILITAR PREVISÃO");
            desabilitado = true;
        } else {
            this.habilitaPrevisao();
            desabilita.setText("DESABILITAR PREVISÃO");
            desabilitado = false;
        }
    }

    @FXML
    private void HandleButtonEntrarDados(ActionEvent event) {
        investimento = new InvestimentoMensal();
        try {
            investimento.setAplicacaoFinanceiraEfetivado(Double.parseDouble(this.aplicacaoEfetivado.getText()));
            investimento.setFinanciamentoCasaEfetivado(Double.parseDouble(this.finanCasaEfetivado.getText()));
            investimento.setResImpostoEfetivado(Double.parseDouble(this.resImpostoEfetivado.getText()));
            investimento.setResOutrosEfetivado(Double.parseDouble(this.resOutrosEfetivado.getText()));
            investimento.setResUniversidadeEfetivado(Double.parseDouble(this.resUniversidadeEfetivado.getText()));
            investimento.setResViagemEfetivado(Double.parseDouble(this.resViagemEfetivado.getText()));
            if (!desabilitado) {
                investimento.setAplicacaoFinanceiraPrevisto(Double.parseDouble(this.aplicacaoPrevisto.getText()));
                investimento.setFinanciamentoCasaPrevisto(Double.parseDouble(this.finanCasaPrevisto.getText()));
                investimento.setResImpostoPrevisto(Double.parseDouble(this.resImpostosPrevisto.getText()));
                investimento.setResOutrosPrevisto(Double.parseDouble(this.resOutrosPrervisto.getText()));
                investimento.setResUniversidadePrevisto(Double.parseDouble(this.resUniversidadePrevisto.getText()));
                investimento.setResViagemPrevisto(Double.parseDouble(this.resViagemPrevisto.getText()));
            }
            if (seletorMes.getPromptText().equalsIgnoreCase("Selecione o mês")) {
                JOptionPane.showMessageDialog(null, "Selecione o mês de referência...");
            } else {
                investimento.setMesExercicio(seletorMes.getPromptText());
                investimento.gravarDados();
                resetEntradas();
                JOptionPane.showMessageDialog(null, "INVESTIMENTO INSERIDO COM SUCESSO.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entre com os daods no formato correto\n coloque um ponto separando os centavos...");
        }

    }

    private void resetEntradas() {
        this.aplicacaoEfetivado.clear();
        this.aplicacaoPrevisto.clear();
        this.finanCasaEfetivado.clear();
        this.finanCasaPrevisto.clear();
        this.resImpostoEfetivado.clear();
        this.resImpostosPrevisto.clear();
        this.resOutrosEfetivado.clear();
        this.resOutrosPrervisto.clear();
        this.resUniversidadeEfetivado.clear();
        this.resUniversidadePrevisto.clear();
        this.resViagemEfetivado.clear();
        this.resViagemPrevisto.clear();
        seletorMes.setPromptText("SELECIONE O MÊS");
    }

    private void entrarDadosMes() {
        if (seletorMes.getPromptText().equalsIgnoreCase("Selecione o mês")) {
            JOptionPane.showMessageDialog(null, "Selecione o mês de referência...");
        } else {
            investimento.setMesExercicio(seletorMes.getPromptText());
        }
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

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    private void desabilitaPrevisao() {
        this.aplicacaoPrevisto.setDisable(true);
        this.finanCasaPrevisto.setDisable(true);
        this.resImpostosPrevisto.setDisable(true);
        this.resOutrosPrervisto.setDisable(true);
        this.resUniversidadePrevisto.setDisable(true);
        this.resViagemPrevisto.setDisable(true);
    }

    private void habilitaPrevisao() {
        this.aplicacaoPrevisto.setDisable(false);
        this.finanCasaPrevisto.setDisable(false);
        this.resImpostosPrevisto.setDisable(false);
        this.resOutrosPrervisto.setDisable(false);
        this.resUniversidadePrevisto.setDisable(false);
        this.resViagemPrevisto.setDisable(false);
    }

}
