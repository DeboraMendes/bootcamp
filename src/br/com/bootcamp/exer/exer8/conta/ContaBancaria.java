package br.com.bootcamp.exer.exer8.conta;

import br.com.bootcamp.exer.exer8.relatorio.Imprimivel;
import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public abstract class ContaBancaria implements Imprimivel {

    protected BigDecimal valorSaldo = BigDecimal.ZERO;
    private final String numeroConta;

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
