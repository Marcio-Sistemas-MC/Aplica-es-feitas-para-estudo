/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import contoleorcamentofamiliar.Contoleorcamentofamiliar;
import contoleorcamentofamiliar.DAO.DespesasMensal;
import util.ScreensController;
import java.net.URL;
import java.util.HashMap;
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
public class EntradaDespesasController implements Initializable, ControlledScreen {

    ScreensController myController = new ScreensController();
    //BLOCO MORADIA
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
    //BLOCO ALIMENTAÇÃO
    @FXML
    private TextField superPrevisto;
    @FXML
    private TextField superEfetivado;
    @FXML
    private TextField feiraPrevisto;
    @FXML
    private TextField feiraEfetivado;
    @FXML
    private TextField outroAlPrevisto;
    @FXML
    private TextField outroAlEfetivado;
    //BLOCO VESTUÁRIO
    @FXML
    private TextField roupaPrevisto;
    @FXML
    private TextField roupaEfetivado;
    @FXML
    private TextField calcadoPrevisto;
    @FXML
    private TextField calcadoEfetivado;
    @FXML
    private TextField outroVePrevisto;
    @FXML
    private TextField outroVeEfetivado;
    //BLOCO TRANSPORTE
    @FXML
    private TextField prestacaoPrevisto;
    @FXML
    private TextField prestacaoEfetivado;
    @FXML
    private TextField seguroPrevisto;
    @FXML
    private TextField seguroEfetivado;
    @FXML
    private TextField combustivelPrevisto;
    @FXML
    private TextField combustivelEfetivado;
    @FXML
    private TextField estacionamentoPrevisto;
    @FXML
    private TextField estacionamentoEfetivado;
    @FXML
    private TextField impostoTrPrevisto;
    @FXML
    private TextField impostoTrEfetivado;
    @FXML
    private TextField onibusPrevisto;
    @FXML
    private TextField onibusEfetivado;
    @FXML
    private TextField outroTrPrevisto;
    @FXML
    private TextField outroTrEfetivado;
    //BLOCO SAÚE
    @FXML
    private TextField planoPrevisto;
    @FXML
    private TextField planoEfetivado;
    @FXML
    private TextField medicoPrevisto;
    @FXML
    private TextField medicoEfetivado;
    @FXML
    private TextField farmaciaPrevisto;
    @FXML
    private TextField farmaciaEfetivado;
    @FXML
    private TextField outroSaPrevisto;
    @FXML
    private TextField outroSaEfetivado;
    //BLOCO EDUCAÇÃO
    @FXML
    private TextField mensalidadePrevisto;
    @FXML
    private TextField mensalidadeEfetivado;
    @FXML
    private TextField cursosPrevisto;
    @FXML
    private TextField cursosEfetivado;
    @FXML
    private TextField outroEdPrevisto;
    @FXML
    private TextField outroEdEfetivado;
    //BLOCO LAZER
    @FXML
    private TextField academiaPrevisto;
    @FXML
    private TextField academiaEfetivado;
    @FXML
    private TextField jornaisPrevisto;
    @FXML
    private TextField jornaisEfetivado;
    @FXML
    private TextField tvPrevisto;
    @FXML
    private TextField tvEfetivado;
    @FXML
    private TextField internetPrevisto;
    @FXML
    private TextField internetEfetivado;
    @FXML
    private TextField baresPrevisto;
    @FXML
    private TextField baresEfetivado;
    @FXML
    private TextField cinemaPrevisto;
    @FXML
    private TextField cinemaEfetivado;
    @FXML
    private TextField outroLaPrevisto;
    @FXML
    private TextField outroLaEfetivado;
    //BLOCO BANCÁRIAS
    @FXML
    private TextField tarifaPrevisto;
    @FXML
    private TextField tarifaEfetivado;
    @FXML
    private TextField outroBaPrevisto;
    @FXML
    private TextField outroBaEfetivado;
    //BLOCO OUTROS GASTOS
    @FXML
    private TextField presentesPrevistos;
    @FXML
    private TextField presentesEfetivados;
    @FXML
    private TextField outroGaPrevisto;
    @FXML
    private TextField outroGaEfetivado;
    @FXML
    private TextField doacaoPrevisto;
    @FXML
    private TextField doacaoEfetivado;

