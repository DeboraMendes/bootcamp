package br.com.bootcamp.exer.exer3;

public class Emprestimo {

    private boolean devolvido;

    public void devolver() {
        this.devolvido = true;
    }

    public boolean foiDevolvido() {
        return devolvido;
    }

}
