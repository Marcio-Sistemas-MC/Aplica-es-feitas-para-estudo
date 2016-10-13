package Controle.Banco;

import Modelo.QueixaAlimentar;
import java.sql.SQLException;

public class QueixaAlimentarControle {

    public void cadastrarQueixaAlimentar(QueixaAlimentar A) throws SQLException, ClassNotFoundException {
        QueixaAlimentarBanco.cadastrar(A);
    }

    public void atualizarQueixaAlimentar(QueixaAlimentar A) throws SQLException, ClassNotFoundException {
        QueixaAlimentarBanco.atualizar(A);
    }

    public void excluirQueixaAlimentar(QueixaAlimentar A) throws SQLException, ClassNotFoundException {
        QueixaAlimentarBanco.excluir(A);
    }
    
    public int obtemNetxValID() throws SQLException {
        return QueixaAlimentarBanco.obtemNextValID();
    }
}
