package br.com.bootcamp.exer.exer11.resultado;

import br.com.bootcamp.exer.exer11.animal.Especie;

/**
 * crie uma classe chamada Resultado
 * com os atributos espécie e quantidade,
 * os quais são obrigatórios.
 */
public class Resultado {

    private final Especie especie;
    private final Integer quantidade;

    public Resultado(Especie especie,
                     Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "especie=" + (especie != null ? especie.getDescricao() : especie) +
                ", quantidade=" + quantidade +
                '}';
    }
}
