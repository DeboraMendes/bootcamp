package br.com.bootcamp.exer.exer11.especieUtil;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * é outra implementação de classe EspeciesUtil
 * essa implementação utiliza stream
 * os retornos dos métodos filtrar e classificar são em ordem alfabética
 */
public class EspeciesUtilOrdemAlfabeticaImpl implements EspeciesUtil {

    /**
     * recebe como parâmetro uma lista contendo animais, que podem ser de várias espécies diferentes
     * e retorna uma lista que contém apenas os animais cuja espécie é especificada no parâmetro “especieFiltrar”
     * se não houver nenhum animal da espécie especificada, retorna uma lista vazia
     *
     * @param animais
     * @param especieFiltrar
     * @return
     */
    @Override
    public List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar) {
        return animais.stream()
                .filter(animal -> animal.getEspecie().equals(especieFiltrar))
                .sorted(Comparator.comparing(Animal::getNome))
                .collect(Collectors.toList());
    }

    /**
     * recebe como parâmetro uma lista contendo animais
     * e retorna uma lista de Espécies contendo todas as espécies que foram encontradas na lista recebida como parâmetro
     * cada nome de espécie só aparece uma vez na lista de saída
     *
     * @param animais
     * @return
     */
    @Override
    public List<Especie> classificar(List<Animal> animais) {
        return animais.stream()
                .map(Animal::getEspecie)
                .distinct()
                .sorted(Comparator.comparing(Especie::getDescricao))
                .collect(Collectors.toList());
    }

}

