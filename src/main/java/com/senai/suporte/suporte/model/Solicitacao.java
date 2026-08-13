package com.senai.suporte.suporte.model;

import java.util.Objects;

public class Solicitacao {


    private Long id;
    private String nif;
    private String nomeSolicitante;
    private String numeroSala;
    private String codigoPatrimonio;
    private String descricaoProblema;
    private String tipoProblema;
    private StatusSolicitacao status = StatusSolicitacao.PENDENTE;

/*===============
 * METODO CONSTRUTOR
 =================*/

    public Solicitacao() {

    }

    /*===============
     * GETTERS E SETTERS
     =================*/


    public Long getId() {
        return id;
    }

    public StatusSolicitacao getStatus() {
        return status;
    }

    public void setStatus(StatusSolicitacao status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    public void setCodigoPatrimonio(String codigoPatrimonio) {
        this.codigoPatrimonio = codigoPatrimonio;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

	/*=============
	 * METODOS
	 ==============*/

    @Override
    public boolean equals(Object o) {
        if(this == o )
            return true;
        if(o == null || getClass() != o.getClass())return false;
        Solicitacao that = (Solicitacao) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(getClass());
    }

    public enum TipoProblema{
        INFORMATICA("Informática"),
        ELETRICA("Elétrica"),
        ZELADORIA("Zeladoria");

        private final String descricao;

        TipoProblema(String descricao){
            this.descricao = descricao;
        }
        public String getDescricao() {
            return descricao;
        }
    }
    public enum StatusSolicitacao{
        PENDENTE("Pendente"),
        EM_ANDAMENTO("Em Andamento"),
        CONCLUIDO("Concluido");

        private final String descricao;

        StatusSolicitacao(String descricao){
            this.descricao = descricao;
        }
        public String getDescricao() {
            return descricao;
        }
    }

}