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
    public Venda buscarPorId(Long id) {
        return dao.buscar(id);
    }

    @Override
    public Venda inserir(Venda objeto) {
        return dao.inserir(objeto);
    }

    @Override
    public Venda alterar(Venda objeto) {
        return dao.alterar(objeto);
    }

    @Override
    public void excluir(Long id) {
        dao.excluir(id);
    }

    @Override
    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal) {
        return dao.totalVendas(dataInicial, dataFinal);
    }

}
