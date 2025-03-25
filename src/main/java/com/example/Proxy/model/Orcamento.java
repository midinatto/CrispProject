package com.example.Proxy.model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;
    private int qtdItens;
    private BigDecimal descontoOrcamento;

    public Orcamento() {
    }
    public Orcamento(BigDecimal valorOrcamento, int qtdItens, BigDecimal descontoOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
        this.descontoOrcamento = descontoOrcamento;
    }

    public Orcamento(BigDecimal bigDecimal, BigDecimal bigDecimal1) {
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getDescontoOrcamento() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
    //construtores um cheio e outro vazio
//getter and setter
}