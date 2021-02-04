package br.com.bootcamp.exer.exer12.teste;

import br.com.bootcamp.exer.exer12.carro.Carro;
import br.com.bootcamp.exer.exer12.carro.Marca;
import br.com.bootcamp.exer.exer12.proprietario.Endereco;
import br.com.bootcamp.exer.exer12.proprietario.Proprietario;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Implemente uma classe Proprietário e declare os seguintes atributos na classe:
 * Nome, CPF, RG, Data de Nascimento, Rua, Numero, Bairro, Cidade, Estado, Cep, Complemento.
 * Faça o encapsulamento dos atributos da classe Proprietário. Os atributos nome, cpf e rg são obrigatórios.
 * Implemente uma classe Carro. Declare os seguintes atributos na classe:
 * Modelo, Cor, Ano, Marca, Chassi, Proprietário, Velocidade máxima, Velocidade atual, Nr de portas, Nr Marchas, Quantidade de combustível.
 * Faça o encapsulamento da classe Carro e seus atributos. A quantidade de combustível é obrigatória.
 * Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h(Não pode exceder a velocidade máxima).
 * Implemente o método freia que para o carro – Velocidade = 0 km/h. Implemete o método troca marcha (Não pode passar do número máximo).
 * Implemente o método reduz a marcha (Não pode passar do número mínimo). Altere a classe Proprietário para que o atributo Endereço vire uma classe.
 * Encapsule os atributos da classe Endereço. O endereço do proprietário não pode ser nulo.
 * Todo veículo tem um proprietário obrigatoriamente.
 * A marcha ré(pode usar o valor 0) não pode ser engatada se  a velocidade for superior a 0 KM/h.
 * Implemente um método que calcule a autonomia de viagem do veículo com base no consumo médio passado como parâmetro(consumo médio multiplicado pela quantidade de litros de combustível).
 * Transforme o atributo Marca de um carro em uma classe Marca com nome, ano de fabricação e código identificador.
 * Crie uma classe de teste e instancie objetos da classe Carro, Pessoa, Endereço, Marca e relacione os objetos utilizando os métodos ou construtores quando necessário.
 * Caso alguma das condições não forem atendidas, apresentar uma exception (extends RuntimeException) com a mensagem do erro, por exemplo, CampoObrigatorioNullException, CarroAceleraException, CarroTrocaMarchaException.
 */
public class Exer12 {

    public static void main(String[] args) {
        System.out.println("----------------Exer 12--------------");

        Endereco endereco = new Endereco(
                "R. Afonso Pena",
                "1710",
                "Sambugaro",
                "Paraná",
                "Pato Branco",
                "85501-530",
                null
        );

        Proprietario proprietario = new Proprietario(
                "Debora Mendes",
                "967.347.710-83",
                "41.015.532-9",
                LocalDate.of(1998, 3, 8),
                endereco
        );

        Marca marca = new Marca("Pegeout", 2021, 123);

        Integer velocidadeMaxima = 20;
        Integer numeroMarchas = 5;
        BigDecimal quantidadeCombustivel = BigDecimal.TEN;
        Carro carro = new Carro(
                "308",
                "Preto",
                marca,
                "SAOKSPAK123123",
                proprietario,
                20,
                4,
                numeroMarchas,
                quantidadeCombustivel
        );

        //velocidadeMaxima+1 para exceder a velocidade máxima
        for (int i=0; i<velocidadeMaxima; i++) {
            carro.acelera();
        }

        carro.freia();

        //numeroMarchas+1 para exceder o número de marcas
        for (int i=0; i<numeroMarchas; i++) {
            carro.trocaMarcha();
        }

//        carro.acelera(); //0 -> 1

        for (int i=numeroMarchas; i>0; i--) {
            carro.reduzMarcha();
        }
//        carro.reduzMarcha(); //testar velocodade 0 e marca 0 -> -1

        System.out.println("Autonomia de viagem do veículo: "
                + carro.calcularAutonomia(BigDecimal.TEN));

        System.out.println("------------------------------------");
    }

}
