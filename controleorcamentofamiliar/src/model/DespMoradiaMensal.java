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
public class DespMoradiaMensal {
    private double prestacaoPrevisto;
    private double prestacaoEfetivado;
    private double aluguelPrevisto;
    private double aluguelefetivado;
    private double condominioPrevisto;
    private double condominioEfetivado;
    private double aguaPrevisto;
    private double aguaEfetivado;
    private double luzPrevisto;
    private double luzEfetivado;
    private double gasPrevisto;
    private double gasEfetivado;
    private double impostoPrevisto;
    private double impostoEfetivado;
    private double telefonePrevisto;
    private double telefoneEfetivado;
    private double consertosPrevisto;
    private double consertosEfetivados;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespMoradiaMensal() {
        this.prestacaoPrevisto = 0;
        this.prestacaoEfetivado = 0;
        this.aluguelPrevisto = 0;
        this.aluguelefetivado = 0;
        this.condominioPrevisto = 0;
        this.condominioEfetivado = 0;
        this.aguaPrevisto = 0;
        this.aguaEfetivado = 0;
        this.luzPrevisto = 0;
        this.luzEfetivado = 0;
        this.gasPrevisto = 0;
        this.gasEfetivado = 0;
        this.impostoPrevisto = 0;
        this.impostoEfetivado = 0;
        this.telefonePrevisto = 0;
        this.telefoneEfetivado = 0;
        this.consertosPrevisto = 0;
        this.consertosEfetivados = 0;
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

    public double getAluguelPrevisto() {
        return aluguelPrevisto;
    }

    public void setAluguelPrevisto(double aluguelPrevisto) {
        this.aluguelPrevisto = aluguelPrevisto;
    }

    public double getAluguelefetivado() {
        return aluguelefetivado;
    }

    public void setAluguelefetivado(double aluguelefetivado) {
        this.aluguelefetivado = aluguelefetivado;
    }

    public double getCondominioPrevisto() {
        return condominioPrevisto;
    }

    public void setCondominioPrevisto(double condominioPrevisto) {
        this.condominioPrevisto = condominioPrevisto;
    }

    public double getCondominioEfetivado() {
        return condominioEfetivado;
    }

    public void setCondominioEfetivado(double condominioEfetivado) {
        this.condominioEfetivado = condominioEfetivado;
    }

    public double getAguaPrevisto() {
        return aguaPrevisto;
    }

    public void setAguaPrevisto(double aguaPrevisto) {
        this.aguaPrevisto = aguaPrevisto;
    }

    public double getAguaEfetivado() {
        return aguaEfetivado;
    }

    public void setAguaEfetivado(double aguaEfetivado) {
        this.aguaEfetivado = aguaEfetivado;
    }

    public double getLuzPrevisto() {
        return luzPrevisto;
    }

    public void setLuzPrevisto(double luzPrevisto) {
        this.luzPrevisto = luzPrevisto;
    }

    public double getLuzEfetivado() {
        return luzEfetivado;
    }

    public void setLuzEfetivado(double luzEfetivado) {
        this.luzEfetivado = luzEfetivado;
    }

    public double getGasPrevisto() {
        return gasPrevisto;
    }

    public void setGasPrevisto(double gasPrevisto) {
        this.gasPrevisto = gasPrevisto;
    }

    public double getGasEfetivado() {
        return gasEfetivado;
    }

    public void setGasEfetivado(double gasEfetivado) {
        this.gasEfetivado = gasEfetivado;
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

    public double getTelefonePrevisto() {
        return telefonePrevisto;
    }

    public void setTelefonePrevisto(double telefonePrevisto) {
        this.telefonePrevisto = telefonePrevisto;
    }

    public double getTelefoneEfetivado() {
        return telefoneEfetivado;
    }

    public void setTelefoneEfetivado(double telefoneEfetivado) {
        this.telefoneEfetivado = telefoneEfetivado;
    }

    public double getConsertosPrevisto() {
        return consertosPrevisto;
    }

    public void setConsertosPrevisto(double consertosPrevisto) {
        this.consertosPrevisto = consertosPrevisto;
    }

    public double getConsertosEfetivados() {
        return consertosEfetivados;
    }

    public void setConsertosEfetivados(double consertosEfetivados) {
        this.consertosEfetivados = consertosEfetivados;
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
    
    public double somaDespesasMoradia() {
        return this.prestacaoPrevisto  +  this.prestacaoEfetivado +  this.aluguelPrevisto +
        this.aluguelefetivado + this.condominioPrevisto + this.condominioEfetivado +
        this.aguaPrevisto + this.aguaEfetivado + this.luzPrevisto + this.luzEfetivado +
        this.gasPrevisto + this.gasEfetivado + this.impostoPrevisto + this.impostoEfetivado +
        this.telefonePrevisto + this.telefoneEfetivado + this.consertosPrevisto +
        this.consertosEfetivados + this.outrosPrevisto + this.outrosEfetivado;
    }

    public double diferencaEfetivadoPrevisto() {
        return Math.abs(this.prestacaoPrevisto  -  this.prestacaoEfetivado +  this.aluguelPrevisto -
        this.aluguelefetivado + this.condominioPrevisto - this.condominioEfetivado +
        this.aguaPrevisto - this.aguaEfetivado + this.luzPrevisto - this.luzEfetivado +
        this.gasPrevisto - this.gasEfetivado + this.impostoPrevisto - this.impostoEfetivado +
        this.telefonePrevisto - this.telefoneEfetivado - this.consertosPrevisto -
        this.consertosEfetivados + this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "prestacaoPrevisto " + prestacaoPrevisto +
                "\nprestacaoEfetivado " + prestacaoEfetivado + 
                "\naluguelPrevisto " + aluguelPrevisto + 
                "\naluguelefetivado " + aluguelefetivado + 
                "\ncondominioPrevisto " + condominioPrevisto + 
                "\ncondominioEfetivado " + condominioEfetivado +
                "\naguaPrevisto " + aguaPrevisto + 
                "\naguaEfetivado " + aguaEfetivado +
                "\nluzPrevisto " + luzPrevisto +
                "\nluzEfetivado " + luzEfetivado +
                "\ngasPrevisto " + gasPrevisto +
                "\ngasEfetivado " + gasEfetivado + 
                "\nimpostoPrevisto " + impostoPrevisto + 
                "\nimpostoEfetivado " + impostoEfetivado + 
                "\ntelefonePrevisto " + telefonePrevisto +
                "\ntelefoneEfetivado " + telefoneEfetivado +
                "\nconsertosPrevisto " + consertosPrevisto +
                "\nconsertosEfetivados " + consertosEfetivados +
                "\noutrosPrevisto " + outrosPrevisto + 
                "\noutrosEfetivado " + outrosEfetivado + 
                "\nSoma Moradia " + this.somaDespesasMoradia();
    }
    
    
    
}
