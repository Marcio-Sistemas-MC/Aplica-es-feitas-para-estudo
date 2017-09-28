package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static final String URL = "jdbc:postgresql://localhost:5432/HealthWatcher_alterado?searchpath=public";
    public static final String USUARIO ="postgres";
    public static final String SENHA = "123456"; //"marpoly"; //   
    
    public static Connection conectar() throws SQLException {
        try{
        return DriverManager.getConnection(URL,USUARIO,SENHA);
    }catch(SQLException e){
        throw new SQLException("Erro ao conectar" + e.getMessage());
    }
}
}