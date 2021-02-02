package br.com.bootcamp.exer.exer4.emprestimo;

public class Emprestimo {

    private boolean devolvido;

    public void devolver() {
        this.devolvido = true;
    }

    public boolean foiDevolvido() {
        return devolvido;
    }

}
