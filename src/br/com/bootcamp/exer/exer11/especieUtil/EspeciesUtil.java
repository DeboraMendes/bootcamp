package br.com.bootcamp.exer.exer11.especieUtil;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;

import java.util.List;

/**
 * representa um conjunto de rotinas utilitárias
 */
public interface EspeciesUtil {

    List<Animal> filtrar(List<Animal> animais, Especie especieFiltrar);

    List<Especie> classificar(List<Animal> animais);

}

