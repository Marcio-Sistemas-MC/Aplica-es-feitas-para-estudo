package Controle.Banco;

import Modelo.Funcionario;
import java.sql.SQLException;

public class FuncionarioControle {
    
    public void cadastrarFuncionario(Funcionario A) throws SQLException,ClassNotFoundException{
        FuncionarioBanco.cadastrar(A);
    }
    
 public void atualizarFuncionario(Funcionario A) throws SQLException,ClassNotFoundException{
        FuncionarioBanco.atualizar(A);
    }
 
 public void excluirFuncionario(Funcionario A) throws SQLException,ClassNotFoundException{
        FuncionarioBanco.excluir(A);
    } 
}
