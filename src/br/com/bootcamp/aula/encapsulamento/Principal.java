package br.com.bootcamp.aula.encapsulamento;

public class Principal {

    public static void main(String[] a) {

        //criei um objeto cachorro com o nome Scooby
        Cachorro cachorro = new Cachorro("Scooby");

        //alterei o nome do cachorro de Scooby para Bob
        cachorro.setNome("Bob");

        //mostrei no console o nome do cachorro
        System.out.println(cachorro.getNome());

    }

}
