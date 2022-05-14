package br.com.factory.method.veiculo;

import br.com.factory.method.automovel.Automovel;
import br.com.factory.method.caminhao.Caminhao;
import br.com.factory.method.motocicleta.Motocicleta;
import br.com.factory.method.van.Van;


public enum VeiculoFactory {
    A("Automovel") {
        @Override
        public Veiculo fabrica(String placa, String marca, String modelo, String cor) {
            return new Automovel(placa, marca, modelo, cor);
        }
    },
    M("Motocicleta") {
        @Override
        public Veiculo fabrica(String placa, String marca, String modelo, String cor) {
            return new Motocicleta(placa, marca, modelo, cor);
        }
    },
    V("Van") {
        @Override
        public Veiculo fabrica(String placa, String marca, String modelo, String cor) {
            return new Van(placa, marca, modelo, cor);
        }
    },
    C("Caminhão") {
        @Override
        public Veiculo fabrica(String placa, String marca, String modelo, String cor) {
            return new Caminhao(placa, marca, modelo, cor);
        }
    };

    private String nome;

    VeiculoFactory(String nome) {
        this.nome = nome;
    }

    public abstract Veiculo fabrica(String placa, String marca, String modelo, String cor);
}
