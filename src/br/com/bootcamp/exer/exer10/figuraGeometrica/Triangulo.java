package br.com.bootcamp.exer.exer10.figuraGeometrica;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }

    @Override
    public double getArea() {
        //multiplicação da base com a altura, e isso dividido por 2.
        return ((super.getLado1() * super.getLado2()) / 2);
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\n Area do Triangulo: " + getArea();
    }
}
