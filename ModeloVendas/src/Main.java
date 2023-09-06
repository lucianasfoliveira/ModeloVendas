import br.com.br.controller.SaleController;
import br.com.br.controller.SaleControllerImpl;
import br.com.br.model.Sale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // cria uma instância da classe SaleControllerImpl e a atribui a uma variável chamada saleController
        //permite que utilize os métodos da classe SaleController para controlar as vendas.
        SaleController saleController = new SaleControllerImpl();

        // Criação de algumas vendas
        List<String> items1 = new ArrayList<>();
        items1.add("Item 1");
        items1.add("Item 2");
        Sale sale1 = saleController.createSale(items1);

        List<String> items2 = new ArrayList<>();
        items2.add("Item 3");
        items2.add("Item 4");
        Sale sale2 = saleController.createSale(items2);

        // Despacha a primeira venda
        saleController.dispatchSale(sale1);

        // Envia notificação por email para a segunda venda
        saleController.sendEmailNotification(sale2, "Sua venda foi enviada!");

        // Exibe todas as vendas
        List<Sale> allSales = saleController.getAllSales();
        System.out.println("Todas as vendas:");
        for (Sale sale : allSales) {
            System.out.println("ID: " + sale.getId());
            System.out.println("Data: " + sale.getDate());
            System.out.println("Itens: " + sale.getItems());
            System.out.println("Despachada: " + sale.isDispatched());
            System.out.println("Email Enviado: " + sale.isEmailSent());
            System.out.println();
        }
    }
}
