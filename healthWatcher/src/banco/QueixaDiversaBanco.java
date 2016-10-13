package banco;

import banco.entidades.QueixaDiversa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueixaDiversaBanco {

    private static int IDAtual;
    
    public static void cadastrar(QueixaDiversa A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO queixa_diversa(id_qx_diversa, id_queixa, idade, escolaridade,"
                    + " ocupacao, vitima_rua,vitima_num, vitima_bairro, vitima_cidade, "
                    + "vitima_cep, vitima_estado,vitima_telefone)" + 
                    "VALUES (nextval('queixa_diversa_id_qx_diversa_seq')," + A.getQueixa().getId() + ","+ A.getIdade() +
                    ",'" + A.getEscolaridade() + "','" + A.getOcupacao() + "','" + A.getVitimaRua() + "'," + A.getVitimaNum() +
                    ",'" + A.getVitimaBairro() + "','" + A.getVitimaCidade() + "','" + A.getVitimaCep() + 
                    "','" + A.getVitimaEstado() + "','" + A.getVitimaTelefone() +"');";
            System.out.println(sql);
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa diversa: " + e.getMessage());
        }
    }

    public static void atualizar(QueixaDiversa A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "";
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa diversa: " + e.getMessage());
        }
    }

    public static void excluir(QueixaDiversa A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from queixadiversa where ID_QX_DIVERSA=" + A.getIdQxDiversa() + ";";
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa diversa: " + e.getMessage());
        }
    }
    
    public static int obtemNextValID() throws SQLException {
        try {
            Connection  conexao = Conexao.conectar();
           Statement state = conexao.createStatement();
           String sql = "SELECT max(id_qx_diversa) from queixa_diversa;";
           ResultSet rs = state.executeQuery(sql);
           rs.next();
           IDAtual = rs.getInt("max");
            return IDAtual;
        } catch (Exception ex) {
           throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
    

}
