package br.com.bootcamp.aula.encapsulamento.exemp2;

public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(2, 2);
        System.out.println("Soma: " + calculadora.getResultado());
    }

}
