package Controle.Banco;

import Modelo.Conexao;
import Modelo.Funcionario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioBanco {
    public static void cadastrar(Funcionario A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "insert into funcionario(nome,CPF,usuario,senha)values(null, '"+A.getNome()+"','"+A.getCPF()+"', '"+A.getUsuario()+"','"+A.getSenha()+"' );";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar o funcionario: "+e.getMessage());
        }
    } 
    
    public static void excluir(Funcionario A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from funcionario where cpf="+A.getCPF()+";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao excluir o funcionario: "+e.getMessage());
        }
    }
    
    public static void atualizar(Funcionario A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql ="update funcionario set nome = '"+A.getNome()+"', CPF = '"+A.getCPF()+"',usuario = '"+A.getUsuario()+"', senha = '"+A.getSenha()+ "where cpf ="+A.getCPF()+";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao atualizar o funcionario: "+e.getMessage());
        }
    }
}
