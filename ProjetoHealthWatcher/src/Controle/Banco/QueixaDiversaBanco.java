package Controle.Banco;

import Modelo.Conexao;
import Modelo.QueixaDiversa;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class QueixaDiversaBanco {
    public static void cadastrar(QueixaDiversa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO \"QUEIXA_DIVERSA\"(\"ID_QX_DIVERSA\", \"ID_QUEIXA\", idade, escolaridade, ocupacao)"+
                    "VALUES (" + A.getIdQxDiversa() + "," + A.getId() + "," + A.getIdade() + 
                    "," + A.getEscolaridade() + "," + A.getOcupacao() + ");";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa diversa: "+e.getMessage());
        }
    }
        public static void atualizar(QueixaDiversa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "UPDATE \"QUEIXA_DIVERSA\" SET idade=" + A.getIdade() + 
                    ",escolaridade=" + A.getEscolaridade() + ",ocupacao=" + A.getOcupacao() + 
                    "where ID_QX_DIVERSA =" + A.getIdQxDiversa() + ";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa diversa: "+e.getMessage());
        }
    }
    
 
    public static void excluir(QueixaDiversa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from queixadiversa where ID_QX_DIVERSA=" + A.getIdQxDiversa() +";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa diversa: "+e.getMessage());
        }
    }
   
}
