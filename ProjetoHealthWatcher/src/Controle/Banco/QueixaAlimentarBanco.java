package Controle.Banco;

import Modelo.Conexao;
import Modelo.QueixaAlimentar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class QueixaAlimentarBanco {
    public static void cadastrar(QueixaAlimentar A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO \"QUEIXA_ALIMENTAR\"(\"ID_QX_ALIMENTAR\", \"ID_QUEIXA\", \"NOME_VITIMA\","+
                    " \"QTDE_COMENSAIS\",\"QTDE_DOENTES\", \"QTDE_INTERNADOS\", \"QTDE_OBITOS\", \"LOCAL_ATENDIMENTO\","+
                    "\"REFEICAO_SUSPEITA\") VALUES ( nextval(\"ID_QX_ALIMENTAR\") " + "," + A.getId() +
                    ","+ A.getNomeVitima() + "," + A.getQtdeComensais() + "," + A.getQtdeDoentes() + 
                    "," + A.getQtdeInternados() + "," + A.getQtdeObitos() + "," + A.getLocalAtendiento() +
                    "," + A.getRefeicaoSuspeita() + "); ";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa alimentar: "+e.getMessage());
        }
    }
        public static void atualizar(QueixaAlimentar A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "UPDATE \"QUEIXA_ALIMENTAR\" "+
                    "\"NOME_VITIMA\"=" + A.getNomeVitima() + ",\"QTDE_COMENSAIS\"= " + A.getQtdeComensais() +
                    ",\"QTDE_DOENTES\"="+ A.getQtdeDoentes() + ",\"QTDE_INTERNADOS\"="+ A.getQtdeInternados() +
                    ",\"QTDE_OBITOS\"="+ A.getQtdeObitos() + ",\"LOCAL_ATENDIMENTO\"="+ A.getLocalAtendiento() +
                    ",\"REFEICAO_SUSPEITA\"=" + A.getRefeicaoSuspeita() + "where QUEIXA_ALIMENTAR =" + A.getIdQxAlimentar()+ ";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa alimentar: "+e.getMessage());
        }
    }
    
 
    public static void excluir(QueixaAlimentar A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from \"QUEIXA_ALIMENTAR\" where \"ID_QX_ALIMENTAR\"  ="+ A.getIdQxAlimentar()+ ";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa alimentar: "+e.getMessage());
        }
    }
    
    public static int obtemNextValID() throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "Select nextval(\"ID_QX_ALIMENTAR\") from \"QUEIXA_ALIMENTAR\";";
            ResultSet rs = state.executeQuery(sql);
            return rs.getInt("ID_QX_ALIMENTAR");
        } catch (Exception ex) {
           throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
}
