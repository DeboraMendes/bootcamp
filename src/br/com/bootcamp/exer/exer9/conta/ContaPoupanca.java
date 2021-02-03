package br.com.bootcamp.exer.exer9.conta;

import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {

    private final BigDecimal valorTaxaOperacao;

    public ContaPoupanca(String numeroConta, BigDecimal valorTaxaOperacao) {
        super(numeroConta);
        this.valorTaxaOperacao = BigDecimalUtil.zeroIfNull(valorTaxaOperacao);
    }

    public BigDecimal getValorTaxaOperacao() {
        return valorTaxaOperacao;
    }

    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal valorTransacao = valor.add(valorTaxaOperacao);
        if (BigDecimalUtil.isMaiorOuIgual(valorSaldo, valorTransacao)) {
            valorSaldo = valorSaldo.subtract(valorTransacao);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        valorSaldo = valorSaldo.add(valor).subtract(valorTaxaOperacao);
        System.out.println("Deposito realizado com sucesso!");
    }

    @Override
    public String toString() {
        return "Conta Poupanca{" +
                "Número='" + getNumeroConta() +
                ", Saldo=" + BigDecimalUtil.setScale(valorSaldo) +
                ", Taxa por Operação=" + BigDecimalUtil.setScale(valorTaxaOperacao) +
                '}';
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
    }
}
