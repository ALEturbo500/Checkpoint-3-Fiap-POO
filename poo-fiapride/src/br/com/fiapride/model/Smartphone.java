package br.com.fiapride.model;

// Aula 6/7 - Classe filha Smartphone, herda de DispositivoEletronico
// Aula 9 - Implementa Recarregavel
public class Smartphone extends DispositivoEletronico implements Recarregavel {

    private String sistema;
    private int nivelBateria;

    public Smartphone(String marca, String cor, String sistema, int nivelBateria) {
        super(marca, cor);
        this.sistema = sistema;
        this.nivelBateria = nivelBateria;
    }

    public String getSistema() { return sistema; }
    public int getNivelBateria() { return nivelBateria; }

    // Aula 7 - Polimorfismo com @Override
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Sistema: " + sistema + " | Bateria: " + nivelBateria + "%");
    }

    // Aula 8 - Implementação obrigatória do método abstrato
    @Override
    public void ligar() {
        System.out.println("Smartphone " + marca + " ligado! Sistema: " + sistema);
    }

    // Aula 9 - Implementação da interface
    @Override
    public void recarregar() {
        this.nivelBateria = Recarregavel.NIVEL_MAXIMO;
        System.out.println("Smartphone recarregado! Nível: " + nivelBateria + "%");
    }
}
