package com.railson;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

public class AplicacaoTest {

    @Test
    public void verificarPrecoPessoaFisicaComDesconto(){

        tipoVeiculo veiculo = tipoVeiculo.MEDIO;
        PessoaFisica cliente = new PessoaFisica();
        int qtdDiarias = 6; 
        Aplicacao aplicacao = new Aplicacao();

        Aluguel aluguel = aplicacao.realizarAluguel(veiculo, cliente, qtdDiarias);

        BigDecimal precoEsperado =  BigDecimal.valueOf(855);

        assertTrue(precoEsperado.compareTo(aluguel.getValor()) == 0);
    
    }

    @Test
    public void verificarPrecoPessoaFisicaSemDesconto(){

        tipoVeiculo veiculo = tipoVeiculo.MEDIO;
        PessoaFisica cliente = new PessoaFisica();
        int qtdDiarias = 4; 
        Aplicacao aplicacao = new Aplicacao();

        Aluguel aluguel = aplicacao.realizarAluguel(veiculo, cliente, qtdDiarias);

        BigDecimal precoEsperado =  BigDecimal.valueOf(600);

        assertTrue(precoEsperado.compareTo(aluguel.getValor()) == 0);
    
    }

    @Test
    public void verificarPrecoPessoaJuridicaSemDesconto(){

        tipoVeiculo veiculo = tipoVeiculo.MEDIO;
        PessoaJuridica cliente = new PessoaJuridica();
        int qtdDiarias = 3; 
        Aplicacao aplicacao = new Aplicacao();

        Aluguel aluguel = aplicacao.realizarAluguel(veiculo, cliente, qtdDiarias);

        BigDecimal precoEsperado =  BigDecimal.valueOf(450);


        assertTrue(precoEsperado.compareTo(aluguel.getValor()) == 0);
    
    }

    @Test
    public void verificarPrecoPessoaJuridicaComDesconto(){

        tipoVeiculo veiculo = tipoVeiculo.MEDIO;
        PessoaJuridica cliente = new PessoaJuridica();
        int qtdDiarias = 4; 
        Aplicacao aplicacao = new Aplicacao();

        Aluguel aluguel = aplicacao.realizarAluguel(veiculo, cliente, qtdDiarias);

        BigDecimal precoEsperado =  BigDecimal.valueOf(540);


        assertTrue(precoEsperado.compareTo(aluguel.getValor()) == 0);
    
    }
}
