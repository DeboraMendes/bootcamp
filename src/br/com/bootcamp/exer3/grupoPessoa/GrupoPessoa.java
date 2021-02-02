package br.com.bootcamp.exer3.grupoPessoa;

import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Period;
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

    public void dadosDoGrupoPessoa() {
        for (int i = 0; i < pessoaList.size(); i++) {
            System.out.println(pessoaList.get(i));
        }
    }

    public void dadosDoGrupoPessoaComMaiorIdade() {
        Integer maiorIdade = getMaiorIdade();
        if (maiorIdade != null) {
            for (int i = 0; i < pessoaList.size(); i++) {
                Integer idadeDaPessoaAtual = getIdade(pessoaList.get(i).getDataNascimento());
                if (idadeDaPessoaAtual.equals(maiorIdade)) {
                    System.out.println(pessoaList.get(i));
                }
            }
        }

    }

    public void dadosDoGrupoPessoaComMenorIdade() {
        Integer menorIdade = getMenorIdade();
        if (menorIdade != null) {
            for (int i = 0; i < pessoaList.size(); i++) {
                Integer idadeDaPessoaAtual = getIdade(pessoaList.get(i).getDataNascimento());
                if (idadeDaPessoaAtual.equals(menorIdade)) {
                    System.out.println(pessoaList.get(i));
                }
            }
        }
    }

    private Integer getMaiorIdade() {
        if (existeAlgumaPessoaNaLista()) {
            // inicializei a maior idade com a idade da primeira pessoa
            int maiorIdade = getIdade(pessoaList.get(0).getDataNascimento());
            // aqui eu posso começar com a segunda pessoa
            for (int i = 1; i < pessoaList.size(); i++) {
                Integer idadeDaPessoaAtual = getIdade(pessoaList.get(i).getDataNascimento());
                //se a idade da pessoa atual for maior que a maior idade que eu tenho, vou atualizar a maior idade
                if (idadeDaPessoaAtual > maiorIdade) {
                    maiorIdade = idadeDaPessoaAtual;
                }
            }
            return maiorIdade;
        }
        return null;
    }

    public Integer getMenorIdade() {
        if (existeAlgumaPessoaNaLista()) {
            // inicializei a menor idade com a idade da primeira pessoa
            int menorIdade = getIdade(pessoaList.get(0).getDataNascimento());
            // aqui eu posso começar com a segunda pessoa
            for (int i = 1; i < pessoaList.size(); i++) {
                Integer idadeDaPessoaAtual = getIdade(pessoaList.get(i).getDataNascimento());
                //se a idade da pessoa atual for menor que a menor idade que eu tenho, vou atualizar a menor idade
                if (idadeDaPessoaAtual < menorIdade) {
                    menorIdade = idadeDaPessoaAtual;
                }
            }
            return menorIdade;
        }
        return null;
    }

    /**
     * null e empty (vazio) são coisas diferentes
     * a pessoaList nunca será null porque no momento da sua declaração já instanciamos: pessoaList = new ArrayList<>();
     * porém, se não for adicionada nenhuma Pessoa na pessoaList ela estará empty (vazia)
     *
     * @return
     */
    private boolean existeAlgumaPessoaNaLista() {
        return !pessoaList.isEmpty();
    }

    private Integer getIdade(LocalDate dataNascimento) {
        return Period.between(dataNascimento, dataAtual).getYears();
    }

}
