package br.com.fiapride.main;

import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

// Classe principal de testes - Aulas 5 a 9
public class Main {

    public static void main(String[] args) {

        System.out.println("=== AULA 5 - Associação ===");
        Bateria bateria1 = new Bateria(75, 1560);
        ControlePS4Aula5 controle5 = new ControlePS4Aula5("Preto", "DualShock 4", bateria1);
        controle5.exibirDetalhes();

        System.out.println("\n=== AULA 6 - Herança ===");
        ControlePS4Final controle6 = new ControlePS4Final("Sony", "Preto", "DualShock 4", 80);
        Smartphone smartphone6 = new Smartphone("Samsung", "Azul", "Android", 60);
        controle6.exibirInfo();
        smartphone6.exibirInfo();

        System.out.println("\n=== AULA 7 - Polimorfismo ===");
        List<DispositivoEletronico> dispositivos = new ArrayList<>();
        dispositivos.add(new ControlePS4Final("Sony", "Branco", "DualShock 4 v2", 50));
        dispositivos.add(new Smartphone("Apple", "Preto", "iOS", 90));

        for (DispositivoEletronico d : dispositivos) {
            d.ligar(); // Polimorfismo em ação!
        }

        System.out.println("\n=== AULA 8 - Classes Abstratas ===");
        // Não é possível fazer: new DispositivoEletronico() - ERRO DE COMPILAÇÃO
        // DispositivoEletronico d = new DispositivoEletronico(); // impossível!
        ControlePS4Final controle8 = new ControlePS4Final("Sony", "Vermelho", "Special Edition", 30);
        controle8.ligar();

        System.out.println("\n=== AULA 9 - Interfaces ===");
        Recarregavel[] recarregaveis = {
            new ControlePS4Final("Sony", "Preto", "DualShock 4", 15),
            new Smartphone("Motorola", "Cinza", "Android", 8)
        };

        for (Recarregavel r : recarregaveis) {
            r.verificarNivel(15);
            r.recarregar();
        }
    }
}
