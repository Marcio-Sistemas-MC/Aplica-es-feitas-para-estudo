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
public class DespEducacaoMensal {
    private double mensalidadePrevisto;
    private double mensalidadeEfetivado;
    private double cursosPrevisto;
    private double cursosEfetivados;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespEducacaoMensal() {
        this.mensalidadePrevisto = 0;
        this.mensalidadeEfetivado = 0;
        this.cursosPrevisto = 0;
        this.cursosEfetivados = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getMensalidadePrevisto() {
        return mensalidadePrevisto;
    }

    public void setMensalidadePrevisto(double mensalidadePrevisto) {
        this.mensalidadePrevisto = mensalidadePrevisto;
    }

    public double getMensalidadeEfetivado() {
        return mensalidadeEfetivado;
    }

    public void setMensalidadeEfetivado(double mensalidadeEfetivado) {
        this.mensalidadeEfetivado = mensalidadeEfetivado;
    }

    public double getCursosPrevisto() {
        return cursosPrevisto;
    }

    public void setCursosPrevisto(double cursosPrevisto) {
        this.cursosPrevisto = cursosPrevisto;
    }

    public double getCursosEfetivados() {
        return cursosEfetivados;
    }

    public void setCursosEfetivados(double cursosEfetivados) {
        this.cursosEfetivados = cursosEfetivados;
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
    
    public double somaDespesasEducacao() {
        return this.mensalidadePrevisto + this.mensalidadeEfetivado +
        this.cursosPrevisto + this.cursosEfetivados +
        this.outrosPrevisto + this.outrosEfetivado;
    }
    
    public double diferencaPrevistoEfetivado() {
        return Math.abs(this.mensalidadePrevisto - this.mensalidadeEfetivado +
        this.cursosPrevisto - this.cursosEfetivados +
        this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "mensalidadePrevisto " + mensalidadePrevisto +
                "\nmensalidadeEfetivado " + mensalidadeEfetivado +
                "\ncursosPrevisto " + cursosPrevisto + 
                "\ncursosEfetivados " + cursosEfetivados +
                "\noutrosPrevisto " + outrosPrevisto +
                "\noutrosEfetivado " + outrosEfetivado +
                "\nSoma Educacao " + this.somaDespesasEducacao();
    }
    
    
    
}
