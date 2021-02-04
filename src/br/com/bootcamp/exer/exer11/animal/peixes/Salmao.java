package br.com.bootcamp.exer.exer11.animal.peixes;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;

public class Salmao implements Animal {

    private final Especie especie;
    private final String nome;

    public Salmao(Especie especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    @Override
    public Especie getEspecie() {
        return especie;
    }

    @Override
    public String getNome() {
        return nome;
    }

}
