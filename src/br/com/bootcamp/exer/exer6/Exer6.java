package br.com.bootcamp.exer.exer6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Implemente a classe Empregado Comissionado como subclasse da classe Empregado.
 * Um determinado empregado comissionado tem como atributos, além dos atributos da classe Pessoa e da classe Empregado,
 * o atributo valor dos produtos vendidos (que corresponde ao valor monetário dos artigos efetivamente vendidos por ele) e
 * comissão (corresponde à porcentagem do valor sobre as vendas de produtos que será somado ao valor do salário base do vendedor,
 * o imposto deve ser descontado do total, salário base + comissão).
 * Note que deverá redefinir nesta subclasse o método herdado para calcular o salário. Escreva um programa de teste adequado para esta classe.
 */
public class Exer6 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 6--------------");

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

        Empregado vendedor1 = new Vendedor(
                "Debora Mendes",
                "01234567890",
                valorSalarioBase100,
                valorImpostos50,
                valorProdutosVendidos900,
                percentualComissao10
        );
        vendedor1.calcularSalario();
        System.out.println(vendedor1);

        BigDecimal valorProdutosVendidos1000 = BigDecimal.valueOf(1000);

        Empregado vendedor2 = new Vendedor(
                "Debora Mendes",
                "01234567890",
                valorSalarioBase100,
                valorImpostos50,
                valorProdutosVendidos1000,
                percentualComissao10
        );
        vendedor2.calcularSalario();
        System.out.println(vendedor2);

        BigDecimal valorAjudaCusto80 = BigDecimal.valueOf(80);
        BigDecimal percentualComissao5 = BigDecimal.valueOf(5);

        Empregado gerente1 = new Gerente(
                "Debora Mendes",
                "01234567890",
                valorSalarioBase100,
                valorImpostos50,
                null,
                percentualComissao5,
                valorAjudaCusto80
        );
        gerente1.calcularSalario();
        System.out.println(gerente1);

        List<Vendedor> vendedorList = new ArrayList<>();
        vendedorList.add((Vendedor) vendedor1);
        vendedorList.add((Vendedor) vendedor2);

        Empregado gerente2 = new Gerente(
                "Debora Mendes",
                "01234567890",
                valorSalarioBase100,
                valorImpostos50,
                vendedorList,
                percentualComissao5,
                valorAjudaCusto80
        );
        gerente2.calcularSalario();
        System.out.println(gerente2);


        System.out.println("------------------------------------");
    }

}
