package br.com.fiapride.main;

import br.com.fiapride.model.ControlePs4;
import br.com.fiapride.model.Passageiro;

// Aula 1 - Classe principal com testes
public class SistemaPrincipal {

    public static void main(String[] args) {

        // Teste FiapRide - Passageiro
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        System.out.println("Passageiro: " + passageiro1.nome);
        System.out.println("Saldo: R$" + passageiro1.saldo);

        // Teste Projeto Pessoal - ControlePs4
        ControlePs4 meuControle = new ControlePs4();
        meuControle.cor = "Vermelho";
        meuControle.corDoLed = "Azul";
        meuControle.capacidadeTotalMah = 1000;

        ControlePs4 controleDoAmigo = new ControlePs4();
        controleDoAmigo.cor = "Preto";
        controleDoAmigo.corDoLed = "Vermelho";
        controleDoAmigo.capacidadeTotalMah = 1000;

        System.out.println("Meu Controle é: " + meuControle.cor);
        System.out.println("O do meu amigo é: " + controleDoAmigo.cor);
    }
}
