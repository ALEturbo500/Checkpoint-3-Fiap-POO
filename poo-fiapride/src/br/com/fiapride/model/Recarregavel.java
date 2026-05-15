package br.com.fiapride.model;

// Aula 9 - Interface com método abstrato e constante
public interface Recarregavel {

    // Constante de interface
    int NIVEL_MAXIMO = 100;

    // Método abstrato que toda classe que implementar deve definir
    void recarregar();

    // Método com implementação padrão
    default void verificarNivel(int nivel) {
        if (nivel < 20) {
            System.out.println("Atenção: bateria baixa! Nível: " + nivel + "%");
        } else {
            System.out.println("Nível de bateria OK: " + nivel + "%");
        }
    }
}
