package br.univille.projetofabsoftm2023.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Depreciacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepreciacao;

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private Imovel ImovelDepreciado;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtDepreciacao;
    private float vlAntesDepreciacao;
    private float vlDepreciado;

    public long getIdDepreciacao() {
        return idDepreciacao;
    }

    public void setIdDepreciacao(long idDepreciacao) {
        this.idDepreciacao = idDepreciacao;
    }

    public Imovel getBemDepreciado() {
        return ImovelDepreciado;
    }

    public void set(Imovel bemDepreciado) {
        this.ImovelDepreciado = bemDepreciado;
    }

    public Date getDtDepreciacao() {
        return dtDepreciacao;
    }

    public void setDtDepreciacao(Date dtDepreciacao) {
        this.dtDepreciacao = dtDepreciacao;
    }

    public float getVlAntesDepreciacao() {
        return vlAntesDepreciacao;
    }

    public void setVlAntesDepreciacao(float vlAntesDepreciacao) {
        this.vlAntesDepreciacao = vlAntesDepreciacao;
    }

    public float getVlDepreciado() {
        return vlDepreciado;
    }

    public void setVlDepreciado(float vlDepreciado) {
        this.vlDepreciado = vlDepreciado;
    }

}
