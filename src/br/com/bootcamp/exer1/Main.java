package br.com.bootcamp.exer1;

import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.pessoa.Pessoa;
import br.com.bootcamp.exer1.telefone.Telefone;
import br.com.bootcamp.exer1.telefone.TipoTelefone;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Debora");
        pessoa.setSobrenome("Mendes");
        pessoa.setCpf("01234567890");
        pessoa.setEmail("debora.mendes@viasoft.com.br");
        LocalDate dataNascimento = LocalDate.of(1998, Month.MARCH, 8);
        pessoa.setDataNascimento(dataNascimento);
        List<Endereco> enderecoList = new ArrayList<>();
        Endereco endereco = new Endereco("R. Tupy", 123, "Centro");
        enderecoList.add(endereco);
        pessoa.setEnderecoList(enderecoList);
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(TipoTelefone.CELULAR);
        telefone.setDdd(46);
        telefone.setNumero(12345);
        pessoa.setTelefoneList(new ArrayList<>());
        pessoa.getTelefoneList().add(telefone);
        System.out.println(pessoa);
    }
}