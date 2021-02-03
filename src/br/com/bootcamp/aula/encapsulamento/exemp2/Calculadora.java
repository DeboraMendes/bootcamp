package br.com.bootcamp.aula.encapsulamento.exemp2;

//classe: Calculadora
public class Calculadora {

    //atributos privados do tipo inteiro
    private Integer numero1;
    private Integer numero2;
    private Integer resultado;

    //método somar, recebe o numer1 e o número2
    //realiza o cálculo e atribui o valor no resultado
    //o atributo resultado não fica disponivel fora da classe
    //somente essa classe pode alterar o resultado
    public void somar(Integer numero1,
                      Integer numero2) {
        resultado = numero1 + numero2;
    }

    //mostra o resultado
    public Integer getResultado() {
        return resultado;
    }

}
