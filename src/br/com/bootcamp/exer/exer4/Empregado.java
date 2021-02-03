package br.com.bootcamp.exer.exer4;

import java.math.BigDecimal;

public class Empregado extends Pessoa {

    private final BigDecimal valorSalarioBase;
    private final BigDecimal valorImpostos;
    private BigDecimal valorTotalSalario = BigDecimal.ZERO;

    public Empregado(String nome, String cpf, BigDecimal valorSalarioBase, BigDecimal valorImpostos) {
        super(nome, cpf);
        this.valorSalarioBase = valorSalarioBase != null ? valorSalarioBase : BigDecimal.ZERO;
        this.valorImpostos = valorImpostos != null ? valorImpostos : BigDecimal.ZERO;
    }

    public void calcularSalario() {
        valorTotalSalario = valorSalarioBase.subtract(valorImpostos);
    }

    public BigDecimal getValorTotalSalario() {
        return valorTotalSalario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                valorSalarioBase +
                " - " +
                valorImpostos +
                " = " +
                valorTotalSalario +
                "}";
    }
}
