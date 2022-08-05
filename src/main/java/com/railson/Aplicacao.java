package com.railson;

import com.railson.model.Cliente;

/**
 * Hello world!
 *
 */
public class Aplicacao 
{
    public static void main( String[] args )
    {
        
        // Cliente pessoaFisica = new PessoaFisica();
        // Cliente pessoaJuridica = new PessoaJuridica();
        // int qtdDiarias = 3;

        // Aplicacao aplicacao = new Aplicacao();


    }
    public Aluguel realizarAluguel(tipoVeiculo veiculo, Cliente cliente, int qtdDiarias ){
        return new Aluguel(veiculo, cliente, qtdDiarias);
    }
}
