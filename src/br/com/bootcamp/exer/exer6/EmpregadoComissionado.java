package br.com.bootcamp.exer.exer6;

import br.com.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;

public abstract class EmpregadoComissionado extends Empregado {

    private final BigDecimal valorProdutosVendidos;
    private final BigDecimal percentualComissao;
    private final BigDecimal valorComissao;

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

}
