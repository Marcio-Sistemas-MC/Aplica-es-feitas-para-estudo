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
public class QueixaAlimentar extends Queixa {

    private int idQxAlimentar;// chave primaria do cadastro, obtida do banco com nextval();
    private String nomeVitima; // nome de quem sofreu o problema;
    private int qtdeComensais;// qtde de pessoas que comeram da comida;
    private int qtdeDoentes;
    private int qtdeInternados;
    private int qtdeObitos;
    private String localAtendiento;
    private String refeicaoSuspeita;
    private String vitima_nome;
    private String vitima_rua;
    private int vitima_num;
    private String vitima_bairro;
    private String vitima_cidade;
    private String vitima_cep;
    private String vitima_estado;
    private String vitima_telefone;
    private Queixa queixa;
    private int idReclamante;
    
    public QueixaAlimentar() {
        super();
    }

    public String getNomeVitima() {
        return nomeVitima;
    }

    public void setNomeVitima(String nomeVitima) {
        this.nomeVitima = nomeVitima;
    }

    public int getQtdeComensais() {
        return qtdeComensais;
    }

    public void setQtdeComensais(int qtdeComensais) {
        this.qtdeComensais = qtdeComensais;
    }

    public int getQtdeDoentes() {
        return qtdeDoentes;
    }

    public void setQtdeDoentes(int qtdeDoentes) {
        this.qtdeDoentes = qtdeDoentes;
    }

    public int getQtdeInternados() {
        return qtdeInternados;
    }

    public void setQtdeInternados(int qtdeInternados) {
        this.qtdeInternados = qtdeInternados;
    }

    public int getQtdeObitos() {
        return qtdeObitos;
    }

    public void setQtdeObitos(int qtdeObitos) {
        this.qtdeObitos = qtdeObitos;
    }

    public String getLocalAtendiento() {
        return localAtendiento;
    }

    public void setLocalAtendiento(String localAtendiento) {
        this.localAtendiento = localAtendiento;
    }

    public String getRefeicaoSuspeita() {
        return refeicaoSuspeita;
    }

    public void setRefeicaoSuspeita(String refeicaoSuspeita) {
        this.refeicaoSuspeita = refeicaoSuspeita;
    }

    public int getIdQxAlimentar() {
        return idQxAlimentar;
    }

    public void setIdQxAlimentar(int idQxAlimentar) {
        this.idQxAlimentar = idQxAlimentar;
    }

    public String getVitima_nome() {
        return vitima_nome;
    }

    public void setVitima_nome(String vitima_nome) {
        this.vitima_nome = vitima_nome;
    }

    public String getVitima_rua() {
        return vitima_rua;
    }

    public void setVitima_rua(String vitima_rua) {
        this.vitima_rua = vitima_rua;
    }

    public int getVitima_num() {
        return vitima_num;
    }

    public void setVitima_num(int vitima_num) {
        this.vitima_num = vitima_num;
    }

    public String getVitima_bairro() {
        return vitima_bairro;
    }

    public void setVitima_bairro(String vitima_bairro) {
        this.vitima_bairro = vitima_bairro;
    }

    public String getVitima_cidade() {
        return vitima_cidade;
    }

    public void setVitima_cidade(String vitima_cidade) {
        this.vitima_cidade = vitima_cidade;
    }

    public String getVitima_cep() {
        return vitima_cep;
    }

    public void setVitima_cep(String vitima_cep) {
        this.vitima_cep = vitima_cep;
    }

    public String getVitima_estado() {
        return vitima_estado;
    }

    public void setVitima_estado(String vitima_estado) {
        this.vitima_estado = vitima_estado;
    }

    public String getVitima_telefone() {
        return vitima_telefone;
    }

    public void setVitima_telefone(String vitima_telefone) {
        this.vitima_telefone = vitima_telefone;
    }

    public Queixa getQueixa() {
        return queixa;
    }

    public void setQueixa(Queixa queixa) {
        this.queixa = queixa;
    }

    public int getIdReclamante() {
        return idReclamante;
    }

    public void setIdReclamante(int idReclamante) {
        this.idReclamante = idReclamante;
    }

}
