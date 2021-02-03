package br.com.bootcamp.aula.classeAbstrata;

import br.com.dev.bootcamp.aula.classeAbstrata.animal.Animal;
import br.com.dev.bootcamp.aula.classeAbstrata.animal.Cachorro;
import br.com.dev.bootcamp.aula.classeAbstrata.animal.Gato;

public class Principal {

    public static void main(String[] a) {

        //criei um animal cachorro com o nome Scooby
        Animal cachorro = new Cachorro("Scooby");
        //criei um animal gato com o nome Luna
        Animal gato = new Gato("Luna");

    }

}
