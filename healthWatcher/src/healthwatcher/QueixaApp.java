/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthwatcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Danielle
 */
public class QueixaApp extends Application {
    public static Stage myStage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/healthwatcher/visao/fxml/queixa.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Cadastro de Queixas");
        stage.setScene(scene);
        stage.show();
        myStage = stage;
    }
    
}
