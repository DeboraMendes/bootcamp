package br.com.bootcamp.exer.exer13.elevador.exception;

public class ElevadorSaiException extends ElevadorException {

    public ElevadorSaiException() {
        super("Nenhuma pessoa dentro do elevador.");
    }

}
