package Controle.Banco;

import Modelo.Conexao;
import Modelo.QueixaAnimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class QueixaAnimalBanco {
    public static void cadastrar(QueixaAnimal A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO \"QUEIXA_ANIMAL\"(\"ID_QUEIXA\", \"ID_QX_ANIMAL\", \"TIPO_ANIMAL\", \"QTDE_ANIMAL\", \"DATA_INCOMODO\")"+
                    "VALUES ("+ A.getId() +","+ A.getIdQxlimentar() + ","+ A.getTipoAnimal() + 
                    ","+ A.getQtdeAnimais() + ","+A.getDataIncomodo() + ");";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa animal: "+e.getMessage());
        }
    }
        public static void atualizar(QueixaAnimal A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "UPDATE \"QUEIXA_ANIMAL\" SET \"TIPO_ANIMAL\"=" + A.getTipoAnimal() +
                    ",\"QTDE_ANIMAL\"=" + A.getQtdeAnimais() + ",\"DATA_INCOMODO\"=" + A.getDataIncomodo() + 
                    "Where ID_QX_ANIMAL =" + A.getIdQxlimentar() + ";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa animal: "+e.getMessage());
        }
    }
    
 
    public static void excluir(QueixaAnimal A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from queixaanimal where = ID_QX_ANIMAL" + A.getIdQxlimentar() + ";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa animal: "+e.getMessage());
        }
    }
   
}
