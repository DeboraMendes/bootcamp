package br.com.bootcamp.exer.exer9.teste;

import br.com.bootcamp.exer.exer9.banco.Banco;
import br.com.bootcamp.exer.exer9.conta.ContaCorrente;
import br.com.bootcamp.exer.exer9.conta.ContaPoupanca;
import br.com.bootcamp.exer.exer9.relatorio.Relatorio;

import java.math.BigDecimal;

/**
 * Crie uma classe Banco que possui uma lista de contas bancárias e
 * implemente os métodos inserir(Não adicionar mais de uma vez a mesma conta), remover e Procurar Conta.
 * O primeiro e o segundo recebem um objeto conta (que pode ser corrente ou poupança) e o insere e remove na lista, respectivamente.
 * O terceiro recebe um inteiro como parâmetro representando o número da conta e
 * retorna um objeto conta bancária, caso essa conta exista na lista, ou null, caso contrário.
 * Implemente uma classe para mostrar as informações.
 */
public class Exer9 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 9--------------");

        ContaPoupanca contaPoupanca001 = new ContaPoupanca("001", BigDecimal.ZERO);
        ContaCorrente contaCorrente001 = new ContaCorrente("001", BigDecimal.ZERO);
        ContaCorrente contaCorrente002 = new ContaCorrente("002", BigDecimal.ZERO);
        ContaPoupanca contaPoupanca003 = new ContaPoupanca("003", BigDecimal.ZERO);
        ContaPoupanca contaPoupanca004 = new ContaPoupanca("001", BigDecimal.ZERO);

        Banco banco = new Banco();
        banco.inserir(null);
        banco.inserir(contaPoupanca001);
        banco.inserir(contaPoupanca001);
        banco.inserir(contaCorrente001);
        banco.inserir(contaCorrente002);
        banco.inserir(contaPoupanca003);

        banco.remover(contaPoupanca004);

        banco.mostrarDados();

        System.out.println("Procurar: " + banco.procurar(""));
        System.out.println("Procurar: " + banco.procurar("003"));

        banco.remover(contaPoupanca001);

        System.out.println("------------------------------------");

        Relatorio relatorio = new Relatorio();
        relatorio.gerar(banco);

        System.out.println("------------------------------------");
    }

}
