/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controleorcamentofamiliar.Contoleorcamentofamiliar;
import static controller.EntradaDespesasController.despesaMensal;
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
import model.DespMoradiaMensal;
import util.ControlledScreen;
import util.ScreensController;

/**
 * FXML Controller class
 *
 * @author Marcio e Polliny
 */
public class TelaDespesaMoradiaController implements Initializable, ControlledScreen {

    private ScreensController myController = new ScreensController();

    @FXML
    private TextField aluguelPrevisto;
    @FXML
    private TextField aluguelEfetivado;
    @FXML
    private TextField condominoPrevisto;
    @FXML
    private TextField condominioEfetivado;
    @FXML
    private TextField presCasaPrevisto;
    @FXML
    private TextField presCasaEfetivado;
    @FXML
    private TextField luzPrevisto;
    @FXML
    private TextField luzEfetivado;
    @FXML
    private TextField aguaPrevisto;
    @FXML
    private TextField aguaEfetivado;
    @FXML
    private TextField gasPrevisto;
    @FXML
    private TextField gasEfetivado;
    @FXML
    private TextField impostoPrevisto;
    @FXML
    private TextField impostoEfetivado;
    @FXML
    private TextField telefonePrevisto;
    @FXML
    private TextField telefoneEfetivado;
    @FXML
    private TextField consManuPrevisto;
    @FXML
    private TextField consManuEfetivado;
    @FXML
    private TextField outroPrevisto;
    @FXML
    private TextField outroEfetivado;
    @FXML
    private ToggleButton desabilita;

    public static DespMoradiaMensal despesamoradia;

    boolean desabilitado = false;
    @FXML
    private ComboBox<String> seletorMes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.configuraSeletorMes();
       this.handleButtonDesativarPrevisao(new ActionEvent());
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

    @FXML
    private void handleButtonDesativarPrevisao(ActionEvent ev) {
        if (!desabilitado) {
            this.deabilitaMoradia();
            desabilita.setText("HABILITAR PREVISÃO");
            desabilitado = true;
        } else {
            this.habilitaMoradia();
            desabilita.setText("DESABILITAR PREVISÃO");
            desabilitado = false;
        }
    }

    @FXML
    private void handleButtonVoltarInicio(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaPrincipal);
    }

    private void entrarDadosMoradia() {
        try {
            despesamoradia.setAluguelefetivado(Double.parseDouble(this.aluguelEfetivado.getText()));
            despesamoradia.setCondominioEfetivado(Double.parseDouble(this.condominioEfetivado.getText()));
            despesamoradia.setPrestacaoEfetivado(Double.parseDouble(this.presCasaEfetivado.getText()));
            despesamoradia.setLuzEfetivado(Double.parseDouble(this.luzEfetivado.getText()));
            despesamoradia.setAguaEfetivado(Double.parseDouble(this.aguaEfetivado.getText()));
            despesamoradia.setGasEfetivado(Double.parseDouble(this.gasEfetivado.getText()));
            despesamoradia.setImpostoEfetivado(Double.parseDouble(this.impostoEfetivado.getText()));
            despesamoradia.setTelefoneEfetivado(Double.parseDouble(this.telefoneEfetivado.getText()));
            despesamoradia.setConsertosEfetivados(Double.parseDouble(this.consManuEfetivado.getText()));
            despesamoradia.setOutrosEfetivado(Double.parseDouble(this.outroEfetivado.getText()));
            if (!desabilitado) {
                despesamoradia.setAguaPrevisto(Double.parseDouble(this.aluguelPrevisto.getText()));
                despesamoradia.setCondominioPrevisto(Double.parseDouble(this.condominoPrevisto.getText()));
                despesamoradia.setPrestacaoPrevisto(Double.parseDouble(this.presCasaPrevisto.getText()));
                despesamoradia.setLuzPrevisto(Double.parseDouble(this.luzPrevisto.getText()));
                despesamoradia.setAguaPrevisto(Double.parseDouble(this.aguaPrevisto.getText()));
                despesamoradia.setGasPrevisto(Double.parseDouble(this.gasPrevisto.getText()));
                despesamoradia.setImpostoPrevisto(Double.parseDouble(this.impostoPrevisto.getText()));
                despesamoradia.setTelefonePrevisto(Double.parseDouble(this.telefonePrevisto.getText()));
                despesamoradia.setConsertosPrevisto(Double.parseDouble(this.consManuPrevisto.getText()));
                despesamoradia.setOutrosPrevisto(Double.parseDouble(this.outroPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: MORADIA\nEntre com /'0/' nos campos em que não houveram despesas"
                    + "\nEntre com valores numéricos, sepando centavos por/'./'");
        }
    }

    private void deabilitaMoradia() {
        aluguelPrevisto.setDisable(true);
        condominoPrevisto.setDisable(true);
        presCasaPrevisto.setDisable(true);
        luzPrevisto.setDisable(true);
        aguaPrevisto.setDisable(true);
        gasPrevisto.setDisable(true);
        impostoPrevisto.setDisable(true);
        telefonePrevisto.setDisable(true);
        consManuPrevisto.setDisable(true);
        outroPrevisto.setDisable(true);
    }

    private void habilitaMoradia() {
        aluguelPrevisto.setDisable(false);
        condominoPrevisto.setDisable(false);
        presCasaPrevisto.setDisable(false);
        luzPrevisto.setDisable(false);
        aguaPrevisto.setDisable(false);
        gasPrevisto.setDisable(false);
        impostoPrevisto.setDisable(false);
        telefonePrevisto.setDisable(false);
        consManuPrevisto.setDisable(false);
        outroPrevisto.setDisable(false);
    }

    private void resetMoradia() {
        aluguelPrevisto.clear();
        condominoPrevisto.clear();
        presCasaPrevisto.clear();
        luzPrevisto.clear();
        aguaPrevisto.clear();
        gasPrevisto.clear();
        impostoPrevisto.clear();
        telefonePrevisto.clear();
        consManuPrevisto.clear();
        outroPrevisto.clear();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @FXML
    private void handleButtonEntrarDados(ActionEvent event) {
        try {
            this.entrarDadosMoradia();
            this.resetMoradia();
            
        } catch (Exception ex) {
            System.out.println("falhou");
        }
    }
}
