package br.com.fiapride.model;

// =====================================================
// AULA 6 - Herança: classe mãe DispositivoEletronico
// =====================================================
// Aula 7 - Polimorfismo: método exibirInfo() na superclasse
// Aula 8 - Classe Abstrata: DispositivoEletronico se torna abstract
public abstract class DispositivoEletronico {

    // Aula 6 - atributo com modificador adequado (protected para ser herdado)
    protected String marca;
    protected String cor;

    public DispositivoEletronico(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() { return marca; }
    public String getCor() { return cor; }

    // Aula 7 - Polimorfismo: método na superclasse, sobrescrito nas filhas
    public void exibirInfo() {
        System.out.println("Dispositivo: " + marca + " | Cor: " + cor);
    }

    // Aula 8 - Método abstrato que obriga implementação nas filhas
    public abstract void ligar();
}
