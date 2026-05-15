package br.com.fiapride.model;

// Aula 9 - CarroEletrico implementando interface Recarregavel
public class CarroEletrico implements Recarregavel {

    private String modelo;
    private int nivelBateria;

    public CarroEletrico(String modelo, int nivelBateria) {
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

    public String getModelo() { return modelo; }
    public int getNivelBateria() { return nivelBateria; }

    // Implementação obrigatória do contrato da interface
    @Override
    public void recarregar() {
        System.out.println("Carregando veículo elétrico " + modelo + "...");
        this.nivelBateria = Recarregavel.NIVEL_MAXIMO;
        System.out.println("Veículo totalmente carregado! Nível: " + nivelBateria + "%");
    }

    public void exibirInfo() {
        System.out.println("Carro Elétrico: " + modelo + " | Bateria: " + nivelBateria + "%");
    }
}
