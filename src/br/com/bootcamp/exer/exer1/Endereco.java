package br.com.bootcamp.exer.exer1;

/**
 * Crie uma classe Endereço com os atributos endereço, número e bairro, todos os atributos são obrigatórios.
 */
public class Endereco {

    private final String endereco;
    private final String numero;
    private final String bairro;

    public Endereco(String endereco, String numero, String bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return endereco + ", " + numero + " - " + bairro;
    }
}
