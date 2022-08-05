package com.railson;

import java.math.BigDecimal;

import com.railson.model.Cliente;

public class Aluguel {
    private tipoVeiculo veiculo;
    private Cliente cliente;
    private BigDecimal qtdDiarias;
    private BigDecimal valor;

    public Aluguel(tipoVeiculo veiculo, Cliente cliente, int qtdDiarias){
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.qtdDiarias = BigDecimal.valueOf(qtdDiarias);
        calcularValor();
    }

    private void calcularValor(){
        this.valor = this.veiculo.getPreco().multiply(qtdDiarias);
        if(this.qtdDiarias.compareTo(cliente.getQTDDiasMinimo()) == 1){
            this.valor = this.valor.subtract(this.valor.multiply(cliente.getDesconto()));
        }
    }

    public BigDecimal getValor() {
        return valor;
    }
}
