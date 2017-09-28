package Controle.Banco;

import Modelo.QueixaDiversa;
import java.sql.SQLException;

public class QueixaDiversaControle{
    public void cadastrarQueixaDiversa(QueixaDiversa A) throws SQLException,ClassNotFoundException{
        QueixaDiversaBanco.cadastrar(A);
    }
    
 public void atualizarQueixaDiversa(QueixaDiversa A) throws SQLException,ClassNotFoundException{
        QueixaDiversaBanco.atualizar(A);
    }
 
 public void excluirQueixaDiversa(QueixaDiversa A) throws SQLException,ClassNotFoundException{
        QueixaDiversaBanco.excluir(A);
    } 
}
