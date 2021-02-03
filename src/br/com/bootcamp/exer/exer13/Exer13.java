package br.com.bootcamp.exer.exer13;

/**
 * Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
 * A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
 * capacidade do elevador e quantas pessoas estão presentes nele.
 * A classe deve também disponibilizar os seguintes métodos:
 * <p>
 * Construtor: Deve receber como parâmetros a capacidade do elevador e o total de andares no prédio
 * (os elevadores sempre começam no térreo e vazio);
 * <p>
 * Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
 * Sai: para remover uma pessoa do elevador (só deve remover se houver alguém
 * dentro dele);
 * Sobe: para subir um andar (não deve subir se já estiver no último andar);
 * Desce : para descer um andar (não deve descer se já estiver no térreo);
 * Obs: Caso alguma das condições não forem atendidas, apresentar uma RuntimeException com a descrição do erro.
 * <p>
 * Encapsular os atributos da classe (caso necessário, com os getters e setters).
 */
public class Exer13 {

    public static void main(String[] args) {
        System.out.println("----------------Exer 13--------------");

        Elevador elevador = new Elevador(2, 5);
        elevador.entra();
        elevador.sobe();
        elevador.desce();
        elevador.desce();

        System.out.println("------------------------------------");
    }

}
