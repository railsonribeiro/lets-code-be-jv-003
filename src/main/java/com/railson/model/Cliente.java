package com.railson.model;

import java.math.BigDecimal;

public abstract class Cliente {
    public  String nome;
    
    public abstract BigDecimal getDesconto();
    public abstract BigDecimal getQTDDiasMinimo();
}
