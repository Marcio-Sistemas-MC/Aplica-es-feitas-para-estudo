/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author marcio e polliny
 */
public class HealthWatcherApp extends Application {
    public static Stage myStage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("HealthWatcher.fxml"));
        Scene scene = new Scene(root);      
        stage.setScene(scene);
        stage.show();
        myStage = stage;
    }
    
    
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
