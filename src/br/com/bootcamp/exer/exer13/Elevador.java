package br.com.bootcamp.exer.exer13;

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
            throw new RuntimeException("Capacidade de pessoas do elevador excedida.");
        }
        numeroPessoas += 1;
        System.out.println("Entrou.");
    }

    public void sai() {
        if ((numeroPessoas - 1) <= 0) {
            throw new RuntimeException("Nenhuma pessoa dentro do elevador.");
        }
        numeroPessoas -= 1;
        System.out.println("Saiu.");
    }

    public void sobe() {
        if (andarAtual == numeroAndares) {
            throw new RuntimeException("O elevador está no último andar.");
        }
        andarAtual += 1;
        System.out.println("Sobe..");
    }

    public void desce() {
        if (andarAtual == 0) {
            throw new RuntimeException("O elevador está no térreo.");
        }
        andarAtual -= 1;
        System.out.println("Desce..");
    }
}
