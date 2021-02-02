package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.grupoPessoa.GrupoPessoa;
import br.com.bootcamp.exer3.pessoa.Pessoa;

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
    }
}
