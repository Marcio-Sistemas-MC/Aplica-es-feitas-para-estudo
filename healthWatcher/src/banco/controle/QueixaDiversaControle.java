package banco.controle;

import banco.QueixaDiversaBanco;
import banco.entidades.QueixaDiversa;
import java.sql.SQLException;

public class QueixaDiversaControle {

    public void cadastrarQueixaDiversa(QueixaDiversa A) throws SQLException, ClassNotFoundException {
        QueixaDiversaBanco.cadastrar(A);
    }

    public void atualizarQueixaDiversa(QueixaDiversa A) throws SQLException, ClassNotFoundException {
        QueixaDiversaBanco.atualizar(A);
    }

    public void excluirQueixaDiversa(QueixaDiversa A) throws SQLException, ClassNotFoundException {
        QueixaDiversaBanco.excluir(A);
    }
    
    public int obtenNextValID() throws SQLException, ClassNotFoundException {
        return QueixaDiversaBanco.obtemNextValID();
    }

}
