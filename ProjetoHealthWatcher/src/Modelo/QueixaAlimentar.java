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
public class QueixaAlimentar extends Queixa{
    private int idQxAlimentar;// chave primaria do cadastro, obtida do banco com nextval();
    private String nomeVitima; // nome de quem sofreu o problema;
    private int qtdeComensais;// qtde de pessoas que comeram da comida;
    private int qtdeDoentes;
    private int qtdeInternados;
    private int qtdeObitos;
    private String localAtendiento;
    private String refeicaoSuspeita;

    public QueixaAlimentar() {
        super();
    }

    public String getNomeVitima() {
        return nomeVitima;
    }

    public void setNomeVitima(String nomeVitima) {
        this.nomeVitima = nomeVitima;
    }

    public int getQtdeComensais() {
        return qtdeComensais;
    }

    public void setQtdeComensais(int qtdeComensais) {
        this.qtdeComensais = qtdeComensais;
    }

    public int getQtdeDoentes() {
        return qtdeDoentes;
    }

    public void setQtdeDoentes(int qtdeDoentes) {
        this.qtdeDoentes = qtdeDoentes;
    }

    public int getQtdeInternados() {
        return qtdeInternados;
    }

    public void setQtdeInternados(int qtdeInternados) {
        this.qtdeInternados = qtdeInternados;
    }

    public int getQtdeObitos() {
        return qtdeObitos;
    }

    public void setQtdeObitos(int qtdeObitos) {
        this.qtdeObitos = qtdeObitos;
    }

    public String getLocalAtendiento() {
        return localAtendiento;
    }

    public void setLocalAtendiento(String localAtendiento) {
        this.localAtendiento = localAtendiento;
    }

    public String getRefeicaoSuspeita() {
        return refeicaoSuspeita;
    }

    public void setRefeicaoSuspeita(String refeicaoSuspeita) {
        this.refeicaoSuspeita = refeicaoSuspeita;
    }

    public int getIdQxAlimentar() {
        return idQxAlimentar;
    }

    public void setIdQxAlimentar(int idQxAlimentar) {
        this.idQxAlimentar = idQxAlimentar;
    }
    
}
