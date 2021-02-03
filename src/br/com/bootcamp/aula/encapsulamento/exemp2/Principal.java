package br.com.bootcamp.aula.encapsulamento.exemp2;

public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(2, 2));
        System.out.println(calculadora.subitrair(2, 2));
        System.out.println(calculadora.multiplicar(2, 2));
        System.out.println(calculadora.dividir(5, 2));
    }

}
