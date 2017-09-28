/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.entidades;

/**
 * Reclamante que realiza a queixa. Assim , evita a repetição de código, pois todos as queixas precisam de um reclamante.
 * @author Danielle
 */
public class Reclamante {
    private int id; // chave primária do cadastro de reclamantes, a ser recuperada do banco com nextval();
    private String nome; 
    private String enderecoRua;
    private int enderecoNum;
    private String enderecpoBairro;
    private String enderecoComplemento;
    private String EnderecoCidade;
    private String enderecoCEP;
    private String enderecoEstado;
    private String enderecoTelefone;
    private String email;

    public Reclamante() {
        id = 0;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public int getEnderecoNum() {
        return enderecoNum;
    }

    public void setEnderecoNum(int enderecoNum) {
        this.enderecoNum = enderecoNum;
    }

    public String getEnderecpoBairro() {
        return enderecpoBairro;
    }

    public void setEnderecpoBairro(String enderecpoBairro) {
        this.enderecpoBairro = enderecpoBairro;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoCidade() {
        return EnderecoCidade;
    }

    public void setEnderecoCidade(String EnderecoCidade) {
        this.EnderecoCidade = EnderecoCidade;
    }

    public String getEnderecoCEP() {
        return enderecoCEP;
    }

    public void setEnderecoCEP(String enderecoCEP) {
        this.enderecoCEP = enderecoCEP;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    public String getEnderecoTelefone() {
        return enderecoTelefone;
    }

    public void setEnderecoTelefone(String enderecoTelefone) {
        this.enderecoTelefone = enderecoTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
