package br.com.bootcamp.aula.interfaces.relatorio;

import br.com.bootcamp.aula.interfaces.Imprimivel;

public class Relatorio {

    //recebe qualquer objeto imprimivel
    public void gerar(Imprimivel imprimivel) {
        imprimivel.mostrarDados();
    }

}
