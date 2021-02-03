package br.com.bootcamp.exer.exer5;

import java.math.BigDecimal;

/**
 * Implemente a classe Empregado Comissionado como subclasse da classe Empregado.
 * Um determinado empregado comissionado tem como atributos, além dos atributos da classe Pessoa e da classe Empregado,
 * o atributo valor dos produtos vendidos (que corresponde ao valor monetário dos artigos efetivamente vendidos por ele) e
 * comissão (corresponde à porcentagem do valor sobre as vendas de produtos que será somado ao valor do salário base do vendedor,
 * o imposto deve ser descontado do total, salário base + comissão).
 * Note que deverá redefinir nesta subclasse o método herdado para calcular o salário. Escreva um programa de teste adequado para esta classe.
 */
public class Exer5 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 5--------------");

        BigDecimal valorSalarioBase100 = BigDecimal.valueOf(100);
        BigDecimal valorImpostos50 = BigDecimal.valueOf(50);

        Empregado empregadoNaoComissionado = new EmpregadoNaoComissionado(
                "Debora Mendes",
                "01234567890",
                valorSalarioBase100,
                valorImpostos50
        );
        empregadoNaoComissionado.calcularSalario();
        System.out.println(empregadoNaoComissionado);

        BigDecimal valorProdutosVendidos900 = BigDecimal.valueOf(900);
        BigDecimal percentualComissao10 = BigDecimal.valueOf(10);

        Empregado empregadoComissionado = new EmpregadoComissionado(
                "Debora Mendes",
                "01234567890",
                valorSalarioBase100,
                valorImpostos50,
                valorProdutosVendidos900,
                percentualComissao10
        );
        empregadoComissionado.calcularSalario();
        System.out.println(empregadoComissionado);

        System.out.println("------------------------------------");
    }

}
