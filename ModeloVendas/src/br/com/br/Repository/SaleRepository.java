package br.com.br.Repository;


import br.com.br.model.Sale;

import java.util.ArrayList;
import java.util.List;

//        classe SaleRepository é responsável por armazenar e fornecer acesso às vendas.
//        Ela mantém uma lista de vendas em memória e oferece métodos para salvar uma venda na lista e obter
//        todas as vendas.
//        A lista de vendas é inicializada vazia no construtor e protegida contra modificações indesejadas ao retornar
//        uma cópia da lista no método getAllSales.

public class SaleRepository {

    //lista de objetos do tipo "Sale", lista usada para armazenar as vendas
    private List<Sale> sales;

    //construtor, cria uma rraylist atribuida a sales, inicializando a lista vazia
    public SaleRepository() {
        this.sales = new ArrayList<>();
    }

   //permite adicionar uma venda a lista. recebe um objeto Sale como argumento e adiciona a lista sales.
    public void saveSale(Sale sale) {
        sales.add(sale);
    }

    //metodo getAllSales retorna uma lista de todas as vendas. Cria uma copia da lista sales para evitar alterações.
    //a copia é retornada como uma nosva instancia de arraulist
    public List<Sale> getAllSales() {
        return new ArrayList<>(sales); // Retorna uma cópia da lista para evitar alterações indesejadas
    }
}

