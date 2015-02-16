/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meutransporteapp;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import meutransporteapp.model.Ponto;

/**
 *
 * @author Marcio e Polliny
 */
public class TelaPontosController implements Initializable {

    private final ObservableList<Ponto> pontos = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Ponto, Integer> linha;
    @FXML
    private TableColumn<Ponto, String> local;
    @FXML
    private TableColumn<Ponto, String> hora1;
    @FXML
    private TableColumn<Ponto, String> hora2;
    @FXML
    private TableColumn<Ponto, String> rota;
    @FXML
    private TableView<Ponto> tabelaPontos;
    @FXML
    private Label numRota;

    private void inicializaTabela() {
        linha.setCellValueFactory(new PropertyValueFactory<>("id"));
        local.setCellValueFactory(new PropertyValueFactory<>("localizacao"));
        hora1.setCellValueFactory(new PropertyValueFactory<>("Hora1"));
        hora2.setCellValueFactory(new PropertyValueFactory<>("Hora2"));
        rota.setCellValueFactory(new PropertyValueFactory<>("outro"));
    }

    private void limpaListas() {
        if (!pontos.isEmpty()) {
            pontos.clear();
        }
        if (!this.tabelaPontos.getItems().isEmpty()) {
            this.tabelaPontos.getItems().clear();
        }
    }

    private void recebeDados(String end) {
        Ponto p;
        String json = "";
        Gson gson = new Gson();
        //String end = "http://localhost:8080/MeuTransporte/webresources/ponto/";
        this.limpaListas();
        try {
            for (int i = 0; json != null; i++) {
                URL url = new URL(end + i);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                json = reader.readLine();
                System.out.println(json);
                connection.disconnect();
                try {
                    p = gson.fromJson(json, Ponto.class);
                    pontos.add(p);
                    System.out.println(String.format("%d-%s", p.getId(), p.getLocalizacao()));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

            }
        } catch (IOException e) {
            System.out.println("falhou");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.inicializaTabela();
        //this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/");
    }

    @FXML
    private void handleBotaoLinha(ActionEvent event) {
        Button bt = (Button) event.getSource();
        String nome = bt.getText();
        switch (nome) {
            case "010":
                this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/ponto10/");
                this.tabelaPontos.setItems(pontos);
                break;
            case "020":
                this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/ponto20/");
                this.tabelaPontos.setItems(pontos);
                break;
            case "030":
                this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/ponto30/");
                this.tabelaPontos.setItems(pontos);
                break;
            case "040":
                this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/ponto40/");
                this.tabelaPontos.setItems(pontos);
                break;
            case "050":
                this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/ponto50/");
                this.tabelaPontos.setItems(pontos);
                break;
            case "Todos":
                this.recebeDados("http://localhost:8080/MeuTransporte/webresources/ponto/todos/");
                this.tabelaPontos.setItems(pontos);
                break;
        }
        this.numRota.setText(nome);
    }

}
