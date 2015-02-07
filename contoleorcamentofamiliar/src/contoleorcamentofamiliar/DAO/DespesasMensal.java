/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoleorcamentofamiliar.DAO;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Marcio e Polliny
 */
public class DespesasMensal {

    private final DespAlimentacaoMensal despesaAlimentacao = new DespAlimentacaoMensal();
    private final DespBancariasMensal despesaBancaria = new DespBancariasMensal();
    private final DespEducacaoMensal despesaaEducacao = new DespEducacaoMensal();
    private final DespLazerMensal despasaLazer = new DespLazerMensal();
    private final DespMoradiaMensal despesaMoradia = new DespMoradiaMensal();
    private final DespOutrosGastosMensal despesaOutros = new DespOutrosGastosMensal();
    private final DespSaudeMensal despesaSaude = new DespSaudeMensal();
    private final DespTransporteMensal despesaTransporte = new DespTransporteMensal();
    private final DespVestuarioMensal despesaVestuario = new DespVestuarioMensal();
    private String mesExercicio;

    public DespesasMensal() {

    }

    public DespAlimentacaoMensal getDespesaAlimentacao() {
        return despesaAlimentacao;
    }

    public DespBancariasMensal getDespesaBancaria() {
        return despesaBancaria;
    }

    public DespEducacaoMensal getDespesaaEducacao() {
        return despesaaEducacao;
    }

    public DespLazerMensal getDespasaLazer() {
        return despasaLazer;
    }

    public DespMoradiaMensal getDespesaMoradia() {
        return despesaMoradia;
    }

    public DespOutrosGastosMensal getDespesaOutros() {
        return despesaOutros;
    }

    public DespSaudeMensal getDespesaSaude() {
        return despesaSaude;
    }

    public DespTransporteMensal getDespesaTransporte() {
        return despesaTransporte;
    }

    public DespVestuarioMensal getDespesaVestuario() {
        return despesaVestuario;
    }

    public String getMesExercicio() {
        return mesExercicio;
    }

    public double somaDespesaMensal() {
        return this.despesaAlimentacao.somaDespesasAlimentacao()
                + this.despasaLazer.somaDespesasLazer()
                + this.despesaBancaria.somaDespesasBancarias()
                + this.despesaMoradia.somaDespesasMoradia()
                + this.despesaOutros.somaDespesasOutrosGastos()
                + this.despesaSaude.somaDespesasSaude()
                + this.despesaTransporte.somaDespesasTranspote()
                + this.despesaVestuario.somaDespesasVestuario()
                + this.despesaaEducacao.somaDespesasEducacao();

    }

    public void setMesExercicio(String mesExercicio) {
        this.mesExercicio = mesExercicio;
    }

    public void gravarDados() {
        try {
            FileWriter fw = new FileWriter("DespesaMensal" + this.getMesExercicio().toLowerCase() + ".txt");
            fw.write(this.getDespasaLazer().toString() + "\n" + this.getDespesaAlimentacao().toString()
                    + "\n" + this.getDespesaBancaria().toString() + "\n" + this.getDespesaMoradia().toString()
                    + "\n" + this.getDespesaOutros() + "\n" + this.getDespesaSaude().toString()
                    + "\n" + this.getDespesaTransporte().toString() + "\n" + this.getDespesaVestuario().toString()
                    + "\n" + this.getDespesaaEducacao().toString());
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void lerDados(String mes) {
        try {
            FileReader fr = new FileReader("DespesaMensal" + mes.toLowerCase() + ".txt");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
