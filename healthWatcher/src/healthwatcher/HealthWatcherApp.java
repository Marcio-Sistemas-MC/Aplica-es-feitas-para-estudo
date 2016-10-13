/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher;

import banco.entidades.Usuario;
import banco.entidades.Queixa;
import banco.entidades.Reclamante;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 
 */
public class HealthWatcherApp extends Application {
    public static Stage myStage;
    public static Queixa qxAtual;
    public static Reclamante RclAtual = new Reclamante();
    public static Usuario logado;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/healthwatcher/visao/fxml/principal.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Projeto Health Watcher");
        stage.setScene(scene);
        myStage = stage;
        stage.setMaximized(true);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
