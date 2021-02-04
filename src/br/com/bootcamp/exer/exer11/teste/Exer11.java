package br.com.bootcamp.exer.exer11.teste;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;
import br.com.bootcamp.exer.exer11.animal.aves.Aguia;
import br.com.bootcamp.exer.exer11.animal.aves.Coruja;
import br.com.bootcamp.exer.exer11.animal.mamiferos.Cachorro;
import br.com.bootcamp.exer.exer11.animal.mamiferos.Gato;
import br.com.bootcamp.exer.exer11.animal.peixes.Salmao;
import br.com.bootcamp.exer.exer11.animal.repteis.Cobra;
import br.com.bootcamp.exer.exer11.contabilizarEspecies.ContabilizarEspecies;
import br.com.bootcamp.exer.exer11.especieUtil.EspeciesUtilImpl;
import br.com.bootcamp.exer.exer11.especieUtil.EspeciesUtilOrdemAlfabeticaImpl;
import br.com.bootcamp.exer.exer11.resultado.Resultado;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie um enum Especie com as opções AVES, MAMIFEROS, PEIXES, REPTEIS e adicione uma descrição para cada opção.
 * Crie as seguintes interfaces:
 *
 * //representa um animal
 * public interface Animal {
 *    Especie getEspecie();
 *    String getNome();
 * }
 *
 * getEspecie: Retorna a espécie do animal.
 * getNome: Retorna o nome do animal.
 *
 * //representa um conjunto de rotinas utilitárias
 * public interface EspeciesUtil {
 *    List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar);
 *    List<Especie> classificar(List<Animal> animais);
 * }
 *
 * Filtrar: Recebe como parâmetro uma lista contendo animais, que podem ser de várias espécies diferentes,
 * e retorna uma lista que contém apenas os animais cuja espécie é especificada no parâmetro “especieFiltrar”.
 * Se não houver nenhum animal da espécie especificada, retorna uma lista vazia.
 *
 * Classificar: Recebe como parâmetro uma lista contendo animais e retorna uma lista de Espécies contendo todas as espécies que foram encontradas na lista recebida como parâmetro.
 * Cada nome de espécie só aparece uma vez na lista de saída.
 * Crie uma classe chamada Resultado com os atributos espécie e quantidade, os quais são obrigatórios.
 *
 * Crie uma classe ContabilizarEspecies e escreva um método que receba dois parâmetros:
 * Uma lista animais que implementam a interface Animal representando diversos animais e um objeto que implementa a interface EspecieUtil.
 *
 * O método deve contabilizar o número de animais em cada uma das espécies e retornar os resultados como uma lista de objetos da classe Resultado.
 * Cada objeto conterá uma espécie e o número de animais da mesma contabilizados.
 * Devem ser consideradas apenas as espécies cujos animais estão presentes na lista.
 */
public class Exer11 {

    public static void main(String[] args) {
        System.out.println("----------------Exer 11--------------");

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro(Especie.MAMIFEROS, "Cachorro 1"));
        animais.add(new Cachorro(Especie.MAMIFEROS, "Cachorro 2"));
        animais.add(new Gato(Especie.MAMIFEROS, "Gato 1"));
        animais.add(new Gato(Especie.MAMIFEROS, "Gato 2"));
        animais.add(new Aguia(Especie.AVES, "Águia"));
        animais.add(new Coruja(Especie.AVES, "Coruja"));
        animais.add(new Cobra(Especie.REPTEIS, "Cobra 1"));
        animais.add(new Cobra(Especie.REPTEIS, "Cobra 2"));
        animais.add(new Salmao(Especie.PEIXES, "Salmão"));


        ContabilizarEspecies contabilizarEspecies = new ContabilizarEspecies();

        List<Resultado> resultados = contabilizarEspecies.getResultados(
                animais,
                new EspeciesUtilImpl()
        );

        for (Resultado resultado : resultados) {
            System.out.println(resultado);
        }

        System.out.println("-------------Ordem Alfabética-------------");
        List<Resultado> resultadosEmOrdemAlfabetica = contabilizarEspecies.getResultados(
                animais,
                new EspeciesUtilOrdemAlfabeticaImpl()
        );

        for (Resultado resultado : resultadosEmOrdemAlfabetica) {
            System.out.println(resultado);
        }

        System.out.println("------------------------------------");
    }

}
