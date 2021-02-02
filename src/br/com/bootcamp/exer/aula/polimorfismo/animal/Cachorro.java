package br.com.bootcamp.exer.aula.polimorfismo.animal;

//classe concreta: Cachorro
//Cachorro é um Animal
public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    //implementação do método abstrato
    //como deve funcionar para o cachorro
    @Override
    public void emitirSom() {
        System.out.println("Auauauauau");
    }

}
