package br.com.br.controller;

import br.com.br.model.Sale;
import br.com.br.model.SaleImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//classe q implementa SaleController
public class SaleControllerImpl implements SaleController {
    private List<Sale> sales;//lista para armazenar todas as vendas criadas
    private int nextSaleId;

    public SaleControllerImpl() {
        sales = new ArrayList<>();
        nextSaleId = 1;
    }

    //metodo creatSale cria uma venda com base em uma lista de itens e a adiciona a lista de vendas
    @Override
    public Sale createSale(List<String> items) {
        Sale sale = new SaleImpl(nextSaleId++, new Date(), items);
        sales.add(sale);
        return sale;
    }

    //marca um avenda como despachada
    @Override
    public void dispatchSale(Sale sale) {
        sale.setDispatched(true);
        System.out.println("Venda #" + sale.getId() + " despachada.");
    }

    //envia uma notificação por email para uma venda e a marca como notificação enviada
    @Override
    public void sendEmailNotification(Sale sale, String message) {
        sale.setEmailSent(true);
        System.out.println("Notificação por email para venda #" + sale.getId() + ": " + message);
    }

    //retorna uma lista d etodas as vendas registrada
    @Override
    public List<Sale> getAllSales() {
        return sales;
    }
}