    @FXML
    private ComboBox<String> seletor;
    @FXML
    private ToggleButton desabilita;
    private boolean desabilitado = false;
    public static DespesasMensal despesaMensal;//gambiarra
    public static HashMap<String,DespesasMensal> mapaDespesas = new HashMap<>();

    @FXML
    private void handleButtonVoltarInicio(ActionEvent ev) {
        myController.setScreen(Contoleorcamentofamiliar.telaPrincipal);
    }

    @FXML
    private void handleButtonEntrarDados(ActionEvent ev) {
        despesaMensal = new DespesasMensal();
        this.entrarDadosMes();
        this.entrarDadosMoradia();
        this.entrarDadosEducacao();
        this.entrarDadosAlimentacao();
        this.entrarDadosBancarios();
        this.entrarDadosLazer();
        this.entrarDadosOutrosGastos();
        this.entrarDadosSaude();
        this.entrarDadosTransporte();
        this.entrarDadosVestuario();
        if (!this.seletor.getPromptText().equalsIgnoreCase("selecione o mês")) {
            despesaMensal.setMesExercicio(seletor.getPromptText());
            despesaMensal.gravarDados();
            mapaDespesas.put(seletor.getPromptText(), despesaMensal);
            resetEntradas();
            JOptionPane.showMessageDialog(null, "DESPESAS INSERIDAS COM SUCESSO.");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o mês de referência...");
        }
    }

