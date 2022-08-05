package com.railson;

import java.math.BigDecimal;

public enum tipoVeiculo {

    PEQUENO("Pequeno",BigDecimal.valueOf( 100)),
    MEDIO("Medio",BigDecimal.valueOf(150)),
    SUV("SUV",BigDecimal.valueOf(200));
    BigDecimal preco;
    String tipo;
    
    tipoVeiculo(String tipo, BigDecimal preco){
        this.preco = preco;
        this.tipo = tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
