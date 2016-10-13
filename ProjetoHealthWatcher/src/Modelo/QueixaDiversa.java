/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Danielle
 */
public class QueixaDiversa extends Queixa{
    private int idQxDiversa;
    private int idade;
    private String escolaridade;
    private String ocupacao;

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
    
}
