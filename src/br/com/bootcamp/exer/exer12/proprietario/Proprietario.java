package br.com.bootcamp.exer.exer12.proprietario;

import br.com.bootcamp.exer.exer12.exception.CampoObrigatorioNullException;

import java.time.LocalDate;

public class Proprietario {

    private final String nome;
    private final String cpf;
    private final String rg;
    private final LocalDate dataNascimento;
    private final Endereco endereco;

    public Proprietario(String nome,
                        String cpf,
                        String rg,
                        LocalDate dataNascimento,
                        Endereco endereco) {
        if (nome == null) {
            throw new CampoObrigatorioNullException("Nome é obrigatório");
        }

        if (cpf == null) {
            throw new CampoObrigatorioNullException("CPF é obrigatório");
        }

        if (rg == null) {
            throw new CampoObrigatorioNullException("RG é obrigatório");
        }

        if (endereco == null) {
            throw new CampoObrigatorioNullException("Endereço é obrigatório");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
