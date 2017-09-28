/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.entidades;

/**
 *
 * @author Danielle
 */
public class QueixaAnimal extends Queixa{
    private int idQxlimentar;//vhave priária do cadastro obtida do banco com nextval();
    private String tipoAnimal;
    private int qtdeAnimais;
    private String dataIncomodo;// data da ocorrência do fato;
    private Queixa queixa;
    private String vitimaRua;
    private int vitimaNum;
    private String vitimaBairro;
    private String vitimaCidade;
    private String vitimaCep;
    private String vitimaEstado;
    private String vitimaTelefone;

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

    public Queixa getQueixa() {
        return queixa;
    }

    public void setQueixa(Queixa queixa) {
        this.queixa = queixa;
    }

    public String getVitimaRua() {
        return vitimaRua;
    }

    public void setVitimaRua(String vitimaRua) {
        this.vitimaRua = vitimaRua;
    }

    public int getVitimaNum() {
        return vitimaNum;
    }

    public void setVitimaNum(int vitimaNum) {
        this.vitimaNum = vitimaNum;
    }

    public String getVitimaBairro() {
        return vitimaBairro;
    }

    public void setVitimaBairro(String vitimaBairro) {
        this.vitimaBairro = vitimaBairro;
    }

    public String getVitimaCidade() {
        return vitimaCidade;
    }

    public void setVitimaCidade(String vitimaCidade) {
        this.vitimaCidade = vitimaCidade;
    }

    public String getVitimaCep() {
        return vitimaCep;
    }

    public void setVitimaCep(String vitimaCep) {
        this.vitimaCep = vitimaCep;
    }

    public String getVitimaEstado() {
        return vitimaEstado;
    }

    public void setVitimaEstado(String vitimaEstado) {
        this.vitimaEstado = vitimaEstado;
    }

    public String getVitimaTelefone() {
        return vitimaTelefone;
    }

    public void setVitimaTelefone(String vitimaTelefone) {
        this.vitimaTelefone = vitimaTelefone;
    }
    
    

}
