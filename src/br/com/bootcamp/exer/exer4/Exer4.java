package br.com.bootcamp.exer.exer4;

import br.com.bootcamp.exer.exer4.aluno.Aluno;
import br.com.bootcamp.exer.exer4.emprestimo.GerenciadorEmprestimo;
import br.com.bootcamp.exer.exer4.livro.Livro;

import java.time.LocalDate;

/**
 * Desenvolva uma rotina para controlar empréstimos de livros para alunos.
 * Um aluno pode emprestar mais de um livro, mas o livro não pode ser emprestado para mais de um aluno ao mesmo tempo.
 * Sugestão, crie as classes Aluno, Livro(adicione um atributo id para verificar se o livro já está emprestado), Empréstimo, Solicitação Empréstimo.
 * Implemente uma classe de Gerenciador de Empréstimos para guardar as informações.
 * Apresentar no mínimo três históricos de empréstimos(aluno, livro e data de empréstimo).
 * Listar o livro que teve mais solicitações de empréstimos com a quantidade(considerar empréstimos e tentativas de empréstimo).
 * Implemente uma classe para testar as informações.
 */
public class Exer4 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("-------------------Exer 4----------------");

        Livro livro1 = new Livro(1, "Lógica de Programação");
        Livro livro2 = new Livro(2, "Java");
        Livro livro3 = new Livro(3, "Orientação a Objetos");
        Livro livro4 = new Livro(4, "Java");

        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");

        GerenciadorEmprestimo gerenciadorEmprestimo = new GerenciadorEmprestimo();
        gerenciadorEmprestimo.solicitarEmprestimo(aluno1, livro1, LocalDate.now());
        gerenciadorEmprestimo.solicitarEmprestimo(aluno1, livro2, LocalDate.now());
        gerenciadorEmprestimo.solicitarEmprestimo(aluno1, livro2, LocalDate.now());
        gerenciadorEmprestimo.solicitarEmprestimo(aluno2, livro2, LocalDate.now());
        gerenciadorEmprestimo.devolverEmprestimo(livro2);
        gerenciadorEmprestimo.solicitarEmprestimo(aluno2, livro2, LocalDate.now());
        gerenciadorEmprestimo.solicitarEmprestimo(aluno2, livro3, LocalDate.now());
        gerenciadorEmprestimo.devolverEmprestimo(livro3);
        gerenciadorEmprestimo.solicitarEmprestimo(aluno2, livro3, LocalDate.now());
        gerenciadorEmprestimo.devolverEmprestimo(livro3);
        gerenciadorEmprestimo.solicitarEmprestimo(aluno2, livro3, LocalDate.now());
        gerenciadorEmprestimo.devolverEmprestimo(livro3);
        gerenciadorEmprestimo.solicitarEmprestimo(aluno2, livro3, LocalDate.now());


        System.out.println("-----------------Histórico---------------");
        gerenciadorEmprestimo.historicoEmprestimos();

        System.out.println("--Dados dos Livros com Maior Quantidade--");
        gerenciadorEmprestimo.dadosDoLivroComMaiorQuantidade();

        System.out.println("-----------------------------------------");
    }

}
