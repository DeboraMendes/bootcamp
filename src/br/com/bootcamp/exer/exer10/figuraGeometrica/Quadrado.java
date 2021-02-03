package br.com.bootcamp.exer.exer10.figuraGeometrica;

public class Quadrado extends FiguraGeometrica {

    public Quadrado(double lado1, double lado2) {
        super(lado1, lado2);
    }
    
    @Override
    public double getArea() {
        return (super.getLado1() * super.getLado2());
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\n Area do Quadrado: " + getArea();
    }    
}
