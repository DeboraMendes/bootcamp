package br.com.bootcamp.aula.service.venda;

import java.time.LocalDate;
import java.util.List;

public class VendaServiceImpl implements VendaService {

    private final VendaDAO dao;

    public VendaServiceImpl(VendaDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Venda> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public Venda buscar(Long id) {
        return dao.buscar(id);
    }

    @Override
    public Venda salvar(Venda venda) {
        if (venda.getId() == null) {
            return inserir(venda);
        }
        return alterar(venda);
    }

    private Venda inserir(Venda venda) {
        return dao.inserir(venda);
    }

    private Venda alterar(Venda venda) {
        return dao.alterar(venda);
    }

    @Override
    public boolean excluir(Long id) {
        return dao.excluir(id);
    }

    @Override
    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal) {
        return dao.totalVendas(dataInicial, dataFinal);
    }

}
