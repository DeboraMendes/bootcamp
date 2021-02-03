package br.com.bootcamp.exer.exer10.teste;


import br.com.bootcamp.exer.exer10.figuraGeometrica.FiguraGeometrica;
import br.com.bootcamp.exer.exer10.figuraGeometrica.Quadrado;
import br.com.bootcamp.exer.exer10.figuraGeometrica.Retangulo;
import br.com.bootcamp.exer.exer10.figuraGeometrica.Triangulo;

/**
 * Crie uma interface chamada Figura que declara um método getArea.
 * Crie uma classe abstrata Figura Geométrica que e recebe no construtor o lado 1 e o lado 2 do tipo double e implementa a interface Figura.
 * Implemente classes referentes aos tipos de figura: quadrado, retângulo, triângulo, onde cada uma deve extender de classe Figura Geométrica
 * Implemente uma classe para mostrar as informações.
 */
public class Exer10 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 10--------------");

        FiguraGeometrica quadrado = new Quadrado(2, 2);
        FiguraGeometrica retangulo = new Retangulo(2, 4);
        FiguraGeometrica triangulo = new Triangulo(2, 5);

        System.out.println("------------------------------------");

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Retangulo: " + retangulo);
        System.out.println("Triangulo: " + triangulo);

        System.out.println("------------------------------------");
    }

}
