package br.com.bootcamp.exer3.grupoPessoa;

import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma classe chamada Grupo de Pessoas e adicione um atributo do tipo List, onde seja possível adicionar várias pessoas.
 */
public class GrupoPessoa {

    /**
     * quando um atributo é final significa que sua referência não será alterada
     * isto é, a variavel será inicializada apenas uma vez,
     * ou seja, não será permitido fazer um pessoaList = new ArrayList<>() novamente, ou setPessoaList()
     */
    private final List<Pessoa> pessoaList = new ArrayList<>();
    private final LocalDate dataAtual = LocalDate.now();

    public GrupoPessoa() {

    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public void adicionar(Pessoa pessoa) {
        if (ehMenorDe18Anos(pessoa.getDataNascimento())) {
            System.out.println("Não foi possível adicionar a pessoa " + pessoa.getNome() + ", menor de 18 anos.");
        } else {
            pessoaList.add(pessoa);
            System.out.println("Pessoa " + pessoa.getNome() + " adiconada com sucesso!");
        }
    }

    private boolean ehMenorDe18Anos(LocalDate dataNascimento) {
        LocalDate dataAniversarioDe18Anos = getDataAniversarioDe18Anos(dataNascimento);
        return !dataAniversarioDe18Anos.isEqual(dataAtual) && !dataAniversarioDe18Anos.isBefore(dataAtual);
    }

    private LocalDate getDataAniversarioDe18Anos(LocalDate dataNascimento) {
        return dataNascimento.plusYears(18);
    }

}
