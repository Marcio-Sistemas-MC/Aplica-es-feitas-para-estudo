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
public class DespBancariasMensal {
    private double tarifasPrevisto;
    private double tarifasEfetivados;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespBancariasMensal() {
        this.tarifasPrevisto = 0;
        this.tarifasEfetivados = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getTarifasPrevisto() {
        return tarifasPrevisto;
    }

    public void setTarifasPrevisto(double tarifasPrevisto) {
        this.tarifasPrevisto = tarifasPrevisto;
    }

    public double getTarifasEfetivados() {
        return tarifasEfetivados;
    }

    public void setTarifasEfetivados(double tarifasEfetivados) {
        this.tarifasEfetivados = tarifasEfetivados;
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
    
    public double somaDespesasBancarias() {
        return this.tarifasPrevisto + this.tarifasEfetivados +
        this.outrosPrevisto + this.outrosEfetivado;
    }
    
    public double diferencaPrevistoEfetivado() {
        return Math.abs(this.tarifasPrevisto - this.tarifasEfetivados +
        this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "tarifasPrevisto " + tarifasPrevisto +
                "\ntarifasEfetivados " + tarifasEfetivados +
                "\noutrosPrevisto " + outrosPrevisto +
                "\noutrosEfetivado " + outrosEfetivado + 
                "\nSoma Bancarios " + this.somaDespesasBancarias();
    }
    
    
    
}
