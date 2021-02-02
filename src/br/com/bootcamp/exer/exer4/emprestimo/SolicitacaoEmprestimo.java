package br.com.bootcamp.exer.exer4.emprestimo;

import br.com.bootcamp.exer.exer4.aluno.Aluno;
import br.com.bootcamp.exer.exer4.livro.Livro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SolicitacaoEmprestimo {

    private Aluno aluno;
    private Livro livro;
    private LocalDate data;
    private Emprestimo emprestimo;

    public SolicitacaoEmprestimo(Aluno aluno, Livro livro, LocalDate data) {
        this.aluno = aluno;
        this.livro = livro;
        this.data = data;

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void gerarEmprestimo() {
        if (gerouEmprestimo()) {
            System.out.println("Já existe um empréstimo gerado para essa solicitação.");
        } else {
            emprestimo = new Emprestimo();
            System.out.println("Empréstimo do livro " + livro.getId() + "-" + livro.getNome() + " gerado com sucesso!");
        }
    }

    public void devolverEmprestimo() {
        if (gerouEmprestimo()) {
            if (emprestimo.foiDevolvido()) {
                System.out.println("Este empréstimo já foi devolvido.");
            } else {
                emprestimo.devolver();
                System.out.println("Empréstimo do livro " + livro.getId() + "-" + livro.getNome() + " devolvido com sucesso!");
            }
        } else {
            System.out.println("Não existe empréstimo para ser devolvido.");
        }
    }

    private boolean gerouEmprestimo() {
        return emprestimo != null;
    }

    private boolean ehMesmoLivro(Livro livro) {
        return this.livro.getId().equals(livro.getId());
    }

    public boolean existeEmprestimoEmAberto(Livro livro) {
        return ehMesmoLivro(livro)
                && gerouEmprestimo()
                && !emprestimo.foiDevolvido();
    }

    @Override
    public String toString() {
        boolean gerouEmprestimo = gerouEmprestimo();
        StringBuilder texto = new StringBuilder("Solicitação Emprestimo{")
                .append("Aluno = ").append(aluno)
                .append(", Livro = ").append(livro)
                .append(", Data = ").append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .append(", Gerou emprestimo? ").append(gerouEmprestimo ? "Sim" : "Não");
        if (gerouEmprestimo) {
            texto.append(", Foi devolvido? ").append(emprestimo.foiDevolvido() ? "Sim" : "Não");
        }
        texto.append("}");
        return texto.toString();
    }
}
