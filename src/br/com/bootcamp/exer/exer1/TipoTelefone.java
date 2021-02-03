package br.com.bootcamp.exer.exer1;

/**
 * Crie um Enum TipoTelefone com as opções COMERCIAL, RESIDENCIAL E CELULAR, adicione uma descrição para cada opção.
 */
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
