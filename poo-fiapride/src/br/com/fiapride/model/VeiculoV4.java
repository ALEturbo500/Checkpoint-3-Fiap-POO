package br.com.fiapride.model;

// Aula 4 - Construtores para inicializar objetos
public class Veiculo {

    private String modelo;
    private String placa;

    // Construtor padrão
    public Veiculo() {
        this.modelo = "Desconhecido";
        this.placa = "XXX-0000";
    }

    // Construtor customizado
    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        setPlaca(placa); // usa o setter privado para validar
    }

    // Getter público - seguro
    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    // Setter privado de placa (regra interna)
    // Nota: não criamos setModelo() pois o modelo de um veículo não muda
    private void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            System.out.println("Placa inválida.");
            return;
        }
        this.placa = placa;
    }

    // Método público para atualizar placa (simula processo oficial)
    public void atualizarPlaca(String novaPlaca) {
        System.out.println("Iniciando processo de atualização de placa...");
        setPlaca(novaPlaca);
        System.out.println("Placa atualizada para: " + this.placa);
    }

    public void exibirInfo() {
        System.out.println("Veículo: " + modelo + " | Placa: " + placa);
    }
}
