/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;


import banco.entidades.Reclamante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Danielle
 */
public class ReclamanteBanco {

    private static int IDAtual;
    
    public static void cadastrar(Reclamante A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO reclamante(id,nome, rua, numero, bairro, complemento, cidade, cep, estado,telefone, email)"+
                    " VALUES (nextval('reclamante_id_seq'),\' " + A.getNome() + "\',\'" + A.getEnderecoRua() + "\'," + A.getEnderecoNum() +
                    ",\'" + A.getEnderecpoBairro() + "',\'" + A.getEnderecoComplemento() + "\',\'" + A.getEnderecoCidade() +
                    "\',\'" + A.getEnderecoCEP() + "\',\'"+ A.getEnderecoEstado() + "\',\'" + A.getEnderecoTelefone() + 
                    "\',\'" + A.getEmail() + "\');";
            state.execute(sql);
            state.close();
        } catch (Exception ex) {
            throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }

    public static void atualizar(Reclamante A) throws SQLException {// acreidto se rdesnecessário
        Connection conexao = Conexao.conectar();
        Statement state = conexao.createStatement();
        String sql = "";
    }

    public static void excluir(Reclamante A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "Delete from RECLAMANTE where id = " + A.getId() + ";";
            state.execute(sql);
            state.close();
        } catch (Exception ex) {
            throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }

    public static Reclamante selecionar() throws SQLException {
        Reclamante reclamante = new Reclamante();
        Connection conexao = Conexao.conectar();
        Statement state = conexao.createStatement();
        return reclamante;
    }

    public static int obtemCurrentValID() throws SQLException {
        try {
            Connection  conexao = Conexao.conectar();
           Statement state = conexao.createStatement();
           String sql = "SELECT max(id) from reclamante;";
           ResultSet rs = state.executeQuery(sql);
           rs.next();
           IDAtual = rs.getInt("max");
            return IDAtual;
        } catch (Exception ex) {
           throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
}
