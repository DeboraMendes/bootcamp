package br.com.bootcamp.aula.excecoes;

import br.com.bootcamp.aula.excecoes.animal.Animal;
import br.com.bootcamp.aula.excecoes.animal.Cachorro;

public class Principal {

    public static void main(String[] a) {

        //deve ser será lançada a exceção AnimalException com a mensagem "O nome do animal é obrigatório."
        Animal cachorro = new Cachorro(null);

    }

}
