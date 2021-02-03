package br.com.bootcamp.aula.interfaces.animal;

import br.com.bootcamp.aula.interfaces.Imprimivel;

//classe abstrata: Animal
//implementa a interface: Imprimível
//como a classe animal é abstrata a implementação não é obrigatória nela, mas sim nas subclasses concretas dela
public abstract class Animal implements Imprimivel {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //método abstrato
    public abstract void emitirSom();
}
