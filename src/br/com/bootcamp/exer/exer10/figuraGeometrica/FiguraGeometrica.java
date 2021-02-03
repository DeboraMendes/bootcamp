package br.com.bootcamp.exer.exer10.figuraGeometrica;

public abstract class FiguraGeometrica implements Figura {
    private double lado1;
    private double lado2;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public String toString() {
        return "\nLado1 = " + getLado1() 
                + "\nLado2 = " + getLado2();
    }
}
