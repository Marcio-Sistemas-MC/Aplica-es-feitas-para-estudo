package banco;

import banco.entidades.QueixaAnimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueixaAnimalBanco {

    private static int IDAtual;
    
    public static void cadastrar(QueixaAnimal A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO queixa_animal(id_queixa, id_qx_animal, tipo_animal, qtde_animal,"
                    + " data_incomodo,vitima_rua, vitima_num, vitima_bairro, vitima_cidade, vitima_cep,vitima_estado,"
                    + " vitima_telefone)"
                    + "VALUES (" + A.getQueixa().getId() + ",nextval('queixa_animal_id_qx_animal_seq'),'" + A.getTipoAnimal()
                    + "'," + A.getQtdeAnimais() + ",'" + A.getDataIncomodo() + "','" + A.getVitimaRua() + "'," + A.getVitimaNum()
                    + ",'" + A.getVitimaBairro() + "','" + A.getVitimaCidade() + "','" + A.getVitimaCep() + "','" + A.getVitimaEstado()
                    + "','" + A.getVitimaTelefone() + "');";
            System.out.println(sql);
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa animal: " + e.getMessage());
        }
    }

    public static void atualizar(QueixaAnimal A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = ""
                    + "";
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa animal: " + e.getMessage());
        }
    }

    public static void excluir(QueixaAnimal A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "";
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa animal: " + e.getMessage());
        }
    }

    public static int obtemNextValID() throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "SELECT max(id_qx_animal) from queixa_animal;";
            ResultSet rs = state.executeQuery(sql);
            rs.next();
            IDAtual = rs.getInt("max");
            return IDAtual;
        } catch (Exception ex) {
            throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
}
