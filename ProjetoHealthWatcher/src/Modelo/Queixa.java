package Modelo;

public abstract class Queixa{
   private int id; //Id da queixa. Chave primária a ser recuerada do banco;
   private String descricao; // descrição da queixa, preenchimento obrigatório;
   private String observacao; // observação sobre a queixa, preenchimento opcional;
   private String situacao; // Sempre "ABERTA" no insert, no update poderá ser "SUSPENSA" ou "FECHADA"
   private String data_gravacao;//data de inserção da queixa;
   private Reclamante reclamante; // Reclamante que realizou a queixa. Composição para facilitar a inserção no banco;

    public Queixa() {
        this.situacao =  "ABERTA";
    }

    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getData_gravacao() {
        return data_gravacao;
    }

    public void setData_gravacao(String data_gravacao) {
        this.data_gravacao = data_gravacao;
    }

    public Reclamante getReclamante() {
        return reclamante;
    }

    public void setReclamante(Reclamante reclamante) {
        this.reclamante = reclamante;
    } 
   
}