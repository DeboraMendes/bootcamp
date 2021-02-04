package br.com.bootcamp.exer.exer13.elevador;

import br.com.bootcamp.exer.exer13.elevador.exception.ElevadorDesceException;
import br.com.bootcamp.exer.exer13.elevador.exception.ElevadorEntraException;
import br.com.bootcamp.exer.exer13.elevador.exception.ElevadorSaiException;
import br.com.bootcamp.exer.exer13.elevador.exception.ElevadorSobeException;

public class Elevador {

    private final int numeroAndares;
    private final int capacidade;

    private int andarAtual;
    private int numeroPessoas;

    public Elevador(int numeroAndares, int capacidade) {
        this.numeroAndares = numeroAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.numeroPessoas = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void entra() {
        if ((numeroPessoas + 1) > capacidade) {
            throw new ElevadorEntraException();
        }
        numeroPessoas += 1;
        System.out.println("Entrou.");
    }

    public void sai() {
        if ((numeroPessoas - 1) <= 0) {
            throw new ElevadorSaiException();
        }
        numeroPessoas -= 1;
        System.out.println("Saiu.");
    }

    public void sobe() {
        if (andarAtual == numeroAndares) {
            throw new ElevadorSobeException();
        }
        andarAtual += 1;
        System.out.println("Sobe..");
    }

    public void desce() {
        if (andarAtual == 0) {
            throw new ElevadorDesceException();
        }
        andarAtual -= 1;
        System.out.println("Desce..");
    }
}
