package br.com.bootcamp.exer.exer8.teste;

import br.com.bootcamp.exer.exer8.conta.ContaBancaria;
import br.com.bootcamp.exer.exer8.conta.ContaCorrente;
import br.com.bootcamp.exer.exer8.conta.ContaPoupanca;
import br.com.bootcamp.exer.exer8.relatorio.Relatorio;

import java.math.BigDecimal;

/**
 * Crie uma interface Imprimível que declara um método Mostrar Dados.
 * Faça as classes Conta Corrente e Conta Poupança implementarem a interface e na implementação do método mostre os atributos de cada conta.
 * Crie uma classe Relatório que possui um método Gerar que receba um objeto imprimível e executa o método Mostrar Dados do objeto.
 * Crie uma classe executável na qual você instância duas contas (uma de cada tipo), credita algum valor para elas e efetua um saque
 * (obs: no objeto conta corrente, faça um saque maior que o saldo atual).
 * Crie um objeto relatório e execute o método gerar relatório para cada conta criada.
 */
public class Exer8 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 8--------------");

        System.out.println("-----------Conta Poupança------------");

        ContaBancaria contaPoupanca = new ContaPoupanca("001", BigDecimal.valueOf(0.05));
        contaPoupanca.depositar(BigDecimal.valueOf(2));
        System.out.println(contaPoupanca);
        contaPoupanca.sacar(BigDecimal.valueOf(1));
        System.out.println(contaPoupanca);
        contaPoupanca.sacar(BigDecimal.valueOf(0.90));
        System.out.println(contaPoupanca);

        System.out.println("-----------Conta Corrente------------");

        ContaBancaria contaCorrente = new ContaCorrente("001", BigDecimal.valueOf(50));
        contaCorrente.depositar(BigDecimal.valueOf(100));
        System.out.println(contaCorrente);
        contaCorrente.sacar(BigDecimal.valueOf(90));
        System.out.println(contaCorrente);
        contaCorrente.sacar(BigDecimal.valueOf(20));
        System.out.println(contaCorrente);
        contaCorrente.sacar(BigDecimal.valueOf(50));
        System.out.println(contaCorrente);

        System.out.println("--------------Relatório--------------");

        Relatorio relatorio = new Relatorio();
        relatorio.gerar(contaCorrente);
        relatorio.gerar(contaPoupanca);

        System.out.println("------------------------------------");
    }

}
