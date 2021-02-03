package br.com.bootcamp.exer.exer10.figuraGeometrica;

public class Retangulo extends FiguraGeometrica {

    public Retangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }
    
    @Override
    public double getArea() {
        return (super.getLado1() * super.getLado2());
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\n Area do Retangulo: " + getArea();
    }
    
}
