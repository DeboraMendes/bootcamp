package br.com.bootcamp.exer.exer7.conta;

import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {

    private BigDecimal valorCredito;
    private BigDecimal valorCreditoUsado;

    public ContaCorrente(String numeroConta, BigDecimal valorCredito) {
        super(numeroConta);
        this.valorCredito = BigDecimalUtil.zeroIfNull(valorCredito);
        this.valorCreditoUsado = BigDecimal.ZERO;
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (BigDecimalUtil.isMaiorOuIgual(valorSaldo, valor)) {
            valorSaldo = valorSaldo.subtract(valor);
            System.out.println("Saque realizado com sucesso!");
        } else if (BigDecimalUtil.isMaiorOuIgual(getValorSaldoSomadoValorCredito(), valor)) {
            BigDecimal faltou = getValorFaltou(valor);
            valorCredito = valorCredito.subtract(faltou);
            valorCreditoUsado = valorCreditoUsado.add(faltou);
            valorSaldo = BigDecimal.ZERO;
            System.out.println("Saque realizado com sucesso!");
        } else {
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
        //se foi usuado limite
        if (BigDecimalUtil.isMaior(this.valorCreditoUsado, BigDecimal.ZERO)) {
            //se o valor do depósito for menor ou igual ao valor do crédito usado
            //atualizar somente o valor do crédito usado
            if (BigDecimalUtil.isMenorOuIgual(valor, this.valorCreditoUsado)) {
                valorCreditoUsado = valorCreditoUsado.subtract(valor);
                valorCredito = valorCredito.add(valor);
            } else {
                BigDecimal valorQueSobraParaSaldo = valor.subtract(valorCreditoUsado);
                valorCredito = valorCreditoUsado;
                valorCreditoUsado = BigDecimal.ZERO;
                valorSaldo = valorQueSobraParaSaldo;
            }
        } else {
            valorSaldo = valorSaldo.add(valor);
            System.out.println("Deposito realizado com sucesso!");
        }
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
