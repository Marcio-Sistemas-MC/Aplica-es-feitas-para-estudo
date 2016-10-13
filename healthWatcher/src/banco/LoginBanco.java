package banco;


import banco.entidades.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginBanco {
    public static ArrayList<Login>buscarLogin() throws SQLException{
        ArrayList<Login> LAUX = new ArrayList<Login>();
        try{
           Connection  conexao = Conexao.conectar();
           Statement state = conexao.createStatement();
           String sql = "SELECT * FROM \"LOGIN\";";
           ResultSet rs = state.executeQuery(sql);
           while(rs.next()){
               Login l = new Login();
               l.setLogin(rs.getString("Login"));
               l.setSenha(rs.getString("senha"));
               LAUX.add(l);
           }
        }catch(SQLException e) {
            throw new SQLException("Erro ao localizar os dados: "+e.getMessage());
        }
        return LAUX;
       
    }
}
