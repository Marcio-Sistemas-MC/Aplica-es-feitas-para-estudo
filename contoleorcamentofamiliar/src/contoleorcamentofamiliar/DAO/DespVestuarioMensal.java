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
public class DespVestuarioMensal {

    private double roupasPrevisto;
    private double roupasEfetivado;
    private double calcadoPrevisto;
    private double calcadoEfetivado;
    private double outrosPrevisto;
    private double outrosEfetivado;

    public DespVestuarioMensal() {
        this.roupasPrevisto = 0;
        this.roupasEfetivado = 0;
        this.calcadoPrevisto = 0;
        this.calcadoEfetivado = 0;
        this.outrosPrevisto = 0;
        this.outrosEfetivado = 0;
    }

    public double getRoupasPrevisto() {
        return roupasPrevisto;
    }

    public void setRoupasPrevisto(double roupasPrevisto) {
        this.roupasPrevisto = roupasPrevisto;
    }

    public double getRoupasEfetivado() {
        return roupasEfetivado;
    }

    public void setRoupasEfetivado(double roupasEfetivado) {
        this.roupasEfetivado = roupasEfetivado;
    }

    public double getCalcadoPrevisto() {
        return calcadoPrevisto;
    }

    public void setCalcadoPrevisto(double calcadoPrevisto) {
        this.calcadoPrevisto = calcadoPrevisto;
    }

    public double getCalcadoEfetivado() {
        return calcadoEfetivado;
    }

    public void setCalcadoEfetivado(double calcadoEfetivado) {
        this.calcadoEfetivado = calcadoEfetivado;
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

    public double somaDespesasVestuario() {
        return Math.abs(this.roupasPrevisto + this.roupasEfetivado
                + this.calcadoPrevisto + this.calcadoEfetivado
                + this.outrosPrevisto + this.outrosEfetivado);
    }

    public double diferencaEfetivadoPrevisto() {
        return Math.abs(this.roupasPrevisto - this.roupasEfetivado
                + this.calcadoPrevisto - this.calcadoEfetivado
                + this.outrosPrevisto - this.outrosEfetivado);
    }

    @Override
    public String toString() {
        return "roupasPrevisto " + roupasPrevisto
                + "\nroupasEfetivado " + roupasEfetivado
                + "\ncalcadoPrevisto " + calcadoPrevisto
                + "\ncalcadoEfetivado " + calcadoEfetivado
                + "\noutrosPrevisto " + outrosPrevisto
                + "\noutrosEfetivado " + outrosEfetivado
                + "Soma Vestuario " + this.somaDespesasVestuario();
    }

}
