/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleorcamentofamiliar;

import util.ScreensController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marcio e Polliny
 */
public class Contoleorcamentofamiliar extends Application {
    //TelaInicio.fxml TELA PRINCIPAL
    //EntradaReceitas.fxml  TELA DE ENTRADA DE DADOS SOBRE AS RECEITAS MENSAIS
    //EntradaDespesas.fxml TELA DE ENTRADA DE TODAS AS DESPESAS
    public static String telaPrincipal = "TelaInicio";
    public static String telaPrincipalFxml = "/view/TelaInicio.fxml";
    public static String telaReceitas = "EntradaReceitas";
    public static String telaReceitasFxml = "/view/EntradaReceitas.fxml";
    public static String telaDespesas = "EntradaDespesas";
    public static String telaDespesasFxml = "/view/EntradaDespesas.fxml";
    public static String telaInvestimentos = "EntradaInvestimento";
    public static String telaInvestimentosFxml = "/view/EntradaInvestimento.fxml";
    public static String telaRelatorio = "TelaRelatorio";
    public static String telaRelatorioFxml = "/view/TelaRelatorio.fxml";
    public static String telaRelatorioGrafico = "TelaRelatorioGrafico";
    public static String telaRelatorioGraficoFxml = "/view/TelaRelatorioGrafico.fxml";
    public static String telaDespesaMoradia = "TelaDespesaMoradia";
    public static String telaDespesaMoradiaFxml = "/view/TelaDespesaMoradia.fxml";
    
    @Override
    public void start(Stage stage) throws Exception {
        ScreensController myContainer = new ScreensController();
        myContainer.loadScreen(telaPrincipal, telaPrincipalFxml);
        myContainer.loadScreen(telaReceitas, telaReceitasFxml);
        myContainer.loadScreen(telaDespesas, telaDespesasFxml);
        myContainer.loadScreen(telaInvestimentos, telaInvestimentosFxml);
        myContainer.loadScreen(telaRelatorio, telaRelatorioFxml);
        myContainer.loadScreen(telaRelatorioGrafico, telaRelatorioGraficoFxml);
        myContainer.loadScreen(telaDespesaMoradia, telaDespesaMoradiaFxml);
        myContainer.setScreen(telaDespesaMoradia);
        
        /*Parent root = FXMLLoader.load(getClass().getResource("EntradaReceitas.fxml"));*/
        Group root = new Group();
        root.getChildren().add(myContainer);
        Scene scene = new Scene(root);
        stage.setTitle("Controle do orçamento Familiar - 1.0");
        stage.setMinHeight(500);
        stage.setMaxWidth(800);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
