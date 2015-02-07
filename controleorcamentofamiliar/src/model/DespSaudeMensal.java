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
public class DespSaudeMensal {

    private double planoPrevisto;
    private double planoEfetivado;
    private double medicoPrevisto;
    private double medicoEfetivado;
    private double farmaciaPrevisto;
    private double farmaciaEfetivados;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespSaudeMensal() {
        this.planoPrevisto = 0;
        this.planoEfetivado = 0;
        this.medicoPrevisto = 0;
        this.medicoEfetivado = 0;
        this.farmaciaPrevisto = 0;
        this.farmaciaEfetivados = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getPlanoPrevisto() {
        return planoPrevisto;
    }

    public void setPlanoPrevisto(double planoPrevisto) {
        this.planoPrevisto = planoPrevisto;
    }

    public double getPlanoEfetivado() {
        return planoEfetivado;
    }

    public void setPlanoEfetivado(double planoEfetivado) {
        this.planoEfetivado = planoEfetivado;
    }

    public double getMedicoPrevisto() {
        return medicoPrevisto;
    }

    public void setMedicoPrevisto(double medicoPrevisto) {
        this.medicoPrevisto = medicoPrevisto;
    }

    public double getMedicoEfetivado() {
        return medicoEfetivado;
    }

    public void setMedicoEfetivado(double medicoEfetivado) {
        this.medicoEfetivado = medicoEfetivado;
    }

    public double getFarmaciaPrevisto() {
        return farmaciaPrevisto;
    }

    public void setFarmaciaPrevisto(double farmaciaPrevisto) {
        this.farmaciaPrevisto = farmaciaPrevisto;
    }

    public double getFarmaciaEfetivados() {
        return farmaciaEfetivados;
    }

    public void setFarmaciaEfetivados(double farmaciaEfetivados) {
        this.farmaciaEfetivados = farmaciaEfetivados;
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
    
    public double somaDespesasSaude() {
        return  this.planoPrevisto + this.planoEfetivado +
        this.medicoPrevisto + this.medicoEfetivado +
        this.farmaciaPrevisto + this.farmaciaEfetivados +
        this.outrosPrevisto + this.outrosEfetivado;
    }
    
    public double diferencaPrevistoEfetivado() {
        return Math.abs(this.planoPrevisto - this.planoEfetivado +
        this.medicoPrevisto - this.medicoEfetivado +
        this.farmaciaPrevisto - this.farmaciaEfetivados +
        this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "planoPrevisto " + planoPrevisto +
                "\nplanoEfetivado " + planoEfetivado +
                "\nmedicoPrevisto " + medicoPrevisto +
                "\nmedicoEfetivado " + medicoEfetivado + 
                "\nfarmaciaPrevisto " + farmaciaPrevisto + 
                "\nfarmaciaEfetivados " + farmaciaEfetivados +
                "\noutrosPrevisto " + outrosPrevisto +
                "\noutrosEfetivado " + outrosEfetivado + 
                "\nSoma Saude" + this.somaDespesasSaude();
    }
    
    
    
}
