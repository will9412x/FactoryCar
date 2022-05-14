package br.com.factory.method.van;

import br.com.factory.method.util.NumeroUtil;
import br.com.factory.method.veiculo.Veiculo;

public class Van extends Veiculo {
    private int numeroDePassageiros;
    private int numeroDeParadas;

    public Van(String placa, String marca, String modelo, String cor) {
        super(placa, marca,modelo,cor);
        this.numeroDeParadas = (int) NumeroUtil.geraDoubleAleatorioEntre(3, 12);
        this.numeroDePassageiros = (int) NumeroUtil.geraDoubleAleatorioEntre(3, 12);
    }

    @Override
    public void criaDeslocamento() {
        System.out.println("Não há deslocamento!");
    }
}
