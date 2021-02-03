package br.com.bootcamp.aula.encapsulamento.exemp2;

public class Calculadora {

    private Integer numero1;
    private Integer numero2;
    private Integer resultado;

    public void somar(Integer numero1,
                      Integer numero2) {
        resultado = numero1 + numero2;
    }

    public Integer getResultado() {
        return resultado;
    }

}
