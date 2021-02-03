package br.com.bootcamp.exer.exer2;

import java.time.LocalDate;
import java.time.Month;

/**
 * Crie uma classe Pessoa com os atributos nome, sobrenome, cpf, email e data de nascimento,
 * o nome, cpf e data de nascimento devem ser obrigatórios ao instanciar uma pessoa.
 * Crie uma classe chamada Grupo de Pessoas e adicione um atributo do tipo List, onde seja possível adicionar várias pessoas.
 * Não deve ser inserido na lista pessoas menores de 18 anos.
 * Apresentar às pessoas com maior e menor idade que foram adicionadas na lista.
 * Implemente uma classe para testar as informações.
 */
public class Exer2 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
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
