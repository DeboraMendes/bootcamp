package br.com.bootcamp.exer.exer6;

import java.math.BigDecimal;

public class Vendedor extends EmpregadoComissionado {

    private BigDecimal valorTotalSalario = BigDecimal.ZERO;

    public Vendedor(String nome,
                    String cpf,
                    BigDecimal valorSalarioBase,
                    BigDecimal valorImpostos,
                    BigDecimal valorProdutosVendidos,
                    BigDecimal percentualComissao) {
        super(nome, cpf, valorSalarioBase, valorImpostos, valorProdutosVendidos, percentualComissao);
    }

    @Override
    public void calcularSalario() {
        valorTotalSalario = getValorSalarioBase()
                .add(getValorComissao())
                .subtract(getValorImpostos());
    }

    @Override
    public BigDecimal getValorTotalSalario() {
        return valorTotalSalario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                getValorSalarioBase() +
                " + " +
                getValorComissao() +
                " - " +
                getValorImpostos() +
                " = " +
                valorTotalSalario +
                "}";
    }

}
