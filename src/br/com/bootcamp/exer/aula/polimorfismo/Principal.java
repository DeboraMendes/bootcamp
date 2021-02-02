package br.com.bootcamp.exer.aula.polimorfismo;


import br.com.bootcamp.exer.aula.polimorfismo.animal.Animal;
import br.com.bootcamp.exer.aula.polimorfismo.animal.Cachorro;
import br.com.bootcamp.exer.aula.polimorfismo.animal.Gato;

public class Principal {

    public static void main(String[] a) {

        //criei um animal cachorro com o nome Scooby
        Animal cachorro = new Cachorro("Scooby");
        //o cachorro deve emitir o som Auauauauau
        cachorro.emitirSom();

        //criei um animal gato com o nome Luna
        Animal gato = new Gato("Luna");
        //o gato deve emitir o som Miaumiaumiau
        gato.emitirSom();

    }

}
