/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Marcio e Polliny
 */
@Path("ponto")
public class PontoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PontoResource
     */
    public PontoResource() {
    }

    /**
     * Retrieves representation of an instance of recursos.PontoResource
     *
     * @return an instance of java.lang.String
     */
    static List<Ponto> pontos;
    static List<Ponto> pontos10;
    static List<Ponto> pontos20;
    static List<Ponto> pontos30;
    static List<Ponto> pontos40;
    static List<Ponto> pontos50;
    
    static List<Ponto> todos;
    

    static {
        pontos10 = new ArrayList<Ponto>();
        pontos10.add(new Ponto(1, "Rodoviaria", "05:50", "07:05", "010"));
        pontos10.add(new Ponto(2, "Praca 3 de Outubro", "05:51", "07:06", "010"));
        pontos10.add(new Ponto(3, "Sind. Rural", "05:55", "07:10", "010"));
        pontos10.add(new Ponto(4, "E. E. Gregoriano Canedo", "05:57", "07:12", "010"));
        pontos10.add(new Ponto(5, "Colegio N. S. Amparo", "05:58", "07:13", "010"));
        pontos10.add(new Ponto(6, "JG Enxovais", "06:00", "07:15", "010"));
        pontos10.add(new Ponto(7, "E.E. Leticia Chaves", "06:01", "07:16", "010"));
        pontos10.add(new Ponto(8, "Super Seu", "06:03", "07:18", "010"));
        pontos10.add(new Ponto(9, "Pe de Manga", "06:05", "07:20", "010"));
        pontos10.add(new Ponto(10, "Mercado Valtinho", "06:07", "07:21", "010"));
        pontos10.add(new Ponto(11, "Caixa D'agua", "06:08", "07:23", "010"));
        pontos10.add(new Ponto(12, "Praca Catulina", "06:09", "07:24", "010"));
        pontos10.add(new Ponto(13, "Schincariol", "06:11", "07:26", "010"));
        pontos10.add(new Ponto(14, "Praca Lagoinha", "06:13", "07:28", "010"));
        pontos10.add(new Ponto(15, "Rua Sao Luiz", "06:15", "07:30", "010"));
        pontos10.add(new Ponto(16, "Ceramica Carmelo", "06:17", "07:32", "010"));
        pontos10.add(new Ponto(17, "Padaria Santa Rita", "06:20", "07:35", "010"));
        pontos10.add(new Ponto(18, "E. M. Santa Rita", "06:22", "07:37", "010"));
        pontos10.add(new Ponto(19, "Santo Agostinho", "06:25", "07:40", "010"));
        pontos10.add(new Ponto(20, "Salao Santa Rita", "06:27", "07:42", "010"));
        pontos10.add(new Ponto(21, "Igreja de Deus", "06:28", "07:43", "010"));
        pontos10.add(new Ponto(22, "Horto Florestal", "06:30", "07:45", "010"));
        pontos10.add(new Ponto(23, "Biolac", "06:31", "07:46", "010"));
        pontos10.add(new Ponto(24, "Mercado Mendonca", "06:32", "07:47", "010"));
        pontos10.add(new Ponto(25, "Rua Juca Resende", "06:33", "07:48", "010"));
        pontos10.add(new Ponto(26, "Praca N. S. Rosario", "06:34", "07:49", "010"));
        pontos10.add(new Ponto(27, "Sindicato dos Trabalhadores", "06:36", "07:51", "010"));
        pontos10.add(new Ponto(28, "Quadra Vila Dourada", "06:38", "07:53", "010"));
        pontos10.add(new Ponto(29, "Cemiterio", "06:40", "07:55", "010"));
        pontos10.add(new Ponto(30, "Aeroporto", "09:41", "07:56", "010"));
        pontos10.add(new Ponto(31, "Parana com BH", "06:42", "07:57", "010"));
        pontos10.add(new Ponto(32, "Ceara com BH", "06:44", "07:59", "010"));
        pontos10.add(new Ponto(33, "Vendao", "06:45", "08:00", "010"));
        pontos10.add(new Ponto(34, "Minas Shopping", "06:46", "08:01", "010"));
        pontos10.add(new Ponto(35, "Praca dos Peixinhos", "06:47", "08:02", "010"));
        pontos10.add(new Ponto(36, "Praca 3 de Outubro", "06:49", "08:04", "010"));
        pontos10.add(new Ponto(37, "Rodoviaria", "06:51", "08:05", "010"));
    }

    static {
        pontos20 = new ArrayList<Ponto>();
        pontos20.add(new Ponto(1, "Rodoviaria", "06:00", "07:25", "020"));
        pontos20.add(new Ponto(2, "Praca 3 de outubro", "06:01", "07:26", "020"));
        pontos20.add(new Ponto(3, "Praca N. S. Rosario", "06:02", "07:27", "020"));
        pontos20.add(new Ponto(4, "Tatu Modas", "06:05", "07:31", "020"));
        pontos20.add(new Ponto(5, "Araguaia com Xingu", "06:06", "07:33", "020"));
        pontos20.add(new Ponto(6, "Xingu com Pinheiros", "06:07", "07:34", "020"));
        pontos20.add(new Ponto(7, "Rio Claro com A. Elzebio", "06:09", "07:35", "020"));
        pontos20.add(new Ponto(8, "Tocantins com Piaui", "06:11", "07:36", "020"));
        pontos20.add(new Ponto(9, "Jose Avelino com Santa Catarina", "06:13", "07:38", "020"));
        pontos20.add(new Ponto(10, "Arte Foto Lucas", "06:15", "07:40", "020"));
        pontos20.add(new Ponto(11, "Minas Shopping", "06:17", "07:42", "020"));
        pontos20.add(new Ponto(12, "Vendao", "06:18", "07:43", "020"));
        pontos20.add(new Ponto(13, "Ceara com BH", "06:20", "07:45", "020"));
        pontos20.add(new Ponto(14, "Parana com BH", "06:22", "07:46", "020"));
        pontos20.add(new Ponto(15, "Parana com Goias", "06:24", "07:47", "020"));
        pontos20.add(new Ponto(16, "SESI", "06:25", "07:48", "020"));
        pontos20.add(new Ponto(17, "Padaria Pao Quente", "06:26", "07:49", "020"));
        pontos20.add(new Ponto(18, "Ceramica Monte Carlo", "06:27", "07:51", "020"));
        pontos20.add(new Ponto(19, "Jardim Oriente", "06:29", "07:52", "020"));
        pontos20.add(new Ponto(20, "Praca Sao Sebastiao", "06:31", "07:54", "020"));
        pontos20.add(new Ponto(21, "Sao Sebastiao 2", "06:33", "07:55", "020"));
        pontos20.add(new Ponto(22, "Jardim Oriente", "06:35", "07:57", "020"));
        pontos20.add(new Ponto(23, "Ceramica Monte Carlo", "06:37", "07:59", "020"));
        pontos20.add(new Ponto(24, "Padaria Pao Quente", "06:38", "08:00", "020"));
        pontos20.add(new Ponto(25, "Nestle", "06:40", "08:02", "020"));
        pontos20.add(new Ponto(26, "Praca N. S. Fatima", "06:41", "08:03", "020"));
        pontos20.add(new Ponto(27, "Ceara com BH", "06:43", "08:05", "020"));
        pontos20.add(new Ponto(28, "Vendao", "06:44", "08:07", "020"));
        pontos20.add(new Ponto(29, "Minas Shopping", "06:43", "08:09", "020"));
        pontos20.add(new Ponto(30, "E.E. Gragoriano Canedo", "06:56", "08:19", "020"));
        pontos20.add(new Ponto(31, "Tiro Certo Caca E Pesca", "06:59", "08:21", "020"));
        pontos20.add(new Ponto(32, "Praca 3 de Outubro", "07:00", "08:22", "020"));
        pontos20.add(new Ponto(33, "Rodoviaria", "07:02", "08:24", "020"));

    }

    static {
        pontos30 = new ArrayList<Ponto>();
        pontos30.add(new Ponto(1, "Rodoviaria", "06:00", "07:05", "030"));
        pontos30.add(new Ponto(2, "Praca 3 de outubro", "06:02", "07:07", "030"));
        pontos30.add(new Ponto(3, "Sind. Rural", "06:06", "07:11", "030"));
        pontos30.add(new Ponto(4, "E. E. G. Canedo", "06:08", "07:13", "030"));
        pontos30.add(new Ponto(5, "M. S. Antonio", "06:10", "07:15", "030"));
        pontos30.add(new Ponto(6, "Camilao", "06:12", "07:17", "030"));
        pontos30.add(new Ponto(7, "Vidracaria Soares", "06:13", "07:18", "030"));
        pontos30.add(new Ponto(8, "Minas Shopping", "06:15", "07:20", "030"));
        pontos30.add(new Ponto(9, "Vendao", "06:16", "07:21", "030"));
        pontos30.add(new Ponto(10, "Praca N. S. de Fatima", "06:19", "07:24", "030"));
        pontos30.add(new Ponto(11, "Montreal 1", "06;22", "07:27", "030"));
        pontos30.add(new Ponto(12, "Montreal 2", "06:24", "07:29", "030"));
        pontos30.add(new Ponto(13, "Bar Sr. Dito", "06:25", "07:30", "030"));
        pontos30.add(new Ponto(14, "Nestle", "06:26", "07:31", "030"));
        pontos30.add(new Ponto(15, "Padaria Pao Quente", "06:27", "07:32", "030"));
        pontos30.add(new Ponto(16, "Ceramica Monte Carlo", "06:28", "07:33", "030"));
        pontos30.add(new Ponto(17, "Jardim Oriente", "06:30", "07:35", "030"));
        pontos30.add(new Ponto(18, "Praca Sao Sebastiao", "06:34", "07:39", "030"));
        pontos30.add(new Ponto(19, "Sao Sebastiao 2", "06:35", "07:40", "030"));
        pontos30.add(new Ponto(20, "Jardim Oriente", "06:38", "07:43", "030"));
        pontos30.add(new Ponto(21, "Ceramca Monte Carlo", "06:40", "07:45", "030"));
        pontos30.add(new Ponto(22, "Padaria Pao Quente", "06:41", "07:46", "030"));
        pontos30.add(new Ponto(23, "SESI", "06:43", "07:48", "030"));
        pontos30.add(new Ponto(24, "Bar Buda", "06:45", "07:50", "030"));
        pontos30.add(new Ponto(25, "Parana com BH", "06:46", "07:51", "030"));
        pontos30.add(new Ponto(26, "Ceara com BH", "06:48", "07:52", "030"));
        pontos30.add(new Ponto(27, "Vendao", "06:49", "07:54", "030"));
        pontos30.add(new Ponto(28, "Minas Shopping", "06:51", "07:56", "030"));
        pontos30.add(new Ponto(29, "Praca da Matriz", "06:54", "07:59", "030"));
        pontos30.add(new Ponto(30, "Praca N. S. Rosario", "06:56", "08:01", "030"));
        pontos30.add(new Ponto(31, "Praca 3 de Outubro", "06:57", "08:02", "030"));
        pontos30.add(new Ponto(32, "Rodoviaria", "06:59", "08:05", "030"));

    }

    static {
        pontos40 = new ArrayList<Ponto>();
        pontos40.add(new Ponto(1, "Rodoviaria", "06:00", "07:10", "040"));
        pontos40.add(new Ponto(2, "Praca 3 de Outubro", "06:02", "07:17", "040"));
        pontos40.add(new Ponto(3, "Praca N. S. Rosario", "06:03", "07:18", "040"));
        pontos40.add(new Ponto(4, "Rua Juca Resende", "06:04", "07:19", "040"));
        pontos40.add(new Ponto(5, "Mercado Mendonca", "06:05", "07:20", "040"));
        pontos40.add(new Ponto(6, "Biolac", "06:06", "07:21", "040"));
        pontos40.add(new Ponto(7, "Horto Florestal", "06:07", "07:22", "040"));
        pontos40.add(new Ponto(8, "Igreja de Deus", "06:08", "07:24", "040"));
        pontos40.add(new Ponto(9, "Salao Santa Rita", "06:09", "07:27", "040"));
        pontos40.add(new Ponto(10, "Santo Agostinho", "06:11", "07:30", "040"));
        pontos40.add(new Ponto(11, "E. M. Santa Rita", "06:13", "07:32", "040"));
        pontos40.add(new Ponto(12, "Padaria Santa Rita", "06:14", "07:33", "040"));
        pontos40.add(new Ponto(13, "Ceramica Carmelo", "06:16", "07:35", "040"));
        pontos40.add(new Ponto(14, "Rua Sao Luiz", "06:18", "07:38", "040"));
        pontos40.add(new Ponto(15, "Praca Lagoinha", "06:19", "07:39", "040"));
        pontos40.add(new Ponto(16, "Schincariol", "06:20", "07:40", "040"));
        pontos40.add(new Ponto(17, "Praca Catulina", "06:22", "07:42", "040"));
        pontos40.add(new Ponto(18, "Caixa D'agua", "06:23", "07:43", "040"));
        pontos40.add(new Ponto(19, "Mercado Valtinho", "06:24", "07:44", "040"));
        pontos40.add(new Ponto(20, "Pe de Manga", "06:26", "07:46", "040"));
        pontos40.add(new Ponto(21, "Super Seu", "06:28", "07:48", "040"));
        pontos40.add(new Ponto(22, "Quadra Bairro Carmo", "06:29", "07:49", "040"));
        pontos40.add(new Ponto(23, "JackSom", "06:31", "07:51", "040"));
        pontos40.add(new Ponto(24, "Praca dos Peixinhos", "06:33", "07:53", "040"));
        pontos40.add(new Ponto(25, "Minas Shopping", "06:35", "07:55", "040"));
        pontos40.add(new Ponto(26, "Vendao", "06:41", "07:56", "040"));
        pontos40.add(new Ponto(27, "APAE", "06:42", "07:57", "040"));
        pontos40.add(new Ponto(28, "Praca N. S. Fatima", "06:43", "07:58", "040"));
        pontos40.add(new Ponto(29, "Ceara com BH", "06:47", "08:02", "040"));
        pontos40.add(new Ponto(30, "Supermercado Neto", "06:49", "08:04", "040"));
        pontos40.add(new Ponto(31, "Centro Comunitario", "06:48", "08:05", "040"));
        pontos40.add(new Ponto(32, "Jardim Ipiranga", "06:49", "08:06", "040"));
        pontos40.add(new Ponto(33, "Olaria Rua Araguaia", "06:50", "08:07", "040"));
        pontos40.add(new Ponto(34, "E.E. Dona Sinada", "06:52", "08:09", "040"));
        pontos40.add(new Ponto(35, "Praca N. S. Rosasrio", "06:53", "08:10", "040"));
        pontos40.add(new Ponto(36, "Praca 3 de Outubro", "06:55", "08:12", "040"));
        pontos40.add(new Ponto(37, "Rodoviaria", "06:57", "08:15", "040"));

    }

    static {
        pontos50 = new ArrayList<>();
        pontos50.add(new Ponto(1, "SESI", "06:20", "08:20", "050"));
        pontos50.add(new Ponto(2, "Praca N. S. Fatima", "06:21", "08:21", "050"));
        pontos50.add(new Ponto(3, "Carmel Veiculos", "06:23", "08:23", "050"));
        pontos50.add(new Ponto(4, "Praca Prefeitura", "06:27", "08:27", "050"));
        pontos50.add(new Ponto(5, "Praca 3 de Outubro", "06:31", "08:31", "050"));
        pontos50.add(new Ponto(6, "Super Seu", "06:33", "08:33", "050"));
        pontos50.add(new Ponto(7, "Deposito Eletroom", "06:35", "08:35", "050"));
        pontos50.add(new Ponto(8, "UFU campus Novo", "06:40", "08:40", "050"));
        pontos50.add(new Ponto(9, "UFU campus Novo", "06:50", "08:50", "050"));
        pontos50.add(new Ponto(10, "Deposito Eletroom", "06:55", "08:55", "050"));
        pontos50.add(new Ponto(11, "Super Seu", "06:58", "08:58", "050"));
        pontos50.add(new Ponto(12, "Noiva Chick", "07:01", "09:01", "050"));
        pontos50.add(new Ponto(13, "Bistro", "07:03", "09:03", "050"));
        pontos50.add(new Ponto(14, "Colegio Amparo", "07:04", "09:04", "050"));
        pontos50.add(new Ponto(15, "DER", "07:07", "09:07", "050"));
        pontos50.add(new Ponto(16, "Carmel Veiculos", "07:10", "09:10", "050"));
        pontos50.add(new Ponto(17, "Praca N. S. Fatima", "07:15", "09:15", "050"));
        pontos50.add(new Ponto(18, "SESI", "07:20", "09:20", "050"));
    }

    static {
        pontos = new ArrayList<>();
        pontos.add(new Ponto(1, "Bistro", "07:03", "09:03", "050"));
        pontos.add(new Ponto(1, "Colegio Amparo", "07:04", "09:04", "050"));
        pontos.add(new Ponto(1, "DER", "07:07", "09:07", "050"));
        pontos.add(new Ponto(1, "Carmel Veiculos", "07:10", "09:10", "050"));
        pontos.add(new Ponto(1, "Praca N. S. Fatima", "07:15", "09:15", "050"));
        pontos.add(new Ponto(1, "SESI", "07:20", "09:20", "050"));
    }
    
    static {
        todos = new ArrayList<>();
        for (Ponto p: pontos10) {
            todos.add(p);
        }
        for (Ponto p: pontos20) {
            todos.add(p);
        }
        for (Ponto p: pontos30) {
            todos.add(p);
        }
        for (Ponto p: pontos40) {
            todos.add(p);
        }
        for (Ponto p: pontos50) {
            todos.add(p);
        }
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Ponto> obterPessoas() {
        return pontos;
    }

    @GET
    @Path("/ponto10")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ponto> obterPessoa10() {
        return pontos10;
    }

    @GET
    @Path("/ponto20")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ponto> obterPessoa20() {
        return pontos20;
    }

    @GET
    @Path("/ponto30")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ponto> obterPessoa30() {
        return pontos30;
    }

    @GET
    @Path("/ponto40")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ponto> obterPessoa40() {
        return pontos40;
    }
    
    @GET
    @Path("/ponto50")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ponto> obterPessoa50() {
        return pontos50;
    }
    
    @GET
    @Path("/todos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ponto> obterPessoaTd() {
        return todos;
    }

    @GET
    @Path("/ponto10/{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoa10(@PathParam("ponto") int id) {
        return obterPessoa10().get(id);
    }

    @GET
    @Path("/ponto20/{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoa20(@PathParam("ponto") int id) {
        return obterPessoa20().get(id);
    }

    @GET
    @Path("/ponto30/{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoa30(@PathParam("ponto") int id) {
        return obterPessoa30().get(id);
    }

    @GET
    @Path("/ponto40/{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoa40(@PathParam("ponto") int id) {
        return obterPessoa40().get(id);
    }

    @GET
    @Path("/ponto50/{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoa50(@PathParam("ponto") int id) {
        return obterPessoa50().get(id);
    }
    
    @GET
    @Path("/todos/{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoaTd(@PathParam("ponto") int id) {
        return obterPessoaTd().get(id);
    }
    
    @GET
    @Path("{ponto}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ponto obterPessoa(@PathParam("ponto") int id) {
        return obterPessoas().get(id);
    }

    /*@POST
     @Consumes(MediaType.APPLICATION_JSON)
     @Produces(MediaType.TEXT_PLAIN)
     public String insert(Ponto p) {
     if (p != null) {
     pontos.add(p);
     return "Funcionou!";
     } else {
     return "Erro ao adicionar pessoa.";
     }
     }*/
}
