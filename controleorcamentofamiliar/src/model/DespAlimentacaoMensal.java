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
public class DespAlimentacaoMensal {
    private double supermercadoPrevisto;
    private double supermercadoEfetivado;
    private double feiraPrevisto;
    private double feiraEfetivado;
    private double outrosPrevisto;
    private double outrosefetivado;

    public DespAlimentacaoMensal() {
        this.supermercadoPrevisto = 0;
        this.supermercadoEfetivado = 0;
        this.feiraPrevisto = 0;
        this.feiraEfetivado = 0;
        this.outrosPrevisto = 0;
        this.outrosefetivado = 0;
    }

    public double getSupermercadoPrevisto() {
        return supermercadoPrevisto;
    }

    public void setSupermercadoPrevisto(double supermercadoPrevisto) {
        this.supermercadoPrevisto = supermercadoPrevisto;
    }

    public double getSupermercadoEfetivado() {
        return supermercadoEfetivado;
    }

    public void setSupermercadoEfetivado(double supermercadoEfetivado) {
        this.supermercadoEfetivado = supermercadoEfetivado;
    }

    public double getFeiraPrevisto() {
        return feiraPrevisto;
    }

    public void setFeiraPrevisto(double feiraPrevisto) {
        this.feiraPrevisto = feiraPrevisto;
    }

    public double getFeiraEfetivado() {
        return feiraEfetivado;
    }

    public void setFeiraEfetivado(double feiraEfetivado) {
        this.feiraEfetivado = feiraEfetivado;
    }

    public double getOutrosPrevisto() {
        return outrosPrevisto;
    }

    public void setOutrosPrevisto(double outrosPrevisto) {
        this.outrosPrevisto = outrosPrevisto;
    }

    public double getOutrosefetivado() {
        return outrosefetivado;
    }

    public void setOutrosefetivado(double outrosefetivado) {
        this.outrosefetivado = outrosefetivado;
    }
    
    public double somaDespesasAlimentacao() {
        return  this.supermercadoPrevisto + this.supermercadoEfetivado +
        this.feiraPrevisto + this.feiraEfetivado +
        this.outrosPrevisto + this.outrosefetivado;
    }
    
    public double diferencaEfetivadoPrevisto() {
        return Math.abs(this.supermercadoPrevisto - this.supermercadoEfetivado +
        this.feiraPrevisto - this.feiraEfetivado +
        this.outrosPrevisto - this.outrosefetivado);
    }

    @Override
    public String toString() {
        return "supermercadoPrevisto " + supermercadoPrevisto +
                "\nsupermercadoEfetivado " + supermercadoEfetivado +
                "\nfeiraPrevisto " + feiraPrevisto + 
                "\nfeiraEfetivado " + feiraEfetivado +
                "\noutrosPrevisto " + outrosPrevisto +
                "\noutrosefetivado " + outrosefetivado +
                "\nSoma Alimentacao " + this.somaDespesasAlimentacao();
    }
    
    
    
}
