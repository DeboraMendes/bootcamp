package br.com.bootcamp.aula.dao.venda;

import br.com.bootcamp.util.LocalDateUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaDAOImpl implements VendaDAO {

    private final List<Venda> vendas = new ArrayList<>();

    @Override
    public List<Venda> buscarTodos() {
        return vendas;
    }

    @Override
    public Venda buscar(Long id) {
        for (Venda venda : vendas) {
            if (venda.getId().equals(id)) {
                return venda;
            }
        }
        return null;
    }

    @Override
    public Venda inserir(Venda objeto) {
        objeto.setId((long) vendas.size() +1);
        vendas.add(objeto);
        return objeto;
    }

    @Override
    public Venda alterar(Venda objeto) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId().equals(objeto.getId())) {
                vendas.set(i, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Long id) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId().equals(id)) {
                vendas.remove(i);
                break;
            }
        }
    }

    @Override
    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal) {
        //imagine que aqui será retornado o resultado da seguinte consulta:
        //SELECT COUNT(id) FROM venda WHERE data BETWEEN :dataInicial AND :dataFinal;
        return vendas.stream()
                .filter(venda -> LocalDateUtil.isEntre(venda.getData(), dataInicial, dataFinal))
                .count();
    }

}
