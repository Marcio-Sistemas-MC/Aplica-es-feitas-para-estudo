/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Banco;

import Modelo.Conexao;
import Modelo.Reclamante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marcio e polliny
 */
public class ReclamanteBanco {

    public static void cadastrar(Reclamante A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO \"RECLAMANTE\"(\"NOME\", \"RUA\", \"NUMERO\", \"BAIRRO\", \"COMPLEMENTO\", \"CIDADE\",\"CEP\", \"ESTADO\", \"TELEFONE\")"
                    + "VALUES (" + A.getNome() + ", " + A.getEnderecoRua() + "," + A.getEnderecoNum()
                    + "," + A.getEnderecpoBairro() + "," + A.getEnderecoComplemento() + "," + A.getEnderecoCidade()
                    + ", " + A.getEnderecoCEP() + "," + A.getEnderecoEstado() + "," + A.getEnderecoTelefone() + ");";
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

    public static int obtemNextValID() throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "Select nextval(\"ID\") from RECLAMANTE;";
            ResultSet rs = state.executeQuery(sql);
            return rs.getInt("ID");
        } catch (Exception ex) {
           throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
}
