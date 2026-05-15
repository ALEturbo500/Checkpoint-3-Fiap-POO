package br.com.fiapride.model;

// Aula 6 - Herança: ControlePS4 herda de DispositivoEletronico
// Aula 7 - Polimorfismo: @Override em exibirInfo()
// Aula 8 - Implementação obrigatória de ligar() (método abstrato)
// Aula 9 - Implementa interface Recarregavel
public class ControlePS4Final extends DispositivoEletronico implements Recarregavel {

    private String modelo;
    private int nivelBateria;

    // Aula 6 - uso de super() no construtor
    public ControlePS4Final(String marca, String cor, String modelo, int nivelBateria) {
        super(marca, cor); // chama construtor da mãe
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

    public String getModelo() { return modelo; }
    public int getNivelBateria() { return nivelBateria; }

    // Aula 7 - Sobrescrita do método da superclasse com @Override
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // chama a versão da mãe
        System.out.println("Modelo: " + modelo + " | Bateria: " + nivelBateria + "%");
    }

    // Aula 8 - Implementação obrigatória do método abstrato ligar()
    @Override
    public void ligar() {
        System.out.println("Controle PS4 [" + modelo + "] ligado! Bateria: " + nivelBateria + "%");
    }

    // Aula 9 - Implementação do contrato da interface Recarregavel
    @Override
    public void recarregar() {
        System.out.println("Recarregando controle...");
        this.nivelBateria = Recarregavel.NIVEL_MAXIMO;
        System.out.println("Controle totalmente carregado! Nível: " + nivelBateria + "%");
    }
}
