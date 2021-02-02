package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.grupoPessoa.GrupoPessoa;
import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Month;

public class Exer3 {

    public static void main(String[] args) {
        System.out.println("----------------Exer 2--------------");

        System.out.println("---------Adicionar Pessoas----------");
        GrupoPessoa grupoPessoa = new GrupoPessoa();
        grupoPessoa.adicionar(
                new Pessoa("(Fez 18 anos ontem)", "01234567891", LocalDate.of(2003, Month.JANUARY, 28))
        );
        grupoPessoa.adicionar(
                new Pessoa("(Está fazendo 18 anos hoje)", "01234567892", LocalDate.of(2003, Month.JANUARY, 29))
        );
        grupoPessoa.adicionar(
                new Pessoa("(Vai fazer 18 anos amanhã)", "01234567893", LocalDate.of(2003, Month.JANUARY, 30))
        );
        grupoPessoa.adicionar(
                new Pessoa("Debora", "01234567894", LocalDate.of(1998, Month.MARCH, 8))
        );
        System.out.println("---------Dados das Pessoas----------");
        grupoPessoa.dadosDoGrupoPessoa();
        System.out.println("--Dados das Pessoas com Maior Idade--");
        grupoPessoa.dadosDoGrupoPessoaComMaiorIdade();
        System.out.println("--Dados das Pessoas com Menor Idade--");
        grupoPessoa.dadosDoGrupoPessoaComMenorIdade();
        System.out.println("-------------------------------------");
    }
}
