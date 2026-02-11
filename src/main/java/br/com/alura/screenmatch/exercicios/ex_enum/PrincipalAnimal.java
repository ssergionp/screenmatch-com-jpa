package br.com.alura.screenmatch.exercicios.ex_enum;

import java.util.ArrayList;
import java.util.List;

public class PrincipalAnimal {
    public static void main(String[] args) {
        // Criando instâncias usando o Enum
        Animal leao = new Animal("Leão", TipoAnimal.MAMIFERO);
        Animal jacare = new Animal("Jacaré", TipoAnimal.REPTIL);
        Animal aguia = new Animal("Águia", TipoAnimal.AVE);

        // Adicionando em uma lista para iterar
        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(leao);
        listaAnimais.add(jacare);
        listaAnimais.add(aguia);

        System.out.println("--- Listagem de Animais ---");
        for (Animal animal : listaAnimais) {
            animal.exibirDetalhes();
        }

        // Exemplo de verificação com IF ou SWITCH
        if (leao.getTipo() == TipoAnimal.MAMIFERO) {
            System.out.println("\nO " + leao.getNome() + " amamenta seus filhotes.");
        }
    }
}
