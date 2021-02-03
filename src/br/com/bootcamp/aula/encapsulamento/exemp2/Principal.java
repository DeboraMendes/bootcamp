package br.com.bootcamp.aula.encapsulamento.exemp2;

public class Principal {

    public static void main(String[] args) {

        //criei uma calculadora
        Calculadora calculadora = new Calculadora();

        //chamei o método somar
        calculadora.somar(2, 2);

        //mostrei o resultado
        //note que ao usar eu não consigo saber como o cálculo foi feito
        //e também não tenho acesso para alterar o resultado
        System.out.println("Soma: " + calculadora.getResultado());

    }

}
