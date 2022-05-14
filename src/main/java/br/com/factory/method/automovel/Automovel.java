package br.com.factory.method.automovel;

import br.com.factory.method.util.NumeroUtil;
import br.com.factory.method.veiculo.Veiculo;

import static org.joda.time.DateTime.now;
import java.math.BigDecimal;


public class Automovel extends Veiculo {
    private BigDecimal tempoParaAtingirCemKilometrosPorHora;
    private BigDecimal deslocamento;
    private int numeroDePassageiros;
    private int ano;

    public Automovel(String placa, String marca, String modelo, String cor) {
        super(placa, marca,modelo,cor);
        this.tempoParaAtingirCemKilometrosPorHora = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(10), new BigDecimal(30))));
        this.deslocamento = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(50), new BigDecimal(650))));
        this.numeroDePassageiros = (int) NumeroUtil.geraDoubleAleatorioEntre(1, 4);
        this.ano = (int) NumeroUtil.geraDoubleAleatorioEntre(1920, now().getYear());
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "tempoParaAtingirCemKilometrosPorHora=" + tempoParaAtingirCemKilometrosPorHora +
                ", deslocamento=" + deslocamento +
                ", numeroDePassageiros=" + numeroDePassageiros +
                ", ano=" + ano +
                "} " + super.toString();
    }

    @Override
    public void criaDeslocamento() {
        System.out.println("O deslocamento feito foi de " + deslocamento);
    }
}
