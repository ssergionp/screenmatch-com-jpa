package br.com.alura.screenmatch.exercicios.metodo_estatico;

public class MathUtils {
    // SOLUÇÃO: Construtor privado para impedir a instanciação
    private MathUtils() {
        throw new IllegalStateException("Classe utilitária - não deve ser instanciada");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
