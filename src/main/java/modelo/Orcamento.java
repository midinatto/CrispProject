package modelo;

import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valorOrcamento;
    private String IcmsRegiao;

    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.IcmsRegiao = icmsRegiao;
    }
}
