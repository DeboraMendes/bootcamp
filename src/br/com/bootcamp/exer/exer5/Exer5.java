package br.com.bootcamp.exer.exer5;

import br.com.bootcamp.exer.exer5.empregado.Empregado;

public class Exer5 {

    public static void main(String[] args) {
        Empregado empregado = new Empregado(
                "Debora",
                "123",
                100,
                10
        );
        double valor2 = empregado.calculaValorTotalSalario();
        empregado.setNome("Debora Mendes");
        System.out.println(empregado.getNome());
        System.out.println(valor2);
    }

}
