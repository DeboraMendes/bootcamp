package br.com.bootcamp.exer.exer11.animal.mamiferos;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;

public class Gato implements Animal {

    private final Especie especie;
    private final String nome;

    public Gato(Especie especie, String nome) {
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
