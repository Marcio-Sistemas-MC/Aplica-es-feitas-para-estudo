/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.entidades;

/**
 *
 * @author Danielle
 */
public class QueixaDiversa extends Queixa{
    private int idQxDiversa;
    private int idade;
    private String escolaridade;
    private String ocupacao;
    private Queixa queixa;
    private String vitimaRua;
    private int vitimaNum;
    private String vitimaBairro;
    private String vitimaCidade;
    private String vitimaCep;
    private String vitimaEstado;
    private String vitimaTelefone;

    public QueixaDiversa() {
        super();
    }

    public int getIdQxDiversa() {
        return idQxDiversa;
    }

    public void setIdQxDiversa(int idQxDiversa) {
        this.idQxDiversa = idQxDiversa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }  

    public Queixa getQueixa() {
        return queixa;
    }

    public void setQueixa(Queixa queixa) {
        this.queixa = queixa;
    }

    public String getVitimaRua() {
        return vitimaRua;
    }

    public void setVitimaRua(String vitimaRua) {
        this.vitimaRua = vitimaRua;
    }

    public int getVitimaNum() {
        return vitimaNum;
    }

    public void setVitimaNum(int vitimaNum) {
        this.vitimaNum = vitimaNum;
    }

    public String getVitimaBairro() {
        return vitimaBairro;
    }

    public void setVitimaBairro(String vitimaBairro) {
        this.vitimaBairro = vitimaBairro;
    }

    public String getVitimaCidade() {
        return vitimaCidade;
    }

    public void setVitimaCidade(String vitimaCidade) {
        this.vitimaCidade = vitimaCidade;
    }

    public String getVitimaCep() {
        return vitimaCep;
    }

    public void setVitimaCep(String vitimaCep) {
        this.vitimaCep = vitimaCep;
    }

    public String getVitimaEstado() {
        return vitimaEstado;
    }

    public void setVitimaEstado(String vitimaEstado) {
        this.vitimaEstado = vitimaEstado;
    }

    public String getVitimaTelefone() {
        return vitimaTelefone;
    }

    public void setVitimaTelefone(String vitimaTelefone) {
        this.vitimaTelefone = vitimaTelefone;
    }
    
}
