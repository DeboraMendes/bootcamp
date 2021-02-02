package br.com.bootcamp.exer.exer1.telefone;

public enum TipoTelefone {
    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial"),
    CELULAR("Celular");

    private String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
