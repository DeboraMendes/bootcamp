package br.com.bootcamp.aula.interfaces;

import br.com.bootcamp.aula.interfaces.animal.Animal;
import br.com.bootcamp.aula.interfaces.animal.Cachorro;
import br.com.bootcamp.aula.interfaces.animal.Gato;
import br.com.bootcamp.aula.interfaces.relatorio.Relatorio;

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

        //instancio a classe relatório
        Relatorio relatorio = new Relatorio();
        //o método gerar recebe um objeto Imprimivel, nesse caso, Animal
        //mas poderia ser qualquer objeto Imprimivel, não necessariamente um Animal
        relatorio.gerar(cachorro);
        relatorio.gerar(gato);

    }

}
