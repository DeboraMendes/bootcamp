package br.com.bootcamp.exer3;

import java.time.LocalDate;
import java.time.Month;

public class Exer3 {

    public static void main(String[] args) {
        GrupoPessoa grupoPessoa = new GrupoPessoa();
        Pessoa pessoa1 = new Pessoa("pessoa1", "abc", LocalDate.of(1998, Month.MARCH, 8));
        Pessoa pessoa2 = new Pessoa("pessoa2", "abc", LocalDate.of(1998, Month.MARCH, 8));
        Pessoa pessoa3 = new Pessoa("pessoa3", "abc", LocalDate.of(1998, Month.MARCH, 8));
        grupoPessoa.adicionar(pessoa1);
        grupoPessoa.adicionar(pessoa2);
        grupoPessoa.adicionar(pessoa3);

        for (int i = 0; i < grupoPessoa.getPessoaList().size(); i++) {
            Pessoa pessoaAtual = grupoPessoa.getPessoaList().get(i);
            System.out.println("pessoaAtual de i: " + i + " " + pessoaAtual);
        }
    }
}
