package br.com.factory.method.motocicleta;

import br.com.factory.method.util.NumeroUtil;
import br.com.factory.method.veiculo.Veiculo;

import java.math.BigDecimal;

public class Motocicleta extends Veiculo {
    private BigDecimal deslocamento;
    private BigDecimal valorDoFrete;

    private BigDecimal cilindradas;

    public Motocicleta(String placa, String marca, String modelo, String cor) {
        super(placa, marca,modelo,cor);
        this.deslocamento = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(20), new BigDecimal(100))));
        this.valorDoFrete = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(30), new BigDecimal(80))));
        this.cilindradas = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(10), new BigDecimal(10000))));
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "deslocamento=" + deslocamento +
                ", valorDoFrete=" + valorDoFrete +
                '}';
    }

    @Override
    public void criaDeslocamento() {
        System.out.println("O deslocamento feito foi de " + deslocamento);
    }
}
