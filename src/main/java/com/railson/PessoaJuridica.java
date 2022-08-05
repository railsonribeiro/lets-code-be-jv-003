package com.railson;

import java.math.BigDecimal;

import com.railson.model.Cliente;

public class PessoaJuridica extends Cliente {
    private static final BigDecimal DESCONTO = BigDecimal.valueOf(0.1);
    private static final BigDecimal QTD_DIAS_MINIMO = BigDecimal.valueOf(3);
    
    @Override
    public BigDecimal getDesconto() {
        return DESCONTO;
    }

    @Override
    public BigDecimal getQTDDiasMinimo() {
        return QTD_DIAS_MINIMO;
    }


}
