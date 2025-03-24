package br.edu.imepac.Observer.model;


import br.edu.imepac.Observer.observer.Observer;

import java.math.BigDecimal;

public class Gerente implements Observer {
    private String nome;
    private String cpf;

    public Gerente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
        public void update (Estoque estoque) {

        BigDecimal valor = estoque.getValor();

        BigDecimal limite = new BigDecimal("1000.0");

        if (valor.compareTo(limite) > 0) {

            System.out.println("Gerente " + nome + ": Valor do produto + estoque.getProduto()" + " é maior que 1000.");

        }
    }
}

