package br.com.bootcamp.exer.exer3;

public class Livro {

    private Integer id;
    private String nome;

    public Livro(Integer id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return id + "-" + nome;
    }

}
