package banco.controle;

import banco.QueixaAnimalBanco;
import banco.entidades.QueixaAnimal;
import java.sql.SQLException;

public class QueixaAnimalControle {

    public void cadastrarQueixaAnimal(QueixaAnimal A) throws SQLException, ClassNotFoundException {
        QueixaAnimalBanco.cadastrar(A);
    }

    public void atualizarQueixaAnimal(QueixaAnimal A) throws SQLException, ClassNotFoundException {
        QueixaAnimalBanco.atualizar(A);
    }

    public void excluirQueixaAnimal(QueixaAnimal A) throws SQLException, ClassNotFoundException {
        QueixaAnimalBanco.excluir(A);
    }

    public int obtenNextValID() throws SQLException, ClassNotFoundException {
        return QueixaAnimalBanco.obtemNextValID();
    }
}
