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
public class ReceitaMensal {
    private double salarioPrevisto;
    private double salarioRecebido;
    private double extrasPrevisto;
    private double extraRecebido;
    private double outroPrevisto;
    private double outroRecebido;
    private String mesExercicio;
    

    public ReceitaMensal() {
        //setar todos os campos para 0. caso a previsão esteja desativada nenhum outro tratamento se fará necessário
        this.extraRecebido=0;
        this.extrasPrevisto=0;
        this.outroPrevisto=0;
        this.outroRecebido=0;
        this.salarioPrevisto=0;
        this.salarioRecebido=0;
    }

    public double getSalarioPrevisto() {
        return salarioPrevisto;
    }

    public void setSalarioPrevisto(double salarioPrevisto) {
        this.salarioPrevisto = salarioPrevisto;
    }

    public double getSalárioRecebido() {
        return salarioRecebido;
    }

    public void setSalárioRecebido(double salárioRecebido) {
        this.salarioRecebido = salárioRecebido;
    }

    public double getExtrasPrevisto() {
        return extrasPrevisto;
    }

    public void setExtrasPrevisto(double extrasPrevisto) {
        this.extrasPrevisto = extrasPrevisto;
    }

    public double getExtraRecebido() {
        return extraRecebido;
    }

    public void setExtraRecebido(double extraRecebido) {
        this.extraRecebido = extraRecebido;
    }

    public double getOutroPrevisto() {
        return outroPrevisto;
    }

    public void setOutroPrevisto(double outroPrevisto) {
        this.outroPrevisto = outroPrevisto;
    }

    public double getOutroRecebido() {
        return outroRecebido;
    }

    public void setOutroRecebido(double outroRecebido) {
        this.outroRecebido = outroRecebido;
    }

    public String getMesExercicio() {
        return mesExercicio;
    }

    public void setMesExercicio(String mesExercicio) {
        this.mesExercicio = mesExercicio;
    }
    
    public double diferencaRecebidoPrevisto() {
        return (this.salarioRecebido + this.extraRecebido + this.outroRecebido) - 
                (this.salarioPrevisto + this.extrasPrevisto + this.outroPrevisto);
    }
    
    public double somaReceitas() {
        return (this.salarioRecebido + this.extraRecebido + this.outroRecebido) +
                (this.salarioPrevisto + this.extrasPrevisto + this.outroPrevisto);
    }
    
    public void gravarDados() {
        try{
            FileWriter fw = new FileWriter("Receitas"+this.mesExercicio+".txt");
            fw.write(this.toString());
            fw.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return  "salarioPrevisto " + salarioPrevisto +
                "\nsalarioRecebido " + salarioRecebido +
                "\nextrasPrevisto " + extrasPrevisto + 
                "\nextraRecebido " + extraRecebido + 
                "\noutroPrevisto " + outroPrevisto + 
                "\noutroRecebido " + outroRecebido + 
                "\nmesExercicio " + mesExercicio + 
                "\nsoma das Receitas " + somaReceitas();
    }
    
    
}
