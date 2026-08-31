package br.com.senai.patrimonio.model.enums;

public enum EstadoConservacao {
    NOVO("novo",0.05),
    BOM("bom",0.10),
    REGULAR("regular",0.20),
    RUIM("ruim",0.35),
    INSERVIVEL("inservivel",0.50);

    EstadoConservacao(String descricao, double taxaDepreciacaoAnual) {
        this.descricao = descricao;
        this.taxaDepreciacaoAnual = taxaDepreciacaoAnual;
    }

    private final String descricao;
    private final double taxaDepreciacaoAnual;

    public String getDescricao() {
        return descricao;
    }

    public double getTaxaDepreciacaoAnual() {
        return taxaDepreciacaoAnual;
    }
}
