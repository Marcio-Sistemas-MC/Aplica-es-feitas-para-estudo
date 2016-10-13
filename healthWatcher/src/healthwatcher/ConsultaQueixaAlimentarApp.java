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
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Danielle
 */
public class ConsultaQueixaAlimentarApp extends Application {
    public static Stage myStage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/healthwatcher/visao/fxml/consultaqueixaalimentar.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Consulta Queixas - Queixa Alimentar");
        stage.setScene(scene);
        scene.setFill(Color.BLACK);
         //stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        myStage = stage;
    }
    
}
