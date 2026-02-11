package br.com.alura.screenmatch.exercicios.ex_enum;

public enum TipoAnimal {
    MAMIFERO("Possui pelos e glândulas mamárias"),
    REPTIL("Possui escamas e sangue frio"),
    ANFIBIO("Vive em ambiente terrestre e aquático"),
    PEIXE("Possui brânquias e vive na água"),
    AVE("Possui penas e bico");

    private String descricao;

    TipoAnimal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
