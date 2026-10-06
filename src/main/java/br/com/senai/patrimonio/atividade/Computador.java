package br.com.senai.patrimonio.atividade;

public class Computador  extends Equipamento {

    public Computador(String nome, double ValorInicial) {
        super(nome, ValorInicial);

    }
    @Override
    public double calcularDepreciacao(){
        return getValorInicial()* 0.20;
    }

}
