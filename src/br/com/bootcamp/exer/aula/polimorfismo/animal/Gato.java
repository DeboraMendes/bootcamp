package br.com.bootcamp.exer.aula.polimorfismo.animal;

//classe concreta: Gato
//Gato é um Animal
public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    //implementação do método abstrato
    //como deve funcionar para o gato
    @Override
    public void emitirSom() {
        System.out.println("Miaumiaumiau");
    }
}
