/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author Marcio e Polliny
 */
import javax.ws.rs.DefaultValue;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ponto {

    private int id;
    private String localizacao;
    private String hora1;
    private String hora2;
    @DefaultValue("")
    private String outro; // atributo opcional

    // Contrutor padrão é obrigatório
    public Ponto() {
    }

    public Ponto(int id, String localizacao, String hora1, String hora2, String outro) {
        this.id = id;
        this.localizacao = localizacao;
        this.hora1 = hora1;
        this.hora2 = hora2;
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

    public void setHora1(String hora) {
        this.hora1 = hora;
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
