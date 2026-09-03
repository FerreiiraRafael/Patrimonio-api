package br.com.senai.patrimonio.model.enums;

public enum PagamentoComposto {
    PIX("Pix" , "Ativo"),
    CARTAO_CREDITO ("Cartao de credito", "ativo"),
    CARTAO_DEBITO("Cartao de debito","ativo"),
    BOLETO("Boleto ", "inativo"),
    PERMUTA("Permuta","inativo" ),
    DINHEIRO("Dinheiro","ativo");

    private final String descricao;
    private final String situacao;

    PagamentoComposto(String descricao, String situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSituacao() {
        return situacao;
    }
}
