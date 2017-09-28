/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher.controller;

import banco.controle.QueixaAlimentarControle;
import banco.entidades.QueixaAlimentar;
import healthwatcher.ConsultaQueixaAlimentarApp;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author marcio e polliny
 */
public class ConsultaqueixaalimentarController implements Initializable {
    @FXML
    private TableColumn<QueixaAlimentar,String> queixa;
    @FXML
    private TableColumn<QueixaAlimentar,String> qxalimentar;
    @FXML
    private TableColumn<QueixaAlimentar,String> reclamante;
    @FXML
    private TableColumn<QueixaAlimentar,String> descQueixa;
    @FXML
    private TableColumn<QueixaAlimentar,String> situacao;
    @FXML
    private Button btnSair;
    @FXML
    private TableView<QueixaAlimentar> tabela;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        queixa.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.qxalimentar.setCellValueFactory(new PropertyValueFactory<QueixaAlimentar,String>("idQxAlimentar"));
        this.descQueixa.setCellValueFactory(new PropertyValueFactory<QueixaAlimentar,String>("descricao"));
        this.situacao.setCellValueFactory(new PropertyValueFactory<QueixaAlimentar,String>("situacao"));
        this.reclamante.setCellValueFactory(new PropertyValueFactory<QueixaAlimentar,String>("idReclamante"));
        this.carregaTabela();
    }    

    private void carregaTabela() {
        final ObservableList<QueixaAlimentar> data = FXCollections.observableArrayList();
        ArrayList<QueixaAlimentar> queixaA = new ArrayList<>();
        QueixaAlimentarControle qxCtr  = new QueixaAlimentarControle();
        try {
            queixaA = qxCtr.consultaQuiexas();
            data.setAll(queixaA);
            this.tabela.setItems(data);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaqueixaalimentarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void handleBtnSair(ActionEvent event) {
        ConsultaQueixaAlimentarApp.myStage.close();
    }
    
}
