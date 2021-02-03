package br.com.bootcamp.exer.exer8.teste;

import br.com.bootcamp.exer.exer8.Relatorio;
import br.com.bootcamp.exer.exer8.conta.ContaBancaria;
import br.com.bootcamp.exer.exer8.conta.ContaCorrente;

import java.math.BigDecimal;

/**
 * Crie uma classe abstrata Conta Bancária que contém como atributos o número da conta e o saldo,
 * e como métodos abstratos sacar e depositar que recebem um parâmetro do tipo Bigdecimal.
 * Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancária.
 * A  Conta Poupança possui um atributo Taxa De Operação que é descontado sempre que um saque e um depósito são feitos.
 * A  Conta Corrente possui um atributo limite que dá crédito a mais para o correntista caso ele precise sacar mais que o saldo.
 * Neste caso, o saldo pode ficar negativo desde que não ultrapasse o limite. Contudo isso não pode acontecer na classe Conta Poupança.
 * Crie uma classe executável para testar as operações contas (uma de cada tipo), credita algum valor para elas,  efetua um saque
 * (obs: no objeto conta corrente, faça um saque maior que o saldo atual).
 */
public class Exer8ContaCorrente {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 7--------------");

        ContaBancaria contaCorrente = new ContaCorrente("001", BigDecimal.valueOf(50));

        contaCorrente.depositar(BigDecimal.valueOf(100));
        System.out.println("Depósito OK: " + contaCorrente);
        System.out.println("------------------");

        contaCorrente.sacar(BigDecimal.valueOf(90));
        System.out.println("Não Usei Crédito OK: " + contaCorrente);
        System.out.println("------------------");

        contaCorrente.sacar(BigDecimal.valueOf(20));
        System.out.println("Usei Crédito: " + contaCorrente);
        System.out.println("------------------");

        contaCorrente.sacar(BigDecimal.valueOf(50));
        System.out.println("Sem Crédito: " + contaCorrente);
        System.out.println("------------------");

        contaCorrente.depositar(BigDecimal.valueOf(5));
        System.out.println("Depósito OK: " + contaCorrente); // devolver crédito
        System.out.println("------------------");

        contaCorrente.depositar(BigDecimal.valueOf(10));
        System.out.println("Depósito OK: " + contaCorrente); // devolver crédito + saldo

        contaCorrente.depositar(BigDecimal.valueOf(10));
        System.out.println("Depósito OK: " + contaCorrente); // depósito normal

        Relatorio relatorio = new Relatorio();
        relatorio.gerar(contaCorrente);

        System.out.println("------------------------------------");
    }

}
