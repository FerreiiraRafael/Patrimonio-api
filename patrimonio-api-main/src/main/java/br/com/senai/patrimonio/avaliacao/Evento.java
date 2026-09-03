package br.com.senai.patrimonio.avaliacao;

import br.com.senai.patrimonio.avaliacao.Enum.StatusEvento;

public class Evento {
    private int codigo;
    private String nome;
    private String local;
    private StatusEvento status;
    private Participante Responsavel;

    public Evento(){}

    public Evento(int codigo, String nome, String local, StatusEvento status, Participante responsavel) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.status = status;
        Responsavel = responsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Participante getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(Participante responsavel) {
        Responsavel = responsavel;
    }

    public StatusEvento getStatus() {
        return status;
    }

    public void setStatus(StatusEvento status) {
        this.status = status;
    }
}
