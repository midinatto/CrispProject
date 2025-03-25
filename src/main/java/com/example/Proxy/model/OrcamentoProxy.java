package com.example.Proxy.model;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{
    //valor que deixaremos em proxy
    private BigDecimal descontoOrcamento;
    //Objeto original
    private Orcamento orcamento;
    //Contrutor
    public OrcamentoProxy(BigDecimal descontoOrcamento, Orcamento orcamento) {
        this.descontoOrcamento = descontoOrcamento;
        this.orcamento = orcamento;
    }

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento != null ? orcamento : new Orcamento(); // Garante que nunca seja null
    }

    //para
    @Override
    public BigDecimal getDescontoOrcamento() {
        if (descontoOrcamento == null) {
            if (orcamento != null) { // Evita o erro
                this.descontoOrcamento = orcamento.getDescontoOrcamento();
            } else {
                return BigDecimal.ZERO; // Ou outro valor padrão
            }
        }
        return this.descontoOrcamento;
    }

}
