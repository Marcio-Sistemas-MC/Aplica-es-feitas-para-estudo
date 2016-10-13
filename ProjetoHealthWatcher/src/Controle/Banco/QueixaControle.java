package Controle.Banco;

import Modelo.Queixa;
import java.sql.SQLException;

public class QueixaControle {

    public void cadastrarQueixa(Queixa A) throws SQLException, ClassNotFoundException {
        QueixaBanco.cadastrar(A);
    }

    public void atualizarQueixa(Queixa A) throws SQLException, ClassNotFoundException {
        QueixaBanco.atualizar(A);
    }

    public void excluirQueixa(Queixa A) throws SQLException, ClassNotFoundException {
        QueixaBanco.excluir(A);
    }
    
    public int obtemNextValID() throws SQLException {
        return QueixaBanco.obtemNextValID();
    }

}
