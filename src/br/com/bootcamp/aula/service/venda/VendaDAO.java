package br.com.bootcamp.aula.service.venda;

import java.time.LocalDate;
import java.util.List;

public interface VendaDAO {

    List<Venda> buscarTodos();

    Venda buscar(Long id);

    Venda inserir(Venda venda);

    Venda alterar(Venda venda);

    void excluir(Long id);

    Long totalVendas(LocalDate dataInicial, LocalDate dataFinal);

}
