package br.com.bootcamp.exer.exer14;

import java.time.LocalDateTime;

/**
 * Escreva uma classe em que cada objeto representa um vôo que acontece em determinada data e em determinado
 * horário (atributo LocalDateTime).
 * Cada vôo possui um número máximo de passageiros, e a classe permite controlar a ocupação das vagas.
 * A classe deve ter os seguintes métodos:
 * <p>
 * Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data e Hora(um campo LocalDateTime)
 * e número máximo de assentos(quantidade máxima de passageiros);
 * <p>
 * Primeiro Livre: retorno o número do primeiro assento livre
 * <p>
 * Próximo Livre: retorna o número do próximo assento livre em relação ao assento passado por
 * parâmetro (Passar um número de assento e retornar o próximo livre, em ordem crescente)
 * <p>
 * Verifica: verifica se o número do assento recebido como parâmetro está ocupado
 * <p>
 * Ocupa: ocupa determinado assento do vôo, cujo número é recebido como parâmetro,
 * e retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso contrário
 * <p>
 * Vagas: retorna a quantidade de assentos vagos disponíveis (não ocupados) no vôo
 * <p>
 * Assentos Livres: retorna uma lista com os assentos disponíveis no vôo
 * <p>
 * getNumero retorna o número do vôo
 * <p>
 * getDataHora retorna a data e hora do vôo
 */
public class Exer14 {

    public static void main(String[] args) {
        System.out.println("----------------Exer 14--------------");

        int numero = 1;
        LocalDateTime dataHora = LocalDateTime.now();
        int numeroMaximoAssentos = 5;

        Voo voo = new Voo(numero, dataHora, numeroMaximoAssentos);
        System.out.println("primeiroLivre: " + voo.primeiroLivre());
        System.out.println("proximoLivre: " + voo.proximoLivre(2));
        System.out.println("verifica: " + voo.verifica(5));
        System.out.println("ocupa: " + voo.ocupa(3));
        System.out.println("vagas: " + voo.vagas());
        System.out.println("assentosLivres: " + voo.assentosLivres());
        System.out.println("getVoo: " + voo.getNumero());
        System.out.println("getDataHora: " + voo.getDataHora());

        System.out.println("------------------------------------");
    }

}
