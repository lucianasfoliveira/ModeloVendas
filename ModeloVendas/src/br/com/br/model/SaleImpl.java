package br.com.br.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//        Esta classe implementa a interface Sale.
//        Ela possui campos para armazenar o ID da venda, a data da venda,
//        a lista de itens, um indicador de se a venda foi despachada e um indicador de se o email
//        de notificação foi enviado.
//        O construtor recebe o ID, a data e a lista de itens da venda.
//        Implementa todos os métodos da interface para fornecer informações sobre a venda e controlar seu status.

public class SaleImpl implements Sale {
    private int id;
    private Date date;
    private List<String> items;
    private boolean isDispatched;
    private boolean isEmailSent;

    public SaleImpl(int id, Date date, List<String> items) {
        this.id = id;
        this.date = date;
        this.items = items;
        this.isDispatched = false;
        this.isEmailSent = false;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public List<String> getItems() {
        return items;
    }

    @Override
    public boolean isDispatched() {
        return isDispatched;
    }

    @Override
    public void setDispatched(boolean dispatched) {
        isDispatched = dispatched;
    }

    @Override
    public boolean isEmailSent() {
        return isEmailSent;
    }

    @Override
    public void setEmailSent(boolean emailSent) {
        isEmailSent = emailSent;
    }
}

