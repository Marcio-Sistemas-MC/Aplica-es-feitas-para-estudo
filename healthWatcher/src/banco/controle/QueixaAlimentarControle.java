package banco.controle;


import banco.QueixaAlimentarBanco;
import banco.entidades.QueixaAlimentar;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public ArrayList<QueixaAlimentar> consultaQuiexas() throws SQLException {
        return QueixaAlimentarBanco.consultaQueixa();
    }
}
