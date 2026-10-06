package br.com.senai.patrimonio.atividade;

public class Equipamento {
    private String nome;
    private double ValorInicial;

    public Equipamento(String nome, double ValorInicial){
        this.nome= nome;
        this.ValorInicial=ValorInicial;
    }
    public String getNome(){
        return  nome;

    }

    public double getValorInicial() {
        return ValorInicial;
    }
    // TODO; retornar a depreciação padrao de 5% do valor incial (ValorInicial * 0.05%)
    public double calcularDepreciacao(){
        return this.ValorInicial * 0.05;
    }

}
