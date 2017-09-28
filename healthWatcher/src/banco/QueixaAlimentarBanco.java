package banco;

import banco.entidades.QueixaAlimentar;
import banco.entidades.Reclamante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QueixaAlimentarBanco {

    private static int IDAtual;

    public static void cadastrar(QueixaAlimentar A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "INSERT INTO queixa_alimentar(id_qx_alimentar, id_queixa,"
                    + " qtde_comensais, qtde_doentes, qtde_internados,qtde_obitos, local_atendimento,"
                    + " refeicao_suspeita, vitima_nome,vitima_rua, vitima_num, vitima_bairro, vitima_cidade,"
                    + " vitima_cep,vitima_estado, vitima_telefone)"
                    + "VALUES (nextval('queixa_alimentar_id_qx_alimentar_seq')," + A.getQueixa().getId()
                    + "," + A.getQtdeComensais() + "," + A.getQtdeDoentes() + "," + A.getQtdeInternados()
                    + "," + A.getQtdeObitos() + ",'" + A.getLocalAtendiento() + "','" + A.getRefeicaoSuspeita()
                    + "','" + A.getNomeVitima() + "','" + A.getVitima_rua() + "'," + A.getVitima_num()
                    + ",'" + A.getVitima_bairro() + "','" + A.getVitima_cidade() + "','" + A.getVitima_cep()
                    + "','" + A.getVitima_estado() + "','" + A.getVitima_telefone() + "');";
            System.out.println(sql);
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar a queixa alimentar: " + e.getMessage());
        }
    }

    public static void atualizar(QueixaAlimentar A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "";
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar a queixa alimentar: " + e.getMessage());
        }
    }

    public static void excluir(QueixaAlimentar A) throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from \"QUEIXA_ALIMENTAR\" where \"ID_QX_ALIMENTAR\"  =" + A.getIdQxAlimentar() + ";";
            state.execute(sql);
            state.close();
            conexao.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir a queixa alimentar: " + e.getMessage());
        }
    }

    public static int obtemNextValID() throws SQLException {
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "SELECT max(id_qx_alimentar) from queixa_alimentar;";
            ResultSet rs = state.executeQuery(sql);
            rs.next();
            IDAtual = rs.getInt("max");
            return IDAtual;
        } catch (Exception ex) {
            throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
    }

    public static ArrayList<QueixaAlimentar> consultaQueixa() throws SQLException {
        ArrayList<QueixaAlimentar> queixas = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            Statement state = conexao.createStatement();
            String sql = "select A.id_qx_alimentar, A.id_queixa,B.situacao,B.descricao, B.data_gravacao, C.id AS id_rec, C.nome "
                    + "from queixa_alimentar A "
                    + "left join queixa B on (A.id_queixa = B.id)"
                    + "left join reclamante C on (B.id_reclamante = C.id)"
                    + "order by 1;"; // melhorar a implementação;
            ResultSet rs = state.executeQuery(sql);
            while(rs.next()) {
                QueixaAlimentar q = new QueixaAlimentar();
                q.setIdQxAlimentar(rs.getInt("id_qx_alimentar"));
             //   System.out.println("Carregou " + q.getIdQxAlimentar());
                q.setId(rs.getInt("id_queixa"));
                q.setSituacao(rs.getString("situacao"));
                q.setDescricao(rs.getString("descricao"));
                q.setData_gravacao(rs.getString("data_gravacao"));
                q.setReclamante(new Reclamante());
                q.getReclamante().setId(rs.getInt("id_rec"));
                q.setIdReclamante(rs.getInt("id_rec"));
                q.getReclamante().setNome(rs.getString("nome"));
                queixas.add(q);
            }
        } catch (Exception ex) {
            throw new SQLException("Erro ao cadastrar a queixa: " + ex.getMessage());
        }
        return queixas;
    }
    
}
