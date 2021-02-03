package br.com.bootcamp.exer.exer7.conta;

import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {

    private BigDecimal valorCredito;

    public ContaCorrente(String numeroConta, BigDecimal valorCredito) {
        super(numeroConta);
        this.valorCredito = BigDecimalUtil.zeroIfNull(valorCredito);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (BigDecimalUtil.isMaiorOuIgual(valorSaldo, valor)) {
            valorSaldo = valorSaldo.subtract(valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            if (BigDecimalUtil.isMaiorOuIgual(getValorSaldoSomadoValorCredito(), valor)) {
                valorCredito = valorCredito.subtract(getValorFaltou(valor));
                valorSaldo = BigDecimal.ZERO;
                System.out.println("Saque realizado com sucesso!");
            }
            System.out.println("Saldo insuficiente.");
        }
    }

    private BigDecimal getValorSaldoSomadoValorCredito() {
        return valorSaldo.add(valorCredito);
    }

    private BigDecimal getValorFaltou(BigDecimal valor) {
        return valorSaldo.subtract(valor)
                .multiply(BigDecimal.ONE.negate());
    }

    @Override
    public void depositar(BigDecimal valor) {
        valorSaldo = valorSaldo.add(valor);
        System.out.println("Deposito realizado com sucesso!");
    }

    @Override
    public String toString() {
        return "Conta Corrente{" +
                "Número='" + getNumeroConta() +
                ", Saldo=" + BigDecimalUtil.setScale(valorSaldo) +
                ", Crédito=" + BigDecimalUtil.setScale(valorCredito) +
                '}';
    }

}
