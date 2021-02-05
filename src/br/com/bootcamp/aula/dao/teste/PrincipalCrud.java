package br.com.bootcamp.aula.dao.teste;

import br.com.bootcamp.aula.dao.venda.Venda;
import br.com.bootcamp.aula.dao.venda.VendaDAO;
import br.com.bootcamp.aula.dao.venda.VendaDAOImpl;

import java.time.LocalDate;
import java.time.Month;

public class PrincipalCrud {

    public static void main(String[] args) {

        VendaDAO dao = new VendaDAOImpl();
        Venda venda1 = new Venda(LocalDate.of(2021, Month.JANUARY, 1));
        Venda venda2 = new Venda(LocalDate.of(2021, Month.JANUARY, 2));
        Venda venda3 = new Venda(LocalDate.of(2021, Month.JANUARY, 3));

        //inseri
        dao.inserir(venda1);
        dao.inserir(venda2);
        dao.inserir(venda3);
        System.out.println("Buscar Todos" + dao.buscarTodos());

        //dupliquei a venda1
//        dao.inserir(venda1);
//        System.out.println("Buscar Todos" + dao.buscarTodos());

        //alterar venda
        venda2.setData(LocalDate.of(2021, Month.JANUARY, 31));
        dao.alterar(venda2);
        System.out.println("Buscar: " + dao.buscar(2l));

        //excluir
        dao.excluir(1l);
        System.out.println("Buscar Todos" + dao.buscarTodos());

        //total de vendas
        Long janeiro = dao.totalVendas(LocalDate.of(2021, Month.JANUARY, 1), LocalDate.of(2021, Month.JANUARY, 31));
        System.out.println("Total de vendas de janeiro: " + janeiro);
        Long fevereiro = dao.totalVendas(LocalDate.of(2021, Month.FEBRUARY, 1), LocalDate.of(2021, Month.FEBRUARY, 28));
        System.out.println("Total de vendas de fevereiro: " + fevereiro);


    }

}
