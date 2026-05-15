package br.com.fiapride.model;

// Aula 5 - Associação entre classes (TEM-UM)

// Classe Bateria - será associada ao ControlePS4
public class Bateria {

    private int nivel;         // 0 a 100
    private int capacidadeMah;

    public Bateria(int nivel, int capacidadeMah) {
        this.nivel = nivel;
        this.capacidadeMah = capacidadeMah;
    }

    public int getNivel() {
        return nivel;
    }

    public int getCapacidadeMah() {
        return capacidadeMah;
    }

    public void recarregar() {
        this.nivel = 100;
        System.out.println("Bateria recarregada! Nível: 100%");
    }
}
