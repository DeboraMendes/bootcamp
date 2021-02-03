package br.com.bootcamp.exer.exer4;

import java.math.BigDecimal;

/**
 * Crie uma nova classe chamada Pessoa, adicione os atributos nome e cpf,
 * que devem ser obrigatórios, considere como subclasse da classe Pessoa a classe Empregado.
 * Cada instância da classe Empregado tem os seguintes atributos obrigatórios,
 * salário base e impostos, além dos atributos que caracterizam a classe Pessoa.
 * Implemente um método para calcular o salário do empregado(salário base descontando os impostos).
 * Escreva um programa de teste adequado para a classe Empregado.
 */
public class Exer4 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 4--------------");

        BigDecimal valorSalarioBase100 = BigDecimal.valueOf(100);
        BigDecimal valorImpostos50 = BigDecimal.valueOf(50);

        Empregado empregado = new Empregado("Debora Mendes", "01234567890", valorSalarioBase100, valorImpostos50);
        empregado.calcularSalario();
        System.out.println(empregado);

        System.out.println("------------------------------------");
    }

}
