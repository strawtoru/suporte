package com.senai.suporte.suporte.model;

import java.util.Objects;

public class PainelTecnico {

    private Long id;
    private Solicitacao solicitacao;
    private String tecnicoResponsavel;
    private String Observacoes;

	/* ===================
	 * metodo construtor
	 =================*/

    public PainelTecnico() {

    }

    /* ===================
     * getters e setters
     =================*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }

    public String getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(String tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String observacoes) {
        Observacoes = observacoes;
    }

    /*=============================================================
     * EQUALS() E hashCode() - igualdade baseada no id (padrão jpa)
     * =============================================================
     */

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass()!= o.getClass())
            return false;
        PainelTecnico that = (PainelTecnico) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass());
    }
}