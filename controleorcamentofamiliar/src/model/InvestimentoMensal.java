/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileWriter;

/**
 *
 * @author Marcio e Polliny
 */
public class InvestimentoMensal {
    private double financiamentoCasaPrevisto;
    private double financiamentoCasaEfetivado;
    private double aplicacaoFinanceiraPrevisto;
    private double aplicacaoFinanceiraEfetivado;
    private double resImpostoPrevisto;
    private double resImpostoEfetivado;
    private double resUniversidadePrevisto;
    private double resUniversidadeEfetivado;
    private double resViagemPrevisto;
    private double resViagemEfetivado;
    private double resOutrosEfetivado;
    private double resOutrosPrevisto;
    private String mesExercicio;

    public InvestimentoMensal() {
        this.financiamentoCasaPrevisto = 0;
        this.financiamentoCasaEfetivado = 0;
        this.aplicacaoFinanceiraPrevisto = 0;
        this.aplicacaoFinanceiraEfetivado = 0;
        this.resImpostoPrevisto = 0;
        this.resImpostoEfetivado = 0;
        this.resUniversidadePrevisto = 0;
        this.resUniversidadeEfetivado = 0;
        this.resViagemPrevisto = 0;
        this.resViagemEfetivado = 0;
        this.resOutrosEfetivado = 0;
        this.resOutrosPrevisto = 0;
    }

    public double getFinanciamentoCasaPrevisto() {
        return financiamentoCasaPrevisto;
    }

    public void setFinanciamentoCasaPrevisto(double financiamentoCasaPrevisto) {
        this.financiamentoCasaPrevisto = financiamentoCasaPrevisto;
    }

    public double getFinanciamentoCasaEfetivado() {
        return financiamentoCasaEfetivado;
    }

    public void setFinanciamentoCasaEfetivado(double financiamentoCasaEfetivado) {
        this.financiamentoCasaEfetivado = financiamentoCasaEfetivado;
    }

    public double getAplicacaoFinanceiraPrevisto() {
        return aplicacaoFinanceiraPrevisto;
    }

    public void setAplicacaoFinanceiraPrevisto(double aplicacaoFinanceiraPrevisto) {
        this.aplicacaoFinanceiraPrevisto = aplicacaoFinanceiraPrevisto;
    }

    public double getAplicacaoFinanceiraEfetivado() {
        return aplicacaoFinanceiraEfetivado;
    }

    public void setAplicacaoFinanceiraEfetivado(double aplicacaoFinanceiraEfetivado) {
        this.aplicacaoFinanceiraEfetivado = aplicacaoFinanceiraEfetivado;
    }

    public double getResImpostoPrevisto() {
        return resImpostoPrevisto;
    }

    public void setResImpostoPrevisto(double resImpostoPrevisto) {
        this.resImpostoPrevisto = resImpostoPrevisto;
    }

    public double getResImpostoEfetivado() {
        return resImpostoEfetivado;
    }

    public void setResImpostoEfetivado(double resImpostoEfetivado) {
        this.resImpostoEfetivado = resImpostoEfetivado;
    }

    public double getResUniversidadePrevisto() {
        return resUniversidadePrevisto;
    }

    public void setResUniversidadePrevisto(double resUniversidadePrevisto) {
        this.resUniversidadePrevisto = resUniversidadePrevisto;
    }

    public double getResUniversidadeEfetivado() {
        return resUniversidadeEfetivado;
    }

    public void setResUniversidadeEfetivado(double resUniversidadeEfetivado) {
        this.resUniversidadeEfetivado = resUniversidadeEfetivado;
    }

    public double getResViagemPrevisto() {
        return resViagemPrevisto;
    }

    public void setResViagemPrevisto(double resViagemPrevisto) {
        this.resViagemPrevisto = resViagemPrevisto;
    }

    public double getResViagemEfetivado() {
        return resViagemEfetivado;
    }

    public void setResViagemEfetivado(double resViagemEfetivado) {
        this.resViagemEfetivado = resViagemEfetivado;
    }

    public double getResOutrosEfetivado() {
        return resOutrosEfetivado;
    }

    public void setResOutrosEfetivado(double resOutrosEfetivado) {
        this.resOutrosEfetivado = resOutrosEfetivado;
    }

    public double getResOutrosPrevisto() {
        return resOutrosPrevisto;
    }

    public void setResOutrosPrevisto(double resOutrosPrevisto) {
        this.resOutrosPrevisto = resOutrosPrevisto;
    }
    
    
    public void gravarDados() {
        try{
            FileWriter fw = new FileWriter("Investimentos"+this.getMesExercicio()+".txt");
            fw.write(this.toString());
            fw.close();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    @Override
    public String toString() {
        return "financiamentoCasaPrevisto " + financiamentoCasaPrevisto + 
                "\nfinanciamentoCasaEfetivado " + financiamentoCasaEfetivado +
                "\naplicacaoFinanceiraPrevisto " + aplicacaoFinanceiraPrevisto +
                "\naplicacaoFinanceiraEfetivado " + aplicacaoFinanceiraEfetivado +
                "\nresImpostoPrevisto " + resImpostoPrevisto +
                "\nresImpostoEfetivado " + resImpostoEfetivado +
                "\nresUniversidadePrevisto " + resUniversidadePrevisto + 
                "\nresUniversidadeEfetivado " + resUniversidadeEfetivado +
                "\nresViagemPrevisto " + resViagemPrevisto +
                "\nresViagemEfetivado " + resViagemEfetivado +
                "\nresOutrosEfetivado " + resOutrosEfetivado +
                "\nresOutrosPrevisto " + resOutrosPrevisto +
                "\nmes exercicio " + mesExercicio;
    }

    public String getMesExercicio() {
        return mesExercicio;
    }

    public void setMesExercicio(String mesExercicio) {
        this.mesExercicio = mesExercicio;
    }
    
    
    
}
