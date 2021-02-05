package br.com.bootcamp.aula.service;

import br.com.bootcamp.aula.service.venda.Venda;
import br.com.bootcamp.aula.service.venda.VendaDAOImpl;
import br.com.bootcamp.aula.service.venda.VendaService;
import br.com.bootcamp.aula.service.venda.VendaServiceImpl;

import java.time.LocalDate;
import java.time.Month;

public class Principal {

    public static void main(String[] args) {

        VendaService vendaService = new VendaServiceImpl(new VendaDAOImpl());
        Venda venda1 = new Venda(LocalDate.of(2021, Month.JANUARY, 1));
        Venda venda2 = new Venda(LocalDate.of(2021, Month.JANUARY, 2));
        Venda venda3 = new Venda(LocalDate.of(2021, Month.JANUARY, 3));

        //inseri
        vendaService.salvar(venda1);
        vendaService.salvar(venda2);
        vendaService.salvar(venda3);
        System.out.println("Buscar Todos" + vendaService.buscarTodos());

        //não vai dupliquei a venda1
        vendaService.salvar(venda1);
        System.out.println("Buscar Todos" + vendaService.buscarTodos());

        //não vai dupliquei a venda1
        vendaService.salvar(new Venda(1l, LocalDate.of(2021, Month.JANUARY, 4)));
        System.out.println("Buscar Todos" + vendaService.buscarTodos());

        //alterar venda
        venda2.setData(LocalDate.of(2021, Month.JANUARY, 31));
        vendaService.salvar(venda2);
        System.out.println("Buscar: " + vendaService.buscar(2l));

        //excluir
        vendaService.excluir(1l);
        System.out.println("Buscar Todos" + vendaService.buscarTodos());

        //total de vendas
        Long janeiro = vendaService.totalVendas(LocalDate.of(2021, Month.JANUARY, 1), LocalDate.of(2021, Month.JANUARY, 31));
        System.out.println("Total de vendas de janeiro: " + janeiro);
        Long fevereiro = vendaService.totalVendas(LocalDate.of(2021, Month.FEBRUARY, 1), LocalDate.of(2021, Month.FEBRUARY, 28));
        System.out.println("Total de vendas de fevereiro: " + fevereiro);

    }

}
