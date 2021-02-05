package br.com.bootcamp.aula.service.venda;

import java.time.LocalDate;
import java.util.List;

public interface VendaService {

    List<Venda> buscarTodos();

    Venda buscar(Long id);

    Venda salvar(Venda venda);

    void excluir(Long id);

    Long totalVendas(LocalDate dataInicial, LocalDate dataFinal);

}
