package br.com.bootcamp.exer.exer13.elevador.exception;

public class ElevadorEntraException extends ElevadorException {

    public ElevadorEntraException() {
        super("Capacidade de pessoas do elevador excedida.");
    }

}
