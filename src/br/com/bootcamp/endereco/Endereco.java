package br.com.bootcamp.endereco;

public class Endereco {

    private String endereco;
    private Integer numero;
    private String bairro;

    public Endereco(String endereco,
                    Integer numero,
                    String bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
