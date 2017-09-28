package Visao;

import Controle.Banco.QueixaAlimentarControle;
import Controle.Banco.QueixaControle;
import Controle.Banco.ReclamanteControle;
import Modelo.QueixaAlimentar;
import Modelo.Reclamante;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class CadastrarQueixaAlimentar implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextArea taDescricao;
    @FXML
    private TextArea taObservacao;
    @FXML
    private TextField tfSituacao;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfRua;
    @FXML
    private TextField tfNum;
    @FXML
    private TextField tfComp;
    @FXML
    private TextField tfBairro;
    @FXML
    private TextField tfCidade;
    @FXML
    private ComboBox<String> cbEstado;
    @FXML
    private TextField tfCEP;
    @FXML
    private TextField tfTelefone;
    @FXML
    private TextField tfEmail;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnLimpar;
    @FXML
    private Tab reclamante;
    @FXML
    private Tab ocorrencia;
    @FXML
    private Tab outros;
    @FXML
    private Button btnSair;
    @FXML
    private TextField tfQtdeComensais;
    @FXML
    private TextField tfQtdeDoentes;
    @FXML
    private TextField tfQtdeObitos;
    @FXML
    private TextField tfQtdeInternacoes;
    @FXML
    private TextField tfLocalAtendimento;
    @FXML
    private TextField tfRefeicao;

    @FXML
    private void handleBtnSalvar(ActionEvent event) {
        if (verificaDadosQuiexa() && verificaOutrosDados()) {
            try {
                // Grava dados da vítima
                Reclamante rc = this.preencheDadosreclamante();
                ReclamanteControle rct = new ReclamanteControle();
                rct.cadastrarReclamante(rc);
                //Grava dados da Queixa
                QueixaAlimentar qx = this.preencheDadosQueixa();
                QueixaControle qc = new QueixaControle();
                QueixaAlimentarControle qxct = new QueixaAlimentarControle();
                qxct.cadastrarQueixaAlimentar(qx);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Um erro ocorreu", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios", "Erro de validacao", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Reclamante preencheDadosreclamante() {
        Reclamante rc = new Reclamante();
        rc.setNome(this.tfNome.getText());
        rc.setEnderecoRua((this.tfRua.getText()));
        rc.setEnderecoNum(Integer.parseInt(this.tfNum.getText()));
        rc.setEnderecpoBairro(this.tfBairro.getText());
        rc.setEnderecoCidade(this.tfCidade.getText());
        rc.setEnderecoEstado(this.cbEstado.getValue());
        rc.setEnderecoTelefone(this.tfTelefone.getText());
        return rc;
    }
    
    private QueixaAlimentar preencheDadosQueixa() {
        QueixaAlimentar qx  = new QueixaAlimentar();
        qx.setDescricao(this.taDescricao.getText());
        qx.setObservacao(this.taObservacao.getText());
        qx.setQtdeComensais(Integer.parseInt(this.tfQtdeComensais.getText()));
        qx.setQtdeDoentes(Integer.parseInt(this.tfQtdeDoentes.getText()));
        qx.setQtdeInternados(Integer.parseInt(this.tfQtdeInternacoes.getText()));
        qx.setQtdeObitos(Integer.parseInt(this.tfQtdeObitos.getText()));
        qx.setLocalAtendiento(this.tfLocalAtendimento.getText());
        qx.setRefeicaoSuspeita(this.tfRefeicao.getText());
        return qx;
    }

    private boolean verificaDadosQuiexa() {
        return !this.taDescricao.getText().isEmpty();
    }

    private boolean verificaOutrosDados() {
        return !(this.tfQtdeComensais.getText().isEmpty() || this.tfQtdeDoentes.getText().isEmpty() || this.tfQtdeInternacoes.getText().isEmpty() || this.tfQtdeObitos.getText().isEmpty());
    }

    @FXML
    private void handleBtnLimpar(ActionEvent event) {
        if (this.ocorrencia.isSelected()) {
            this.taDescricao.clear();
            this.taObservacao.clear();
        } else if (this.reclamante.isSelected()) {
            this.tfNome.clear();
            this.tfRua.clear();
            this.tfNum.clear();
            this.tfComp.clear();
            this.tfBairro.clear();
            this.tfCidade.clear();
            this.cbEstado.setValue("Selecione um Estado");
            this.tfCEP.clear();
            this.tfTelefone.clear();
            this.tfEmail.clear();
        } else {
            this.tfQtdeComensais.clear();
            this.tfQtdeDoentes.clear();
            this.tfQtdeInternacoes.clear();
            this.tfQtdeObitos.clear();
            this.tfLocalAtendimento.clear();
            this.tfRefeicao.clear();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        incializarComboBoxEstado();
    }

    private void incializarComboBoxEstado() {
        ObservableList<String> estados = FXCollections.observableArrayList(
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "SC", "SP", "SE", "TO");
        this.cbEstado.getItems().addAll(estados);
    }

    @FXML
    private void handleBtnSair(ActionEvent event) {
        QueixaAlimentarApp.myStage.close();
    }
}
