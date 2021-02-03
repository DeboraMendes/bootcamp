package br.com.bootcamp.exer.exer1;

import java.time.LocalDate;
import java.util.List;

/**
 * Crie uma classe Pessoa com os atributos nome, sobrenome, cpf, email e data de nascimento.
 * Implementar os métodos setter e getter.
 * Adicione na classe pessoa uma lista de endereços e telefones.
 * Implemente um método dados da pessoa, que mostre no console todos os atributos, inclusive os endereços e telefones.
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private List<Endereco> enderecoList;
    private List<Telefone> telefoneList;

    public Pessoa() {

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

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
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

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void dadosDaPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Data nascimento: " + dataNascimento);
        if (enderecoList != null) {
            for (int i = 0; i < enderecoList.size(); i++) {
                System.out.println("Endereço " + (i+1) + ": " + enderecoList.get(i));
            }
        }
        if (telefoneList != null) {
            for (int i = 0; i < telefoneList.size(); i++) {
                System.out.println("Telefone " + telefoneList.get(i));
            }
        }
    }
}
