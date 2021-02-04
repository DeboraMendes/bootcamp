package br.com.bootcamp.aula.excecoes.exception;

//exception para animal que extends de RuntimeException
public class AnimalException extends RuntimeException {

    //o parametro é a mensagem que será apresentada
    public AnimalException(String mensagem) {
        super(mensagem);
    }

}
