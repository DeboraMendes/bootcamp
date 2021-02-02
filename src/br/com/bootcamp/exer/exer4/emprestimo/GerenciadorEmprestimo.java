package br.com.bootcamp.exer.exer4.emprestimo;

import br.com.bootcamp.exer.exer4.aluno.Aluno;
import br.com.bootcamp.exer.exer4.livro.Livro;

import java.time.LocalDate;
import java.util.*;

public class GerenciadorEmprestimo {

    private final List<SolicitacaoEmprestimo> solicitacaoEmprestimoList = new ArrayList<>();

    public void solicitarEmprestimo(Aluno aluno, Livro livro, LocalDate data) {
        SolicitacaoEmprestimo solicitacaoEmprestimo = new SolicitacaoEmprestimo(aluno, livro, data);
        adicionar(solicitacaoEmprestimo);
        tentarGerarEmprestimo(solicitacaoEmprestimo);
    }

    /**
     * Nem sempre precisamos ou devemos ter setter e getter
     * @param solicitacaoEmprestimo
     */
    private void adicionar(SolicitacaoEmprestimo solicitacaoEmprestimo) {
        solicitacaoEmprestimoList.add(solicitacaoEmprestimo);
    }

    private void tentarGerarEmprestimo(SolicitacaoEmprestimo solicitacaoEmprestimo) {
        if (permitirEmprestimo(solicitacaoEmprestimo.getLivro())) {
            solicitacaoEmprestimo.gerarEmprestimo();
        } else {
            System.out.println("Não foi possível gerar o empréstimo, o livro "
                    + solicitacaoEmprestimo.getLivro().getId() + "-"
                    + solicitacaoEmprestimo.getLivro().getNome() + " está indisponível.");
        }
    }

    private boolean permitirEmprestimo(Livro livro) {
        boolean livroDisponivelParaEmprestimo = true;
        //for enhanced funciona igual ao for normal
        for (SolicitacaoEmprestimo solicitacaoAtual : solicitacaoEmprestimoList) {
            if (solicitacaoAtual.existeEmprestimoEmAberto(livro)) {
                livroDisponivelParaEmprestimo = false;
                break;
            }
        }
        return livroDisponivelParaEmprestimo;
    }

    public void devolverEmprestimo(Livro livro) {
        //for enhanced funciona igual ao for normal
        for (SolicitacaoEmprestimo solicitacaoEmprestimo : solicitacaoEmprestimoList) {
            if (solicitacaoEmprestimo.existeEmprestimoEmAberto(livro)) {
                solicitacaoEmprestimo.devolverEmprestimo();
            }
        }
    }

    public void historicoEmprestimos() {
        //for enhanced funciona igual ao for normal
        for (SolicitacaoEmprestimo solicitacaoAtual : solicitacaoEmprestimoList) {
            System.out.println(solicitacaoAtual);
        }
    }

    public void dadosDoLivroComMaiorQuantidade() {
        Map<Livro, Integer> livroQuantidade = getLivroQuantidade();
        Integer maiorIdade = getMaiorQuantidade(livroQuantidade);
        if (!livroQuantidade.isEmpty()) {
            // forEach funciona igual ao for normal
            livroQuantidade.forEach((livro, quantidade) -> {
                if (quantidade.equals(maiorIdade)) {
                    System.out.println("Livro = " + livro + ", Quantidade = " + maiorIdade);
                }
            });
        }

    }

    private Map<Livro, Integer> getLivroQuantidade() {
        // será agrupado os livros e somado suas quantidades
        Map<Livro, Integer> livroQuantidade = new HashMap<>();
        //for enhanced funciona igual ao for normal
        for (SolicitacaoEmprestimo solicitacaoAtual : solicitacaoEmprestimoList) {
            //se o livro estiver no livroQuantidade será retornada a quantidade, se não será retornado zero
            // depois será somado um
            int quantidade = (livroQuantidade.getOrDefault(solicitacaoAtual.getLivro(), 0)) + 1;
            livroQuantidade.put(solicitacaoAtual.getLivro(), quantidade);
        }
        return livroQuantidade;
    }

    private Integer getMaiorQuantidade(Map<Livro, Integer> livroQuantidade) {
        if (!livroQuantidade.isEmpty()) {
            // inicializei a maior quantidade com zero
            int maiorQuantidade =  0;
            //for enhanced funciona igual ao for normal
            for (Integer quantidade : livroQuantidade.values()) {
                //se a quantidade atual for maior que a maior quantidade que eu tenho, vou atualizar a maior quantidade
                if (quantidade > maiorQuantidade) {
                    maiorQuantidade = quantidade;
                }
            }
            return maiorQuantidade;
        }
        return null;
    }
}
