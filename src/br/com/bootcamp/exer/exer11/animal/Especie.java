package br.com.bootcamp.exer.exer11.animal;

/**
 * crie um enum Especie com as opções
 * AVES, MAMIFEROS, PEIXES, REPTEIS
 * adicione uma descrição para cada opção
 */
public enum Especie {

    AVES("Aves"),
    MAMIFEROS("Mamíferos"),
    PEIXES("Peixes"),
    REPTEIS("Répteis");

    private final String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
