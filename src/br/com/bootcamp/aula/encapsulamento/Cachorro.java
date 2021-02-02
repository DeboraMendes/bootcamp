package br.com.bootcamp.aula.encapsulamento;

//classe: Cachorro
public class Cachorro {

    // atributo privado: nome do tipo texto (string);
    private String nome;

    //construtor com parametros
    public Cachorro(String nome) {
        this.nome = nome;
    }

    //método
    public void latir() {
        System.out.println("Auauauauau");
    }

    //método get: devolve um retorno e não tem parâmetro
    public String getNome() {
        return nome;
    }

    //método set: não tem retorno e recebe um parâmetro
    public void setNome(String nome) {
        this.nome = nome;
    }

}
