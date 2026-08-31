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

    PagamentoComposto(String descicao, String situacao) {
        this.descricao = descicao;
        this.situacao = situacao;
    }

    public String getDescicao() {
        return descricao;
    }

    public String getSituacao() {
        return situacao;
    }
}
