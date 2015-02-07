/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoleorcamentofamiliar.DAO;

/**
 *
 * @author Marcio e Polliny
 */
public class DespTransporteMensal {
    private double prestacaoPrevisto;
    private double prestacaoEfetivado;
    private double seguroPrevisto;
    private double seguroEfetivado;
    private double combustivelPrevisto;
    private double combustivelEfetivado;
    private double estacionamentoPrevisto;
    private double estacionamentoEfetivado;
    private double impostoPrevisto;
    private double impostoEfetivado;
    private double onibusPrevisto;
    private double onibusEfetivado;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespTransporteMensal() {
        this.prestacaoPrevisto = 0;
        this.prestacaoEfetivado = 0;
        this.seguroPrevisto = 0;
        this.seguroEfetivado = 0;
        this.combustivelPrevisto = 0;
        this.combustivelEfetivado = 0;
        this.estacionamentoPrevisto = 0;
        this.estacionamentoEfetivado = 0;
        this.impostoPrevisto = 0;
        this.impostoEfetivado = 0;
        this.onibusPrevisto = 0;
        this.onibusEfetivado = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getPrestacaoPrevisto() {
        return prestacaoPrevisto;
    }

    public void setPrestacaoPrevisto(double prestacaoPrevisto) {
        this.prestacaoPrevisto = prestacaoPrevisto;
    }

    public double getPrestacaoEfetivado() {
        return prestacaoEfetivado;
    }

    public void setPrestacaoEfetivado(double prestacaoEfetivado) {
        this.prestacaoEfetivado = prestacaoEfetivado;
    }

    public double getSeguroPrevisto() {
        return seguroPrevisto;
    }

    public void setSeguroPrevisto(double seguroPrevisto) {
        this.seguroPrevisto = seguroPrevisto;
    }

    public double getSeguroEfetivado() {
        return seguroEfetivado;
    }

    public void setSeguroEfetivado(double seguroEfetivado) {
        this.seguroEfetivado = seguroEfetivado;
    }

    public double getCombustivelPrevisto() {
        return combustivelPrevisto;
    }

    public void setCombustivelPrevisto(double combustivelPrevisto) {
        this.combustivelPrevisto = combustivelPrevisto;
    }

    public double getCombustivelEfetivado() {
        return combustivelEfetivado;
    }

    public void setCombustivelEfetivado(double combustivelEfetivado) {
        this.combustivelEfetivado = combustivelEfetivado;
    }

    public double getEstacionamentoPrevisto() {
        return estacionamentoPrevisto;
    }

    public void setEstacionamentoPrevisto(double estacionamentoPrevisto) {
        this.estacionamentoPrevisto = estacionamentoPrevisto;
    }

    public double getEstacionamentoEfetivado() {
        return estacionamentoEfetivado;
    }

    public void setEstacionamentoEfetivado(double estacionamentoEfetivado) {
        this.estacionamentoEfetivado = estacionamentoEfetivado;
    }

    public double getImpostoPrevisto() {
        return impostoPrevisto;
    }

    public void setImpostoPrevisto(double impostoPrevisto) {
        this.impostoPrevisto = impostoPrevisto;
    }

    public double getImpostoEfetivado() {
        return impostoEfetivado;
    }

    public void setImpostoEfetivado(double impostoEfetivado) {
        this.impostoEfetivado = impostoEfetivado;
    }

    public double getOnibusPrevisto() {
        return onibusPrevisto;
    }

    public void setOnibusPrevisto(double onibusPrevisto) {
        this.onibusPrevisto = onibusPrevisto;
    }

    public double getOnibusEfetivado() {
        return onibusEfetivado;
    }

    public void setOnibusEfetivado(double onibusEfetivado) {
        this.onibusEfetivado = onibusEfetivado;
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
    
    public double somaDespesasTranspote() {
        return this.prestacaoPrevisto + this.prestacaoEfetivado +
        this.seguroPrevisto + this.seguroEfetivado +
        this.combustivelPrevisto + this.combustivelEfetivado +
        this.estacionamentoPrevisto + this.estacionamentoEfetivado +
        this.impostoPrevisto + this.impostoEfetivado +
        this.onibusPrevisto + this.onibusEfetivado +
        this.outrosPrevisto + this.outrosEfetivado;
    }
    
    public double diferencaPrevistoEfetivado() {
        return Math.abs(this.prestacaoPrevisto - this.prestacaoEfetivado +
        this.seguroPrevisto - this.seguroEfetivado +
        this.combustivelPrevisto - this.combustivelEfetivado +
        this.estacionamentoPrevisto - this.estacionamentoEfetivado +
        this.impostoPrevisto - this.impostoEfetivado +
        this.onibusPrevisto - this.onibusEfetivado +
        this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "prestacaoPrevisto " + prestacaoPrevisto +
                "\nprestacaoEfetivado " + prestacaoEfetivado +
                "\nseguroPrevisto " + seguroPrevisto + 
                "\nseguroEfetivado " + seguroEfetivado +
                "\ncombustivelPrevisto " + combustivelPrevisto +
                "\ncombustivelEfetivado " + combustivelEfetivado +
                "\nestacionamentoPrevisto " + estacionamentoPrevisto +
                "\nestacionamentoEfetivado " + estacionamentoEfetivado +
                "\nimpostoPrevisto " + impostoPrevisto +
                "\nimpostoEfetivado " + impostoEfetivado + 
                "\nonibusPrevisto " + onibusPrevisto + 
                "\nonibusEfetivado " + onibusEfetivado +
                "\noutrosPrevisto " + outrosPrevisto +
                "\noutrosEfetivado " + outrosEfetivado + 
                "Soma Transporte " + this.somaDespesasTranspote();
    }
    
    
    
}
