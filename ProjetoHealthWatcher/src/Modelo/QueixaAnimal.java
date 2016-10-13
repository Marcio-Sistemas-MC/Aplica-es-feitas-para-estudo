/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Danielle
 */
public class QueixaAnimal extends Queixa{
    private int idQxlimentar;//vhave priária do cadastro obtida do banco com nextval();
    private String tipoAnimal;
    private int qtdeAnimais;
    private String dataIncomodo;// data da ocorrência do fato;

    public QueixaAnimal() {
        super();
    }
    
    
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getQtdeAnimais() {
        return qtdeAnimais;
    }

    public void setQtdeAnimais(int qtdeAnimais) {
        this.qtdeAnimais = qtdeAnimais;
    }

    public String getDataIncomodo() {
        return dataIncomodo;
    }

    public void setDataIncomodo(String dataIncomodo) {
        this.dataIncomodo = dataIncomodo;
    }

    public int getIdQxlimentar() {
        return idQxlimentar;
    }

    public void setIdQxlimentar(int idQxlimentar) {
        this.idQxlimentar = idQxlimentar;
    }
    
    

}
