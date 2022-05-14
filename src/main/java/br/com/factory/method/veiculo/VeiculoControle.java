package br.com.factory.method.veiculo;

import javax.swing.*;

public class VeiculoControle {
    public Veiculo inicioMovimentacao(VeiculoFactory veiculoFactory) {
       return veiculoFactory.fabrica(placaVeiculo(), marcaVeiculo(),modeloVeiculo(), corVeiculo());
    }

    public void deslocamentoVeiculo(Veiculo veiculo) {
        veiculo.criaDeslocamento();
    }

    private String placaVeiculo() {
        return JOptionPane.showInputDialog("Digite a placa do veículo que você quer adicionar");
    }

    private String marcaVeiculo() {
        return JOptionPane.showInputDialog("Digite a marca do veículo que você quer adicionar");
    }

    private String modeloVeiculo() {
        return JOptionPane.showInputDialog("Digite o modelo que você quer adicionar");
    }

    private String corVeiculo() {
        return JOptionPane.showInputDialog("Digite a cor que você quer adicionar");
    }

    public String abreMenu() {
        return JOptionPane.showInputDialog(null, "Ecolha uma letra e crie um veículo correspondete: " +
                "A(Cria funcionário Automovel), M(Cria motocicleta), V(Cria van), " +
                "C(Criar caminhão)");
    }

}