    @FXML
    private void handleButtonDesativarPrevisao(ActionEvent ev) {
        if (!desabilitado) {
            this.desabilitarCamposPrevisao();
            desabilita.setText("HABILITAR PREVISÃO");
            desabilitado = true;
        } else {
            this.habilitarCamposPrevisao();
            desabilita.setText("DESABILITAR PREVISÃO");
            desabilitado = false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configuraSeletorMes();
    }

    private void configuraSeletorMes() {
        seletor.setPromptText("SELECIONE O MÊS");
        seletor.getItems().addAll("JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL",
                "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO");
        seletor.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                seletor.setPromptText(newValue);
            }
        });
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    private void desabilitarCamposPrevisao() {
        this.deabilitaMoradia();
        this.desabilitaAlimentacao();
        this.desabilitaBancarios();
        this.desabilitaEducacao();
        this.desabilitaLazer();
        this.desabilitaOutrosGastos();
        this.desabilitaSaude();
        this.desabilitaTransporte();
        this.desabilitaVestuario();
    }

    private void habilitarCamposPrevisao() {
        this.habilitaAlimentacao();
        this.habilitaBancarios();
        this.habilitaEducacao();
        this.habilitaLazer();
        this.habilitaMoradia();
        this.habilitaOutrosGastos();
        this.habilitaSaude();
        this.habilitaTransporte();
        this.habilitaVestuario();
    }

    private void entrarDadosMes() {
        if (!this.seletor.getPromptText().equalsIgnoreCase("selecione o mês")) {
            despesaMensal.setMesExercicio(seletor.getPromptText());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o mês de referência...");
        }
    }

    private void entrarDadosMoradia() {
        try {
            despesaMensal.getDespesaMoradia().setAluguelefetivado(Double.parseDouble(this.aluguelEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setCondominioEfetivado(Double.parseDouble(this.condominioEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setPrestacaoEfetivado(Double.parseDouble(this.presCasaEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setLuzEfetivado(Double.parseDouble(this.luzEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setAguaEfetivado(Double.parseDouble(this.aguaEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setGasEfetivado(Double.parseDouble(this.gasEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setImpostoEfetivado(Double.parseDouble(this.impostoEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setTelefoneEfetivado(Double.parseDouble(this.telefoneEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setConsertosEfetivados(Double.parseDouble(this.consManuEfetivado.getText()));
            despesaMensal.getDespesaMoradia().setOutrosEfetivado(Double.parseDouble(this.outroEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaMoradia().setAguaPrevisto(Double.parseDouble(this.aluguelPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setCondominioPrevisto(Double.parseDouble(this.condominoPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setPrestacaoPrevisto(Double.parseDouble(this.presCasaPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setLuzPrevisto(Double.parseDouble(this.luzPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setAguaPrevisto(Double.parseDouble(this.aguaPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setGasPrevisto(Double.parseDouble(this.gasPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setImpostoPrevisto(Double.parseDouble(this.impostoPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setTelefonePrevisto(Double.parseDouble(this.telefonePrevisto.getText()));
                despesaMensal.getDespesaMoradia().setConsertosPrevisto(Double.parseDouble(this.consManuPrevisto.getText()));
                despesaMensal.getDespesaMoradia().setOutrosPrevisto(Double.parseDouble(this.outroPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: MORADIA\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosAlimentacao() {
        try {
            despesaMensal.getDespesaAlimentacao().setFeiraEfetivado(Double.parseDouble(this.feiraEfetivado.getText()));
            despesaMensal.getDespesaAlimentacao().setOutrosefetivado(Double.parseDouble(this.outroAlEfetivado.getText()));
            despesaMensal.getDespesaAlimentacao().setSupermercadoEfetivado(Double.parseDouble(this.superEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaAlimentacao().setFeiraPrevisto(Double.parseDouble(this.feiraPrevisto.getText()));
                despesaMensal.getDespesaAlimentacao().setOutrosPrevisto(Double.parseDouble(this.outroAlPrevisto.getText()));
                despesaMensal.getDespesaAlimentacao().setSupermercadoPrevisto(Double.parseDouble(this.superPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: ALIMENTAÇÃO\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosVestuario() {
        try {
            despesaMensal.getDespesaVestuario().setCalcadoEfetivado(Double.parseDouble(this.calcadoEfetivado.getText()));
            despesaMensal.getDespesaVestuario().setOutrosEfetivado(Double.parseDouble(this.outroVeEfetivado.getText()));
            despesaMensal.getDespesaVestuario().setRoupasEfetivado(Double.parseDouble(this.roupaEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaVestuario().setCalcadoPrevisto(Double.parseDouble(this.calcadoPrevisto.getText()));
                despesaMensal.getDespesaVestuario().setOutrosPrevisto(Double.parseDouble(this.outroVePrevisto.getText()));
                despesaMensal.getDespesaVestuario().setRoupasPrevisto(Double.parseDouble(this.roupaPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: VESTUÁRIO\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosTransporte() {
        try {
            despesaMensal.getDespesaTransporte().setCombustivelEfetivado(Double.parseDouble(this.combustivelEfetivado.getText()));
            despesaMensal.getDespesaTransporte().setEstacionamentoEfetivado(Double.parseDouble(this.estacionamentoEfetivado.getText()));
            despesaMensal.getDespesaTransporte().setImpostoEfetivado(Double.parseDouble(this.impostoTrEfetivado.getText()));
            despesaMensal.getDespesaTransporte().setOnibusEfetivado(Double.parseDouble(this.onibusEfetivado.getText()));
            despesaMensal.getDespesaTransporte().setOutrosEfetivado(Double.parseDouble(this.outroTrEfetivado.getText()));
            despesaMensal.getDespesaTransporte().setPrestacaoEfetivado(Double.parseDouble(this.prestacaoEfetivado.getText()));
            despesaMensal.getDespesaTransporte().setSeguroEfetivado(Double.parseDouble(this.seguroEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaTransporte().setCombustivelPrevisto(Double.parseDouble(this.combustivelPrevisto.getText()));
                despesaMensal.getDespesaTransporte().setEstacionamentoPrevisto(Double.parseDouble(this.estacionamentoPrevisto.getText()));
                despesaMensal.getDespesaTransporte().setImpostoPrevisto(Double.parseDouble(this.impostoTrPrevisto.getText()));
                despesaMensal.getDespesaTransporte().setOnibusPrevisto(Double.parseDouble(this.onibusPrevisto.getText()));
                despesaMensal.getDespesaTransporte().setOutrosPrevisto(Double.parseDouble(this.outroTrPrevisto.getText()));
                despesaMensal.getDespesaTransporte().setPrestacaoPrevisto(Double.parseDouble(this.prestacaoPrevisto.getText()));
                despesaMensal.getDespesaTransporte().setSeguroPrevisto(Double.parseDouble(this.seguroPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: TRANSPORTES\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosSaude() {
        try {
            despesaMensal.getDespesaSaude().setFarmaciaEfetivados(Double.parseDouble(this.farmaciaEfetivado.getText()));
            despesaMensal.getDespesaSaude().setMedicoEfetivado(Double.parseDouble(this.medicoEfetivado.getText()));
            despesaMensal.getDespesaSaude().setOutrosEfetivado(Double.parseDouble(this.outroSaEfetivado.getText()));
            despesaMensal.getDespesaSaude().setPlanoEfetivado(Double.parseDouble(this.planoEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaSaude().setFarmaciaPrevisto(Double.parseDouble(this.farmaciaPrevisto.getText()));
                despesaMensal.getDespesaSaude().setMedicoPrevisto(Double.parseDouble(this.medicoPrevisto.getText()));
                despesaMensal.getDespesaSaude().setOutrosPrevisto(Double.parseDouble(this.outroSaPrevisto.getText()));
                despesaMensal.getDespesaSaude().setPlanoPrevisto(Double.parseDouble(this.planoPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: SAÚDE\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosEducacao() {
        try {
            despesaMensal.getDespesaaEducacao().setCursosEfetivados(Double.parseDouble(this.cursosEfetivado.getText()));
            despesaMensal.getDespesaaEducacao().setMensalidadeEfetivado(Double.parseDouble(this.mensalidadeEfetivado.getText()));
            despesaMensal.getDespesaaEducacao().setOutrosEfetivado(Double.parseDouble(this.outroEdEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaaEducacao().setCursosPrevisto(Double.parseDouble(this.cursosPrevisto.getText()));
                despesaMensal.getDespesaaEducacao().setMensalidadePrevisto(Double.parseDouble(this.mensalidadePrevisto.getText()));
                despesaMensal.getDespesaaEducacao().setOutrosPrevisto(Double.parseDouble(this.outroEdPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: EDUCAÇÃO\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosLazer() {
        try {
            despesaMensal.getDespasaLazer().setAcademiaEfetivado(Double.parseDouble(this.academiaEfetivado.getText()));
            despesaMensal.getDespasaLazer().setBaresEfetivado(Double.parseDouble(this.baresEfetivado.getText()));
            despesaMensal.getDespasaLazer().setCinemaEfetivados(Double.parseDouble(this.cinemaEfetivado.getText()));
            despesaMensal.getDespasaLazer().setInternetEfetivado(Double.parseDouble(this.internetEfetivado.getText()));
            despesaMensal.getDespasaLazer().setJornalEfetivado(Double.parseDouble(this.jornaisEfetivado.getText()));
            despesaMensal.getDespasaLazer().setOutrosEfetivado(Double.parseDouble(this.outroLaEfetivado.getText()));
            despesaMensal.getDespasaLazer().setTvEfetivado(Double.parseDouble(this.tvEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespasaLazer().setAcademiaPrevisto(Double.parseDouble(this.academiaPrevisto.getText()));
                despesaMensal.getDespasaLazer().setBaresPrevisto(Double.parseDouble(this.baresPrevisto.getText()));
                despesaMensal.getDespasaLazer().setCinemaPrevisto(Double.parseDouble(this.cinemaPrevisto.getText()));
                despesaMensal.getDespasaLazer().setInternetPrevisto(Double.parseDouble(this.internetPrevisto.getText()));
                despesaMensal.getDespasaLazer().setJornalPrevisto(Double.parseDouble(this.jornaisPrevisto.getText()));
                despesaMensal.getDespasaLazer().setOutrosPrevisto(Double.parseDouble(this.outroLaPrevisto.getText()));
                despesaMensal.getDespasaLazer().setTvPrevisto(Double.parseDouble(this.tvPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: LAZER\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosOutrosGastos() {
        try {
            despesaMensal.getDespesaOutros().setDoacaoEfetivados(Double.parseDouble(this.doacaoEfetivado.getText()));
            despesaMensal.getDespesaOutros().setOutrosEfetivado(Double.parseDouble(this.outroGaEfetivado.getText()));
            despesaMensal.getDespesaOutros().setPresenteEfetivado(Double.parseDouble(this.presentesEfetivados.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaOutros().setDoacaoPrevisto(Double.parseDouble(this.doacaoPrevisto.getText()));
                despesaMensal.getDespesaOutros().setOutrosPrevisto(Double.parseDouble(this.outroGaPrevisto.getText()));
                despesaMensal.getDespesaOutros().setPresentePrevisto(Double.parseDouble(this.presentesPrevistos.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: OUTROS GASTOS\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
        }
    }

    private void entrarDadosBancarios() {
        try {
            despesaMensal.getDespesaBancaria().setTarifasEfetivados(Double.parseDouble(this.tarifaEfetivado.getText()));
            despesaMensal.getDespesaBancaria().setOutrosEfetivado(Double.parseDouble(this.outroBaEfetivado.getText()));
            if (!desabilitado) {
                despesaMensal.getDespesaBancaria().setTarifasPrevisto(Double.parseDouble(this.tarifaPrevisto.getText()));
                despesaMensal.getDespesaBancaria().setOutrosPrevisto(Double.parseDouble(this.outroBaPrevisto.getText()));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "DESPESAS: BANCÁRIOS\nEntre com os dados no formato 0.00\ncom ponto separando os centavos....");
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

    private void desabilitaAlimentacao() {
        superPrevisto.setDisable(true);
        feiraPrevisto.setDisable(true);
        outroAlPrevisto.setDisable(true);
    }

    private void habilitaAlimentacao() {
        superPrevisto.setDisable(false);
        superEfetivado.setDisable(false);
        feiraPrevisto.setDisable(false);
        feiraEfetivado.setDisable(false);
        outroAlPrevisto.setDisable(false);
        outroAlEfetivado.setDisable(false);
    }

    private void desabilitaVestuario() {
        roupaPrevisto.setDisable(true);
        calcadoPrevisto.setDisable(true);
        outroVePrevisto.setDisable(true);
    }

    private void habilitaVestuario() {
        roupaPrevisto.setDisable(false);
        calcadoPrevisto.setDisable(false);
        outroVePrevisto.setDisable(false);
    }

    private void desabilitaTransporte() {
        prestacaoPrevisto.setDisable(true);
        seguroPrevisto.setDisable(true);
        combustivelPrevisto.setDisable(true);
        estacionamentoPrevisto.setDisable(true);
        impostoTrPrevisto.setDisable(true);
        onibusPrevisto.setDisable(true);
        outroTrPrevisto.setDisable(true);
    }

    private void habilitaTransporte() {
        prestacaoPrevisto.setDisable(false);
        prestacaoEfetivado.setDisable(false);
        seguroPrevisto.setDisable(false);
        seguroEfetivado.setDisable(false);
        combustivelPrevisto.setDisable(false);
        combustivelEfetivado.setDisable(false);
        estacionamentoPrevisto.setDisable(false);
        estacionamentoEfetivado.setDisable(false);
        impostoTrPrevisto.setDisable(false);
        impostoTrEfetivado.setDisable(false);
        onibusPrevisto.setDisable(false);
        onibusEfetivado.setDisable(false);
        outroTrPrevisto.setDisable(false);
        outroTrEfetivado.setDisable(false);
    }

    private void desabilitaSaude() {
        planoPrevisto.setDisable(true);
        medicoPrevisto.setDisable(true);
        farmaciaPrevisto.setDisable(true);
        outroSaPrevisto.setDisable(true);
    }

    private void habilitaSaude() {
        planoPrevisto.setDisable(false);
        planoEfetivado.setDisable(false);
        medicoPrevisto.setDisable(false);
        medicoEfetivado.setDisable(false);
        farmaciaPrevisto.setDisable(false);
        farmaciaEfetivado.setDisable(false);
        outroSaPrevisto.setDisable(false);
        outroSaEfetivado.setDisable(false);
    }

    private void desabilitaEducacao() {
        mensalidadePrevisto.setDisable(true);
        cursosPrevisto.setDisable(true);
        outroEdPrevisto.setDisable(true);
    }

    private void habilitaEducacao() {
        mensalidadePrevisto.setDisable(false);
        mensalidadeEfetivado.setDisable(false);
        cursosPrevisto.setDisable(false);
        cursosEfetivado.setDisable(false);
        outroEdPrevisto.setDisable(false);
        outroEdEfetivado.setDisable(false);
    }

    private void desabilitaLazer() {
        academiaPrevisto.setDisable(true);
        jornaisPrevisto.setDisable(true);
        tvPrevisto.setDisable(true);
        internetPrevisto.setDisable(true);
        baresPrevisto.setDisable(true);
        cinemaPrevisto.setDisable(true);
        outroLaPrevisto.setDisable(true);
    }

    private void habilitaLazer() {
        academiaPrevisto.setDisable(false);
        academiaEfetivado.setDisable(false);
        jornaisPrevisto.setDisable(false);
        jornaisEfetivado.setDisable(false);
        tvPrevisto.setDisable(false);
        tvEfetivado.setDisable(false);
        internetPrevisto.setDisable(false);
        internetEfetivado.setDisable(false);
        baresPrevisto.setDisable(false);
        baresEfetivado.setDisable(false);
        cinemaPrevisto.setDisable(false);
        cinemaEfetivado.setDisable(false);
        outroLaPrevisto.setDisable(false);
        outroLaEfetivado.setDisable(false);
    }

    private void desabilitaOutrosGastos() {
        presentesPrevistos.setDisable(true);
        outroGaPrevisto.setDisable(true);
        doacaoPrevisto.setDisable(true);
    }

    private void habilitaOutrosGastos() {
        presentesPrevistos.setDisable(false);
        presentesEfetivados.setDisable(false);
        outroGaPrevisto.setDisable(false);
        outroGaEfetivado.setDisable(false);
        doacaoPrevisto.setDisable(false);
        doacaoEfetivado.setDisable(false);
    }

    private void desabilitaBancarios() {
        tarifaPrevisto.setDisable(true);
        outroBaPrevisto.setDisable(true);
    }

    private void habilitaBancarios() {
        tarifaPrevisto.setDisable(false);
        tarifaEfetivado.setDisable(false);
        outroBaPrevisto.setDisable(false);
        outroBaEfetivado.setDisable(false);
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
    
    private void resetAlimentacao() {
        superPrevisto.clear();
        superEfetivado.clear();
        feiraPrevisto.clear();
        feiraEfetivado.clear();
        outroAlPrevisto.clear();
        outroAlEfetivado.clear();
    }
    
    private void resetVestuario() {
        roupaPrevisto.clear();
        roupaEfetivado.clear();
        calcadoPrevisto.clear();
        calcadoEfetivado.clear();
        outroVePrevisto.clear();
        outroVeEfetivado.clear();
    }
    
    private void resetTransporte() {
        prestacaoPrevisto.clear();
        prestacaoEfetivado.clear();
        seguroPrevisto.clear();
        seguroEfetivado.clear();
        combustivelPrevisto.clear();
        combustivelEfetivado.clear();
        estacionamentoPrevisto.clear();
        estacionamentoEfetivado.clear();
        impostoTrPrevisto.clear();
        impostoTrEfetivado.clear();
        onibusPrevisto.clear();
        onibusEfetivado.clear();
        outroTrPrevisto.clear();
        outroTrEfetivado.clear();
    }
    
    private void resetSaude() {
        planoPrevisto.clear();
        planoEfetivado.clear();
        medicoPrevisto.clear();
        medicoEfetivado.clear();
        farmaciaPrevisto.clear();
        farmaciaEfetivado.clear();
        outroSaPrevisto.clear();
        outroSaEfetivado.clear();
    }
    
    private void resetEducacao() {
        mensalidadePrevisto.clear();
        mensalidadeEfetivado.clear();
        cursosPrevisto.clear();
        cursosEfetivado.clear();
        outroEdPrevisto.clear();
        outroEdEfetivado.clear();
    }
    
    private void resetLazer() {
        academiaPrevisto.clear();
        academiaEfetivado.clear();
        jornaisPrevisto.clear();
        jornaisEfetivado.clear();
        tvPrevisto.clear();
        tvEfetivado.clear();
        internetPrevisto.clear();
        internetEfetivado.clear();
        baresPrevisto.clear();
        baresEfetivado.clear();
        cinemaPrevisto.clear();
        cinemaEfetivado.clear();
        outroLaPrevisto.clear();
        outroLaEfetivado.clear();
    }
    
    private void resetOutrosGastos() {
        presentesPrevistos.clear();
        presentesEfetivados.clear();
        outroGaPrevisto.clear();
        outroGaEfetivado.clear();
        doacaoPrevisto.clear();
        doacaoEfetivado.clear();
    }
    
     private void resetBancarios() {
        tarifaPrevisto.clear();
        tarifaEfetivado.clear();
        outroBaPrevisto.clear();
        outroBaEfetivado.clear();
    }
     
     private void resetEntradas() {
         this.resetAlimentacao();
         this.resetBancarios();
         this.resetEducacao();
         this.resetLazer();
         this.resetMoradia();
         this.resetOutrosGastos();
         this.resetSaude();
         this.resetTransporte();
         this.resetVestuario();
     }
}
