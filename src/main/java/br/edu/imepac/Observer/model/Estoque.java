package br.edu.imepac.Observer.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Estoque extends Observable {
    private String produto;
    private BigDecimal valor;
    private BigDecimal desconto;
    private List<Observer> observers = new
            ArrayList<Observer>();

    public Estoque() {
    }

    ;

    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void attach(Observer observer) {

        observers.add(observer);

    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this, null); // Adicionando o segundo argumento
        }
    }

}

