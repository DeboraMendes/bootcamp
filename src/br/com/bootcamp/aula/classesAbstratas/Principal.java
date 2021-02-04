package br.com.bootcamp.aula.classesAbstratas;

import br.com.bootcamp.aula.classesAbstratas.animal.Animal;
import br.com.bootcamp.aula.classesAbstratas.animal.Cachorro;
import br.com.bootcamp.aula.classesAbstratas.animal.Gato;

public class Principal {

    public static void main(String[] a) {

        //criei um animal cachorro com o nome Scooby
        Animal cachorro = new Cachorro("Scooby");
        //criei um animal gato com o nome Luna
        Animal gato = new Gato("Luna");

    }

}
