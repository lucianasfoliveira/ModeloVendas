package br.com.br.model;

import java.util.Date;
import java.util.List;

//contrato para representar as vendas
public interface Sale {
    int getId();//retorna id venda
    Date getDate();//retorna data venda
    List<String> getItems();//retorna lista de itens vendidos
    boolean isDispatched();//verifica se a venda foi despachada
    void setDispatched(boolean dispatched);//define se a venda foi despachada
    boolean isEmailSent();//verifica se a notificação por email foi enviada
    void setEmailSent(boolean emailSent);//define se a notificação poe email foi enviada
}

