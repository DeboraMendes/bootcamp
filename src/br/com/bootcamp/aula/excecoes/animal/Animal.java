package br.com.bootcamp.aula.excecoes.animal;

import br.com.bootcamp.aula.excecoes.exception.AnimalException;

public abstract class Animal {

    private String nome;

    public Animal(String nome) {
        //se o nome do animal for null será lançada a exceção com a mensagem definida
        if (nome == null) {
            throw new AnimalException("O nome do animal é obrigatório.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
