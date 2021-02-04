package br.com.bootcamp.exer.exer12.carro.exception;

public abstract class CarroException extends RuntimeException {

    public CarroException(String mensagem) {
        super(mensagem);
    }

}
