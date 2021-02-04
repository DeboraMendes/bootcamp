package br.com.bootcamp.exer.exer12.proprietario;

public class Endereco {

    private final String rua;
    private final String numero;
    private final String bairro;
    private final String estado;
    private final String cidade;
    private final String cep;
    private final String complemento;

    public Endereco(String rua,
                    String numero,
                    String bairro,
                    String estado,
                    String cidade,
                    String cep,
                    String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }
}
