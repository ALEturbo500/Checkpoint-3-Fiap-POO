package br.com.fiapride.model;

// Aula 5 - ControlePS4 com Associação (TEM-UM: controle TEM-UMA bateria)
public class ControlePS4Aula5 {

    private String cor;
    private String modelo;
    private Bateria bateria; // Associação com a classe Bateria

    public ControlePS4Aula5(String cor, String modelo, Bateria bateria) {
        this.cor = cor;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void exibirDetalhes() {
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Nível da Bateria: " + bateria.getNivel() + "%");
    }
}
