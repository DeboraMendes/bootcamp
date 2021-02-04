package br.com.bootcamp.exer.exer11.especieUtil;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;

import java.util.ArrayList;
import java.util.List;

/**
 * é uma implementação de classe EspeciesUtil
 * poderia existir outras classes que também implementam EspeciesUtil
 */
public class EspeciesUtilImpl implements EspeciesUtil {

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
        List<Animal> animaisDaEspecieFiltrar = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getEspecie().equals(especieFiltrar)) {
                animaisDaEspecieFiltrar.add(animal);
            }
        }
        return animaisDaEspecieFiltrar;
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
        List<Especie> especiesEncontradas = new ArrayList<>();
        for (Animal animal : animais) {
            if (!especiesEncontradas.contains(animal.getEspecie())) {
                especiesEncontradas.add(animal.getEspecie());
            }
        }
        return especiesEncontradas;
    }

}

