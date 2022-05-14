package br.com.factory.method;

import br.com.factory.method.veiculo.Veiculo;
import br.com.factory.method.veiculo.VeiculoControle;
import br.com.factory.method.veiculo.VeiculoFactory;

public class FactoryMethodVeiculosApplication {
    public static void main(String[] args) {
        VeiculoControle veiculoControle = new VeiculoControle();
        String opcaoEscolhida = veiculoControle.abreMenu();
        Veiculo veiculo = veiculoControle.inicioMovimentacao(VeiculoFactory.valueOf(opcaoEscolhida.toUpperCase()));
        veiculoControle.deslocamentoVeiculo(veiculo);

        System.out.println("Características do veículo: " + veiculo);
    }
}
