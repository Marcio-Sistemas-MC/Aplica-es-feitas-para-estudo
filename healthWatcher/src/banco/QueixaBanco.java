package banco;


import banco.entidades.Queixa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueixaBanco {
    
    private static int IDAtual;
    
    public static void cadastrar(Queixa A) throws SQLException {
        try {
            try (Connection conexao = Conexao.conectar()) {
                Statement state = conexao.createStatement();
                String sql = "INSERT INTO queixa(id, descricao, observacao, situacao, id_reclamante)" + 
                        "VALUES (nextval('queixa_id_seq'),\'"+ A.getDescricao() +"\',\'" + A.getObservacao() +"\',\'" + A.getSituacao() +
                        "\'," + A.getReclamante().getId() + ");";
                state.execute(sql);
                state.close();
            }
        }catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa: "+e.getMessage());
        }
    }
        public static void atualizar(Queixa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql ="update queixa set descricao = '"+A.getDescricao()+"',observacao = '"+
                    A.getObservacao()+"', situacao = '" + A.getSituacao();
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa: "+e.getMessage());
        }
    }
    
 
    public static void excluir(Queixa A) throws SQLException {
        try {
            Connection conexao =  Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from queixa where codigo="+A.getId()+";";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa: "+e.getMessage());
        }
    }
   
    public static int obtemNextValID() throws SQLException {
        try {
            Connection  conexao = Conexao.conectar();
           Statement state = conexao.createStatement();
           String sql = "SELECT max(id) from queixa;";
           ResultSet rs = state.executeQuery(sql);
           rs.next();
           IDAtual = rs.getInt("max");
            return IDAtual;
        } catch (Exception ex) {
           throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }
    
}
