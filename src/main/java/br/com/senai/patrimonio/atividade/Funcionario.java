package br.com.senai.patrimonio.atividade;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    // todo: retornar a bonificação padrao de 5% do salario base
    public double calcularBonificacao  (){
        return  this.salarioBase;

    }
}
