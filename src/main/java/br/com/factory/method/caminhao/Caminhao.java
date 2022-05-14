package br.com.factory.method.caminhao;

import br.com.factory.method.util.NumeroUtil;
import br.com.factory.method.veiculo.Veiculo;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    private BigDecimal carga;
    private BigDecimal deslocamento;
    private BigDecimal valorDoFrete;
    private int quantidadeDeEixos;
    private int cargaMaxima;

    public Caminhao(String placa, String marca, String modelo, String cor) {
        super(placa, marca,modelo,cor);
        this.carga = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(1000), new BigDecimal(3000))));
        this.deslocamento = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(500), new BigDecimal(3000))));
        this.valorDoFrete = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(2000), new BigDecimal(5000))));
        this.quantidadeDeEixos = (int) NumeroUtil.geraDoubleAleatorioEntre(3, 12);
        this.cargaMaxima = (int) NumeroUtil.geraDoubleAleatorioEntre(10000, Integer.MAX_VALUE);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "carga=" + carga +
                ", deslocamento=" + deslocamento +
                ", valorDoFrete=" + valorDoFrete +
                ", quantidadeDeEixos=" + quantidadeDeEixos +
                ", cargaMaxima=" + cargaMaxima +
                "} " + super.toString();
    }

    @Override
    public void criaDeslocamento() {
        System.out.println("O deslocamento feito foi de " + deslocamento);
    }
}
