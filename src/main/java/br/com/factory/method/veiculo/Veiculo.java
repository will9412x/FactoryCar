package br.com.factory.method.veiculo;

import br.com.factory.method.util.NumeroUtil;

import java.math.BigDecimal;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private BigDecimal velocidadeMaxima;

    public Veiculo(String placa, String marca, String modelo, String cor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeMaxima = new BigDecimal(String.valueOf(NumeroUtil.geraBigDecimalAleatorioEntre(new BigDecimal(2000), new BigDecimal(5000))));
    }

    public abstract void criaDeslocamento();

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
