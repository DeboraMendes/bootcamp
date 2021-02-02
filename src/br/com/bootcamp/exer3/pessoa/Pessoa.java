package br.com.bootcamp.exer3.pessoa;

import java.time.LocalDate;

/**
 * Crie uma classe Pessoa com os atributos nome, sobrenome, cpf, email e data de nascimento,
 * o nome, cpf e data de nascimento devem ser obrigatórios ao instanciar uma pessoa.
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "Nome = '" + nome  +
                ", Sobrenome = '" + sobrenome +
                ", CPF = '" + cpf +
                ", E-mail = '" + email +
                ", data nascimento = " + dataNascimento +
                '}';
    }
}
