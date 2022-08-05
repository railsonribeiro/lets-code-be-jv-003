package com.railson;

import java.math.BigDecimal;

import com.railson.model.Cliente;

public class PessoaFisica extends Cliente {
    
    private static final BigDecimal DESCONTO = BigDecimal.valueOf(0.05);
    private static final BigDecimal QTD_DIAS_MINIMO = BigDecimal.valueOf(5);

    @Override
    public BigDecimal getDesconto() {

        return DESCONTO;
    }

    @Override
    public BigDecimal getQTDDiasMinimo() {
        return  QTD_DIAS_MINIMO;
    }

    
}
