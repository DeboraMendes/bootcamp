package br.com.bootcamp.aula.dao;

import br.com.bootcamp.aula.dao.venda.Venda;
import br.com.bootcamp.aula.dao.venda.VendaDAO;
import br.com.bootcamp.aula.dao.venda.VendaDAOImpl;

import java.time.LocalDate;
import java.time.Month;

public class Principal {

    public static void main(String[] args) {

        VendaDAO dao = new VendaDAOImpl();
        //vendas de janeiro
        dao.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 1)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.JANUARY, 2)));
        //vendas de fevereiro
        dao.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 3)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 4)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.FEBRUARY, 5)));
        //vendas de março
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 6)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 7)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 8)));
        dao.inserir(new Venda(LocalDate.of(2021, Month.MARCH, 9)));

        //imagine o seguinte cenário:
        //o sistema precisa mostrar (view) quantas vendas teve no mês
        //a view chamou o controller pelo url e mandou o período como parâmetro
        LocalDate dataInicial = LocalDate.of(2021, Month.FEBRUARY, 1);
        LocalDate dataFinal = LocalDate.of(2021, Month.FEBRUARY, 28);

        //o controller delegou para o service
        Long totalVendas = dao.totalVendas(dataInicial, dataFinal);

        //o service vai devolver o resultado para o controller
        //e o controller vai dar o resultado pra view
        System.out.println("Foram feitas " + totalVendas + " vendas em fevereiro.");
    }

}
