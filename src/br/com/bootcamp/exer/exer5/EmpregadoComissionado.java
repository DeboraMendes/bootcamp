package br.com.bootcamp.exer.exer5;

import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public class EmpregadoComissionado extends Empregado {

    private final BigDecimal valorProdutosVendidos;
    private final BigDecimal percentualComissao;
    private final BigDecimal valorComissao;
    private BigDecimal valorTotalSalario = BigDecimal.ZERO;

    public EmpregadoComissionado(String nome,
                                 String cpf,
                                 BigDecimal valorSalarioBase,
                                 BigDecimal valorImpostos,
                                 BigDecimal valorProdutosVendidos,
                                 BigDecimal percentualComissao) {
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutosVendidos = BigDecimalUtil.zeroIfNull(valorProdutosVendidos);
        this.percentualComissao = BigDecimalUtil.zeroIfNull(percentualComissao);
        this.valorComissao = BigDecimalUtil.getValorByPercentual(this.valorProdutosVendidos, this.percentualComissao);
    }

    public BigDecimal getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public BigDecimal getValorComissao() {
        return valorComissao;
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
        return "Empregado Comissionado{" +
                getValorSalarioBase() +
                " + " +
                valorComissao +
                " - " +
                getValorImpostos() +
                " = " +
                valorTotalSalario +
                "}";
    }

}
