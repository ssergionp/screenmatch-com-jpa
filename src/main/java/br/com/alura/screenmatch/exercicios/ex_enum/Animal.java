package br.com.alura.screenmatch.exercicios.ex_enum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
    // Criando o logger para esta classe
    private static final Logger logger = LoggerFactory.getLogger(Animal.class);
    private String nome;
    private TipoAnimal tipo;

    public Animal(String nome, TipoAnimal tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void exibirDetalhes() {
        // Substituindo o System.out.println
        logger.info("Animal: {} | Categoria: {}", nome, tipo);
    }

    public String getNome() {
        return nome;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }
}
