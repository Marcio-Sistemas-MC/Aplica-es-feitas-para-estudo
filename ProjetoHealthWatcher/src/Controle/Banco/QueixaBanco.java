package Controle.Banco;

import Modelo.Conexao;
import Modelo.Queixa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueixaBanco {
    public static void cadastrar(Queixa A) throws SQLException {
        try {
            try (Connection conexao = Conexao.conectar()) {
                Statement state = conexao.createStatement();
                String sql = "INSERT INTO \"QUEIXA\"(\"ID\", \"DESCRICAO\", \"OBSERVACAO\", \"SITUACAO\", \"DATA_GRAVACAO\",\"ID_RECLAMANTE\")" +
                        "VALUES (" + A.getId() + "," + A.getDescricao() +","+A.getObservacao()+ "," + A.getSituacao() + ","+
                        A.getData_gravacao() + "," + A.getReclamante().getId() +");";
                state.execute(sql);
                state.close();
            }
        }catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa: "+e.getMessage());
        }
    }
        public static void atualizar(Queixa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql ="update queixa set descricao = '"+A.getDescricao()+"',observacao = '"+
                    A.getObservacao()+"', situacao = '" + A.getSituacao();
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa: "+e.getMessage());
        }
    }
    
 
    public static void excluir(Queixa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from queixa where codigo="+A.getId()+";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa: "+e.getMessage());
        }
    }
   
    public static int obtemNextValID() throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "Select nextval(\"ID\") from \"QUEIXA\";";
            ResultSet rs = state.executeQuery(sql);
            return rs.getInt("ID");
        } catch (Exception ex) {
           throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
    
}
