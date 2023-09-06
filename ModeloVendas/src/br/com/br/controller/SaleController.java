package br.com.br.controller;

import br.com.br.model.Sale;

import java.util.List;

// interface que define um contrato para controlar as vendas
public interface SaleController {
    //metodos da interface
    Sale createSale(List<String> items);//cria uma venda com base em uma lista de itens e retorna
    void dispatchSale(Sale sale);//marca uma venda como despachada
    void sendEmailNotification(Sale sale, String message);//envia notificação por email para uma venda
    List<Sale> getAllSales();//retorna uma lista de todas as vendas
}

