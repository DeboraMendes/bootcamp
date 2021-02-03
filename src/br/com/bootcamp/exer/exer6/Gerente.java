package br.com.bootcamp.exer.exer6;

import br.com.dev.bootcamp.util.BigDecimalUtil;

import java.math.BigDecimal;
import java.util.List;

public class Gerente extends EmpregadoComissionado {

    private final BigDecimal valorAjudaCusto;
    private final List<Vendedor> vendedorList;
    private BigDecimal valorTotalSalario = BigDecimal.ZERO;

    public Gerente(String nome,
                   String cpf,
                   BigDecimal valorSalarioBase,
                   BigDecimal valorImpostos,
                   List<Vendedor> vendedorList,
                   BigDecimal percentualComissao,
                   BigDecimal valorAjudaCusto) {
        super(nome, cpf, valorSalarioBase, valorImpostos, getValorProdutosVendidos(vendedorList), percentualComissao);
        this.valorAjudaCusto = BigDecimalUtil.zeroIfNull(valorAjudaCusto);
        this.vendedorList = vendedorList;
    }

    private static BigDecimal getValorProdutosVendidos(List<Vendedor> vendedorList) {
        if (vendedorList != null && !vendedorList.isEmpty()) {
            BigDecimal valorProdutosVendidos = BigDecimal.ZERO;
            for (Vendedor vendedor : vendedorList) {
                valorProdutosVendidos = valorProdutosVendidos.add(vendedor.getValorProdutosVendidos());
            }
            return valorProdutosVendidos;
        }
        return BigDecimal.ZERO;
    }

    public List<Vendedor> getVendedorList() {
        return vendedorList;
    }

    @Override
    public void calcularSalario() {
        valorTotalSalario = getValorSalarioBase()
                .add(valorAjudaCusto)
                .add(getValorComissao())
                .subtract(getValorImpostos());
    }

    @Override
    public BigDecimal getValorTotalSalario() {
        return valorTotalSalario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                getValorSalarioBase() +
                " + " +
                valorAjudaCusto +
                " + " +
                getValorComissao() +
                " - " +
                getValorImpostos() +
                " = " +
                valorTotalSalario +
                "}";
    }

}
