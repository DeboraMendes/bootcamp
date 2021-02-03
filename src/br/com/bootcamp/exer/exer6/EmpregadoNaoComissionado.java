package br.com.bootcamp.exer.exer6;

import java.math.BigDecimal;

public class EmpregadoNaoComissionado extends Empregado {

    private BigDecimal valorTotalSalario = BigDecimal.ZERO;

    public EmpregadoNaoComissionado(String nome, String cpf, BigDecimal valorSalarioBase, BigDecimal valorImpostos) {
        super(nome, cpf, valorSalarioBase, valorImpostos);
    }


    public void calcularSalario() {
        valorTotalSalario = getValorSalarioBase().subtract(getValorImpostos());
    }

    public BigDecimal getValorTotalSalario() {
        return valorTotalSalario;
    }

    @Override
    public String toString() {
        return "Empregado Não Comissionado{" +
                getValorSalarioBase() +
                " - " +
                getValorImpostos() +
                " = " +
                valorTotalSalario +
                "}";
    }
}
