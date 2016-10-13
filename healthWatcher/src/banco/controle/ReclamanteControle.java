/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.controle;


import banco.ReclamanteBanco;
import banco.entidades.Reclamante;
import java.sql.SQLException;

/**
 *
 * @author Danielle
 */
public class ReclamanteControle {
    public void cadastrarReclamante(Reclamante A) throws SQLException {
        ReclamanteBanco.cadastrar(A);
    }
    
    public void atualizarReclamante(Reclamante A) throws SQLException {
        ReclamanteBanco.atualizar(A);
    }
    
    public void excluirReclamante(Reclamante A) throws SQLException {
        ReclamanteBanco.excluir(A);
    }
    
    public int obtemCurrenttValID() throws SQLException{
        return ReclamanteBanco.obtemCurrentValID();
    }
}
