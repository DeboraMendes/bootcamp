package br.com.bootcamp.aula.service.venda;

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
        objeto.setId(Long.valueOf(vendas.size()+1));
        vendas.add(objeto);
        return objeto;
    }

    @Override
    public Venda alterar(Venda objeto) {
        for (int j = 0; j < vendas.size(); j++) {
            if (vendas.get(j).getId().equals(objeto.getId())) {
                vendas.set(j, objeto);
                return objeto;
            }
        }
        return null;
    }

    @Override
    public void excluir(Long id) {
        for (int j = 0; j < vendas.size(); j++) {
            if (vendas.get(j).getId().equals(id)) {
                vendas.remove(j);
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
