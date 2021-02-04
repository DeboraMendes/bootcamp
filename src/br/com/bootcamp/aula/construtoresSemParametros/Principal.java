package br.com.bootcamp.aula.construtoresSemParametros;

public class Principal {

    public static void main(String[] a) {
        //cada instância é um objeto, ou seja, um cachorro
        //crio um objeto cachorro sem informar o nome e informo o nome depois

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Scooby";

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Bob";

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Rex";
    }

}
