package br.com.bootcamp.exer.exer1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * Crie uma classe Pessoa com os atributos nome, sobrenome, cpf, email e data de nascimento.
 * Implementar os métodos getter e setter.
 * Crie uma classe Endereço com os atributos endereço, número e bairro, todos os atributos são obrigatórios.
 * Crie um Enum TipoTelefone com as opções COMERCIAL, RESIDENCIAL E CELULAR, adicione uma descrição para cada opção.
 * Adicione na classe pessoa uma lista de endereços e telefones.
 * Implemente um método dados da pessoa, que mostre no console todos os atributos, inclusive os endereços e telefones.
 * Implemente uma classe para testar e popular os atributos.
 */
public class Exer1 {

    public static void main(String[] a) {
        popularOsAtributos();
    }

    public static void popularOsAtributos() {
        System.out.println("----------------Exer 1--------------");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Debora");
        pessoa.setSobrenome("Mendes");
        pessoa.setCpf("01234567890");
        pessoa.setEmail("debora.mendes@viasoft.com.br");
        pessoa.setDataNascimento(LocalDate.of(1998, Month.MARCH, 8));
        pessoa.setEnderecoList(new ArrayList<>());
        pessoa.getEnderecoList().add(new Endereco("R. Afonso Pena", "1710", "Sambugaro"));
        pessoa.getEnderecoList().add(new Endereco("Av. Tupi", "50", "Centro"));
        pessoa.setTelefoneList(new ArrayList<>());

        Telefone telefone1 = new Telefone();
        telefone1.setTipoTelefone(TipoTelefone.COMERCIAL);
        telefone1.setDdd(46);
        telefone1.setNumero(40072305);
        pessoa.getTelefoneList().add(telefone1);

        Telefone telefone2 = new Telefone();
        telefone2.setDdd(46);
        telefone2.setNumero(40072305);
        pessoa.getTelefoneList().add(telefone2);

        Telefone telefone3 = new Telefone();
        pessoa.getTelefoneList().add(telefone3);

        System.out.println("---------Dados das Pessoas----------");
        pessoa.dadosDaPessoa();
        System.out.println("------------------------------------");
    }

}
