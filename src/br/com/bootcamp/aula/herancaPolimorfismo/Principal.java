package br.com.bootcamp.aula.herancaPolimorfismo;

import br.com.bootcamp.aula.herancaPolimorfismo.animal.Animal;
import br.com.bootcamp.aula.herancaPolimorfismo.animal.Cachorro;
import br.com.bootcamp.aula.herancaPolimorfismo.animal.Gato;

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
