package br.com.bootcamp.exer.exer6;

import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public abstract class Empregado extends Pessoa {

    private final BigDecimal valorSalarioBase;
    private final BigDecimal valorImpostos;

    public Empregado(String nome, String cpf,
                     BigDecimal valorSalarioBase,
                     BigDecimal valorImpostos) {
        super(nome, cpf);
        this.valorSalarioBase = BigDecimalUtil.zeroIfNull(valorSalarioBase);
        this.valorImpostos = BigDecimalUtil.zeroIfNull(valorImpostos);
    }

    public BigDecimal getValorSalarioBase() {
        return valorSalarioBase;
    }

    public BigDecimal getValorImpostos() {
        return valorImpostos;
    }

    public abstract void calcularSalario();

    public abstract BigDecimal getValorTotalSalario();

}
