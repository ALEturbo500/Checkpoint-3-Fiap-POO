package br.com.fiapride.model;

// Aula 2 - Métodos com parâmetros e retorno
public class PassageiroV2 {

    public String nome;
    public double saldo;

    // Método para adicionar saldo com validação
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor inválido para recarga.");
            return;
        }
        this.saldo += valor;
        System.out.println("Saldo adicionado: R$" + valor + ". Novo saldo: R$" + this.saldo);
    }

    // Método para pagar viagem com validação
    public boolean pagarViagem(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor da viagem inválido.");
            return false;
        }
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente. Saldo atual: R$" + this.saldo);
            return false;
        }
        this.saldo -= valor;
        System.out.println("Viagem paga: R$" + valor + ". Saldo restante: R$" + this.saldo);
        return true;
    }

    // Método para exibir informações do passageiro
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + " | Saldo: R$" + this.saldo);
    }
}
