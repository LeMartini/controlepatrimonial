package br.univille.projetofabsoftm2023.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idMovimentacao;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtMovimentacao;
    private String tpMovimentacao;

    public long getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(long idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Date getDtMovimentacao() {
        return dtMovimentacao;
    }

    public void setDtMovimentacao(Date dtMovimentacao) {
        this.dtMovimentacao = dtMovimentacao;
    }

    public String getTpMovimentacao() {
        return tpMovimentacao;
    }

    public void setTpMovimentacao(String tpMovimentacao) {
        this.tpMovimentacao = tpMovimentacao;
    }

}
