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
public class InfoFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdInfoFiscal;
    private int nrInfoFiscal;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtAquisicao;
    private float vlAquisicao;
    private float depreciacaoAcumulada;

    public long getIdInfoFiscal() {
        return IdInfoFiscal;
    }

    public void setIdInfoFiscal(long idInfoFiscal) {
        IdInfoFiscal = idInfoFiscal;
    }

    public int getNrInfoFiscal() {
        return nrInfoFiscal;
    }

    public void setNrInfoFiscal(int nrInfoFiscal) {
        this.nrInfoFiscal = nrInfoFiscal;
    }

    public Date getDtAquisicao() {
        return dtAquisicao;
    }

    public void setDtAquisicao(Date dtAquisicao) {
        this.dtAquisicao = dtAquisicao;
    }

    public float getVlAquisicao() {
        return vlAquisicao;
    }

    public void setVlAquisicao(float vlAquisicao) {
        this.vlAquisicao = vlAquisicao;
    }

    public float getDepreciacaoAcumulada() {
        return depreciacaoAcumulada;
    }

    public void setDepreciacaoAcumulada(float depreciacaoAcumulada) {
        this.depreciacaoAcumulada = depreciacaoAcumulada;
    }

}
