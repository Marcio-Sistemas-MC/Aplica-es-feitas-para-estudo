package Visao;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ProjetoHealthWatcher extends Application {
    public static Stage myStage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("Inicial.fxml"));
        //Parent root = FXMLLoader.load(this.getClass().getResource("HealthWatcher.fxml"));
        Scene scene = new Scene(root);      
        stage.setScene(scene);
        stage.show();
        myStage = stage;
    }
    
    
   
    public static void main(String[] args) {
        launch(args);
    }
    
}

