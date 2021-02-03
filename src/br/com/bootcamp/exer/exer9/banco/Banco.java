package br.com.bootcamp.exer.exer9.banco;

import br.com.bootcamp.exer.exer9.conta.ContaBancaria;
import br.com.bootcamp.exer.exer9.relatorio.Imprimivel;

import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel {

    private final List<ContaBancaria> contaBancariaList = new ArrayList<>();

    public ContaBancaria procurar(String numeroConta) {
        if (!contaBancariaList.isEmpty()) {
            for (ContaBancaria contaBancaria : contaBancariaList) {
                if (contaBancaria.getNumeroConta().equals(numeroConta)) {
                    return contaBancaria;
                }
            }
        }
        return null;
    }

    private boolean existe(ContaBancaria contaBancaria) {
        if (!contaBancariaList.isEmpty()) {
            return procurar(contaBancaria.getNumeroConta()) != null;
        }
        return false;
    }

    public void inserir(ContaBancaria contaBancaria) {
        if (contaBancaria == null) {
            System.out.println("Conta bancária inválida.");
        } else if (existe(contaBancaria)) {
            System.out.println("Conta bancária já existe.");
        } else {
            contaBancariaList.add(contaBancaria);
            System.out.println("Conta bancária inserida com sucesso!");
        }
    }

    public void remover(ContaBancaria contaBancaria) {
        if (!contaBancariaList.isEmpty()) {
            //poderiamos remover por numero da conta tbm
            //outra instancia de conta com o mesmo numero
            //assim, não vazemos isso.
            //Remove somente se for a mesma instância
            boolean removido = contaBancariaList.remove(contaBancaria);
            System.out.println(removido ? "Conta bancária removida com sucesso! " : "Conta bancária não existe.");
        } else {
            System.out.println("Conta bancária não existe.");
        }
    }


    @Override
    public void mostrarDados() {
        for (ContaBancaria contaBancaria : contaBancariaList) {
            System.out.println(contaBancaria.toString());
        }
    }
}
