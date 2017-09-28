package Controle.Banco;

import Modelo.Conexao;
import Modelo.login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class loginBanco {
    public static ArrayList<login>buscarLogin() throws SQLException{
        ArrayList<login> LAUX = new ArrayList<login>();
        try{
           Connection  conexao = Conexao.conectar();
           Statement state = conexao.createStatement();
           String sql = "SELECT * FROM \"LOGIN\";";
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               login l = new login();
               l.setLogin(rs.getString("login"));
               l.setSenha(rs.getString("senha"));
               LAUX.add(l);
           }
        }catch(SQLException e) {
            throw new SQLException("Erro ao localizar os dados: "+e.getMessage());
        }
        return LAUX;
       
    }
}
