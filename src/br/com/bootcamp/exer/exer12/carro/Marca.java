package br.com.bootcamp.exer.exer12.carro;

public class Marca {

    private final String nome;
    private final Integer anoFabricacao;
    private final Integer codigo;

    public Marca(String nome, Integer anoFabricacao, Integer codigo) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
