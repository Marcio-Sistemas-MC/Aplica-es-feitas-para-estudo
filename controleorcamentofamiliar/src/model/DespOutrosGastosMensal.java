/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marcio e Polliny
 */
public class DespOutrosGastosMensal {

    private double presentePrevisto;
    private double presenteEfetivado;
    private double doacaoPrevisto;
    private double doacaoEfetivados;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespOutrosGastosMensal() {
        this.presentePrevisto = 0;
        this.presenteEfetivado = 0;
        this.doacaoPrevisto = 0;
        this.doacaoEfetivados = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getPresentePrevisto() {
        return presentePrevisto;
    }

    public void setPresentePrevisto(double presentePrevisto) {
        this.presentePrevisto = presentePrevisto;
    }

    public double getPresenteEfetivado() {
        return presenteEfetivado;
    }

    public void setPresenteEfetivado(double presenteEfetivado) {
        this.presenteEfetivado = presenteEfetivado;
    }

    public double getDoacaoPrevisto() {
        return doacaoPrevisto;
    }

    public void setDoacaoPrevisto(double doacaoPrevisto) {
        this.doacaoPrevisto = doacaoPrevisto;
    }

    public double getDoacaoEfetivados() {
        return doacaoEfetivados;
    }

    public void setDoacaoEfetivados(double doacaoEfetivados) {
        this.doacaoEfetivados = doacaoEfetivados;
    }

    public double getOutrosPrevisto() {
        return outrosPrevisto;
    }

    public void setOutrosPrevisto(double outrosPrevisto) {
        this.outrosPrevisto = outrosPrevisto;
    }

    public double getOutrosEfetivado() {
        return outrosEfetivado;
    }

    public void setOutrosEfetivado(double outrosEfetivado) {
        this.outrosEfetivado = outrosEfetivado;
    }
    
    public double somaDespesasOutrosGastos() {
        return this.presentePrevisto + this.presenteEfetivado +
        this.doacaoPrevisto + this.doacaoEfetivados +
        this.outrosPrevisto + this.outrosEfetivado;
    }
    
    public double diferencaPrevistoEfetivado() {
        return Math.abs(this.presentePrevisto - this.presenteEfetivado +
        this.doacaoPrevisto - this.doacaoEfetivados +
        this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "presentePrevisto " + presentePrevisto +
                "\npresenteEfetivado " + presenteEfetivado +
                "\ndoacaoPrevisto " + doacaoPrevisto + 
                "\ndoacaoEfetivados " + doacaoEfetivados +
                "\noutrosPrevisto " + outrosPrevisto + 
                "\noutrosEfetivado " + outrosEfetivado + 
                "\nSoma Outros" + this.somaDespesasOutrosGastos();
    }
    
    
    
}
