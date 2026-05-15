package br.com.fiapride.model;

// Aula 3 - Encapsulamento com modificadores de acesso
public class PassageiroV3 {

    // Atributos privados - encapsulamento
    private String nome;
    private double saldo;

    // Getters públicos - retornam cópia segura do valor
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters privados - só métodos internos da classe podem alterar diretamente
    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: nome inválido.");
            return;
        }
        this.nome = nome;
    }

    private void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Erro: saldo não pode ser negativo.");
            return;
        }
        this.saldo = saldo;
    }

    // Métodos públicos de negócio que controlam o acesso
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor inválido.");
            return;
        }
        this.saldo += valor;
        System.out.println("Saldo adicionado. Novo saldo: R$" + this.saldo);
    }

    public boolean pagarViagem(double valor) {
        if (valor <= 0 || this.saldo < valor) {
            System.out.println("Pagamento não realizado. Verifique o valor ou o saldo.");
            return false;
        }
        this.saldo -= valor;
        System.out.println("Viagem paga: R$" + valor + ". Saldo: R$" + this.saldo);
        return true;
    }

    public void cadastrar(String nome, double saldoInicial) {
        setNome(nome);
        setSaldo(saldoInicial);
    }
}
