package br.com.bootcamp.exer.exer7.conta;

import br.com.dev.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public abstract class ContaBancaria {

    private String numeroConta;
    protected BigDecimal valorSaldo = BigDecimal.ZERO;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getValorSaldo() {
        return valorSaldo;
    }

    public abstract void sacar(BigDecimal valor);
    public abstract void depositar(BigDecimal valor);

    @Override
    public String toString() {
        return "Conta Bancária{" +
                "Número='" + numeroConta +
                ", Saldo=" + BigDecimalUtil.setScale(valorSaldo) +
                '}';
    }

}
