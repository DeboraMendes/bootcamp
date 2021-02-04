package br.com.bootcamp.exer.exer13.elevador.exception;

public class ElevadorSobeException extends ElevadorException {

    public ElevadorSobeException() {
        super("O elevador está no último andar.");
    }

}
