package br.com.bootcamp.exer.exer12.carro;

import br.com.bootcamp.exer.exer12.carro.exception.CarroAceleraException;
import br.com.bootcamp.exer.exer12.carro.exception.CarroTrocaMarchaException;
import br.com.bootcamp.exer.exer12.exception.CampoObrigatorioNullException;
import br.com.bootcamp.exer.exer12.proprietario.Proprietario;

import java.math.BigDecimal;

public class Carro {

    private final String modelo;
    private final String cor;
    private final Marca marca;
    private final String chassi;
    private final Proprietario proprietario;
    private final Integer velocidadeMaxima;
    private final Integer numeroPortas;
    private final Integer numeroMarchas;
    private final BigDecimal quantidadeCombustivel;
    private Integer velocidadeAtual;
    private Integer marchaAtual;

    public Carro(String modelo,
                 String cor,
                 Marca marca,
                 String chassi,
                 Proprietario proprietario,
                 Integer velocidadeMaxima,
                 Integer numeroPortas,
                 Integer numeroMarchas,
                 BigDecimal quantidadeCombustivel) {
        if (quantidadeCombustivel == null) {
            throw new CampoObrigatorioNullException("A quantidade de combustível é obrigatória");
        }

        if (proprietario == null) {
            throw new CampoObrigatorioNullException("O proprietário é obrigatório");
        }

        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.chassi = chassi;
        this.proprietario = proprietario;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.numeroPortas = numeroPortas;
        this.numeroMarchas = numeroMarchas;
        this.marchaAtual = 0;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getChassi() {
        return chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public BigDecimal getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void acelera() {
        if (velocidadeAtual.equals(velocidadeMaxima)) {
            throw new CarroAceleraException("Já está na valocidade máxima");
        }
        velocidadeAtual += 1;
        System.out.println("Valorcidade atual: " + velocidadeAtual);
    }

    public void freia() {
        velocidadeAtual = 0;
        System.out.println("Valorcidade atual: " + velocidadeAtual);
    }

    public void trocaMarcha() {
        if (marchaAtual.equals(numeroMarchas)) {
            throw new CarroTrocaMarchaException("Já está na marcha máxima");
        }
        marchaAtual += 1;
        System.out.println("Marcha atual: " + marchaAtual);
    }

    public void reduzMarcha() {
        if (marchaAtual == 1 && velocidadeAtual > 0) {
            throw new CarroTrocaMarchaException("A marcha ré só pode ser engatada caso a velocidade atual for igual à 0");
        }

        if (marchaAtual == 0) {
            throw new CarroTrocaMarchaException("Já está na marcha mínima");
        }

        marchaAtual -= 1;
        System.out.println("Marcha atual: " + marchaAtual);
    }

    public BigDecimal calcularAutonomia(BigDecimal consumoMedio) {
        return consumoMedio.multiply(quantidadeCombustivel);
    }
}
