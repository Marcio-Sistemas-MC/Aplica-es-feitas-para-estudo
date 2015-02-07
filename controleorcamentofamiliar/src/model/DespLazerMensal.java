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
public class DespLazerMensal {

    private double academiaPrevisto;
    private double academiaEfetivado;
    private double jornalPrevisto;
    private double jornalEfetivado;
    private double tvPrevisto;
    private double tvEfetivado;
    private double internetPrevisto;
    private double internetEfetivado;
    private double baresPrevisto;
    private double baresEfetivado;
    private double cinemaPrevisto;
    private double cinemaEfetivados;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespLazerMensal() {
        this.academiaPrevisto = 0;
        this.academiaEfetivado = 0;
        this.jornalPrevisto = 0;
        this.jornalEfetivado = 0;
        this.tvPrevisto = 0;
        this.tvEfetivado = 0;
        this.internetPrevisto = 0;
        this.internetEfetivado = 0;
        this.baresPrevisto = 0;
        this.baresEfetivado = 0;
        this.cinemaPrevisto = 0;
        this.cinemaEfetivados = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getAcademiaPrevisto() {
        return academiaPrevisto;
    }

    public void setAcademiaPrevisto(double academiaPrevisto) {
        this.academiaPrevisto = academiaPrevisto;
    }

    public double getAcademiaEfetivado() {
        return academiaEfetivado;
    }

    public void setAcademiaEfetivado(double academiaEfetivado) {
        this.academiaEfetivado = academiaEfetivado;
    }

    public double getJornalPrevisto() {
        return jornalPrevisto;
    }

    public void setJornalPrevisto(double jornalPrevisto) {
        this.jornalPrevisto = jornalPrevisto;
    }

    public double getJornalEfetivado() {
        return jornalEfetivado;
    }

    public void setJornalEfetivado(double jornalEfetivado) {
        this.jornalEfetivado = jornalEfetivado;
    }

    public double getTvPrevisto() {
        return tvPrevisto;
    }

    public void setTvPrevisto(double tvPrevisto) {
        this.tvPrevisto = tvPrevisto;
    }

    public double getTvEfetivado() {
        return tvEfetivado;
    }

    public void setTvEfetivado(double tvEfetivado) {
        this.tvEfetivado = tvEfetivado;
    }

    public double getInternetPrevisto() {
        return internetPrevisto;
    }

    public void setInternetPrevisto(double internetPrevisto) {
        this.internetPrevisto = internetPrevisto;
    }

    public double getInternetEfetivado() {
        return internetEfetivado;
    }

    public void setInternetEfetivado(double internetEfetivado) {
        this.internetEfetivado = internetEfetivado;
    }

    public double getBaresPrevisto() {
        return baresPrevisto;
    }

    public void setBaresPrevisto(double baresPrevisto) {
        this.baresPrevisto = baresPrevisto;
    }

    public double getBaresEfetivado() {
        return baresEfetivado;
    }

    public void setBaresEfetivado(double baresEfetivado) {
        this.baresEfetivado = baresEfetivado;
    }

    public double getCinemaPrevisto() {
        return cinemaPrevisto;
    }

    public void setCinemaPrevisto(double cinemaPrevisto) {
        this.cinemaPrevisto = cinemaPrevisto;
    }

    public double getCinemaEfetivados() {
        return cinemaEfetivados;
    }

    public void setCinemaEfetivados(double cinemaEfetivados) {
        this.cinemaEfetivados = cinemaEfetivados;
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

    public double somaDespesasLazer() {
        return this.academiaPrevisto + this.academiaEfetivado
                + this.jornalPrevisto + this.jornalEfetivado
                + this.tvPrevisto + this.tvEfetivado
                + this.internetPrevisto + this.internetEfetivado
                + this.baresPrevisto + this.baresEfetivado
                + this.cinemaPrevisto + this.cinemaEfetivados
                + this.outrosPrevisto + this.outrosEfetivado;
    }

    public double diferencaPrevistoEfetivado() {
        return Math.abs(this.academiaPrevisto - this.academiaEfetivado
                + this.jornalPrevisto - this.jornalEfetivado
                + this.tvPrevisto - this.tvEfetivado
                + this.internetPrevisto - this.internetEfetivado
                + this.baresPrevisto - this.baresEfetivado
                + this.cinemaPrevisto - this.cinemaEfetivados
                + this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "academiaPrevisto " + academiaPrevisto +
                "\nacademiaEfetivado " + academiaEfetivado + 
                "\njornalPrevisto " + jornalPrevisto +
                "\njornalEfetivado " + jornalEfetivado +
                "\ntvPrevisto " + tvPrevisto + 
                "\ntvEfetivado " + tvEfetivado + 
                "\ninternetPrevisto " + internetPrevisto + 
                "\ninternetEfetivado " + internetEfetivado + 
                "\nbaresPrevisto " + baresPrevisto + 
                "\nbaresEfetivado " + baresEfetivado + 
                "\ncinemaPrevisto " + cinemaPrevisto + 
                "\ncinemaEfetivados " + cinemaEfetivados + 
                "\noutrosPrevisto " + outrosPrevisto + 
                "\noutrosEfetivado " + outrosEfetivado + 
                "\nSoma Lazer " + this.somaDespesasLazer();
    }
    
    
    
}
