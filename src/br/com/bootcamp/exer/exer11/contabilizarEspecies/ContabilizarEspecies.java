package br.com.bootcamp.exer.exer11.contabilizarEspecies;

import br.com.bootcamp.exer.exer11.animal.Animal;
import br.com.bootcamp.exer.exer11.animal.Especie;
import br.com.bootcamp.exer.exer11.especieUtil.EspeciesUtil;
import br.com.bootcamp.exer.exer11.resultado.Resultado;

import java.util.ArrayList;
import java.util.List;

/**
 * crie uma classe ContabilizarEspecies e escreva um método que receba dois parâmetros:
 * uma lista animais que implementam a interface Animal representando diversos animais
 * e um objeto que implementa a interface EspecieUtil
 */
public class ContabilizarEspecies {

    /**
     * o método deve contabilizar o número de animais em cada uma das espécies
     * e retornar os resultados como uma lista de objetos da classe Resultado
     * cada objeto conterá uma espécie e o número de animais da mesma contabilizados
     * devem ser consideradas apenas as espécies cujos animais estão presentes na lista.
     *
     * @param animais
     * @param especiesUtil
     * @return
     */
    public List<Resultado> getResultados(List<Animal> animais,
                                         EspeciesUtil especiesUtil) {

        List<Resultado> resultados = new ArrayList<>();

        List<Especie> especiesEncontradas = especiesUtil.classificar(animais);

        for (Especie especie : especiesEncontradas) {
            List<Animal> animaisDaEspecie = especiesUtil.filtrar(animais, especie);
            int quantidade = animaisDaEspecie.size();
            resultados.add(new Resultado(especie, quantidade));
        }

        return resultados;
    }

}
