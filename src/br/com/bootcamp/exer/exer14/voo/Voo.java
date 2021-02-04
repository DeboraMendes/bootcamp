package br.com.bootcamp.exer.exer14.voo;

import br.com.bootcamp.exer.exer14.voo.exception.VooException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Voo {

    private final int numero;
    private final LocalDateTime dataHora;
    private final int numeroMaximoAssentos;
    private final List<Assento> assentos;

    public Voo(int numero, LocalDateTime dataHora, int numeroMaximoAssentos) {
        this.numero = numero;
        this.dataHora = dataHora;
        this.numeroMaximoAssentos = numeroMaximoAssentos;
        this.assentos = new ArrayList<>();

        for (int i = 1; i <= numeroMaximoAssentos; i++) {
            this.assentos.add(new Assento(i, true));
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getDataHora() {
        if (dataHora != null) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return formato.format(dataHora);
        }
        return null;
    }

    public int primeiroLivre() {
        for (Assento assento : this.assentos) {
            if (assento.isVago()) {
                return assento.getNumero();
            }
        }
        throw new VooException("Nenhum assento livre.");
    }

    public int proximoLivre(int numeroAssento) {
        for (Assento assento : this.assentos) {
            if (assento.isVago() && assento.getNumero() > numeroAssento) {
                return assento.getNumero();
            }
        }
        throw new VooException("Nenhum assento livre.");
    }

    public boolean verifica(int numero) {
        for (Assento assento : this.assentos) {
            if (assento.getNumero() == numero) {
                return assento.isVago();
            }
        }
        throw new VooException("Assento não encontrado.");
    }

    public boolean ocupa(int numero) {
        for (Assento assento : this.assentos) {
            if (assento.getNumero() == numero) {
                if (assento.isVago()) {
                    assento.setVago(false);
                    return true;
                }
                return false;
            }
        }
        throw new VooException("Assento não encontrado.");
    }

    public int vagas() {
        int vagas = 0;
        for (Assento assento : this.assentos) {
            if (assento.isVago()) {
                vagas += 1;
            }
        }
        return vagas;
    }

    public List<Integer> assentosLivres() {
        List<Integer> assentosLivres = new ArrayList<>();
        for (Assento assento : this.assentos) {
            if (assento.isVago()) {
                assentosLivres.add(assento.getNumero());
            }
        }
        if (assentosLivres.isEmpty()) {
            throw new VooException("Nenhum assento livre.");
        }
        return assentosLivres;
    }
}
