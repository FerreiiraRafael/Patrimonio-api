package br.com.senai.patrimonio.atividade;

public class Veiculo extends Equipamento{

    public Veiculo (String nome, double ValorInicial){
        super(nome,ValorInicial);

    }
    @Override
        public double calcularDepreciacao(){
        return getValorInicial()*0.10;


    }
}
