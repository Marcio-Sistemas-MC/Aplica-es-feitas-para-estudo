/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.entidades;

/**
 *
 * @author 
 */
public class Usuario {
    private String Nome;
    private String Permissao;

    public Usuario() {
        this.Permissao = "Cidadao";
    }

    public Usuario(String Nome) {
        this.Nome = Nome;
        this.Permissao = "Funcionario";
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPermissao() {
        return Permissao;
    }

    public void setPermissao(String Permissao) {
        this.Permissao = Permissao;
    }
    
}
