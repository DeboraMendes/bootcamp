package br.com.bootcamp.exer.exer5.empregado;

import br.com.bootcamp.exer.exer5.pessoa.Pessoa;

public class Empregado extends Pessoa {

    private double valorSalarioBase;
    private double valorImpostos;

    public Empregado(String nome,
                     String cpf,
                     double valorSalarioBase,
                     double valorImpostos) {
        //chama o construtor da classe pessoa
        //new Pessoa(nome, cpf);
        super(nome, cpf);
        this.valorSalarioBase = valorSalarioBase;
        this.valorImpostos = valorImpostos;
    }

    public double calculaValorTotalSalario() {
        return valorSalarioBase - valorImpostos;
    }

}
