/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meutransporteapp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ponto {

    private int id;
    private String localizacao;
    private String hora1;
    private String hora2;
    private String outro; // atributo opcional

    // Contrutor padrão é obrigatório
    public Ponto() {
    }

    public Ponto(int id, String localizacao, String latitude, String longitude, String outro) {
        this.id = id;
        this.localizacao = localizacao;
        this.hora1 = latitude;
        this.hora2 = longitude;
        this.outro = outro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getHora1() {
        return hora1;
    }

    public void setHora1(String hora1) {
        this.hora1 = hora1;
    }

    public String getHora2() {
        return hora2;
    }

    public void setHora2(String hora2) {
        this.hora2 = hora2;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }
}

