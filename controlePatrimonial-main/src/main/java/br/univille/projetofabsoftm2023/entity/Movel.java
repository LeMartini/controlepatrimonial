package br.univille.projetofabsoftm2023.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Movel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idMovel;
    private String nrSerieMovel;
    private String forma;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data;
    private String fornecedor;
    private String nrNota;
    private int vidaUtilMeses;
    private String estadoConservacao;
    private String localInicial;
    private String localAtual;
    private String formaAquisicao;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtDepreciacao;
    @Column(name = "percentualDepreciacaoMovel")
    private Float percentualDepreciacaoMovel = 0.0f;
    private String situacaoBem;

    public long getIdMovel() {
        return idMovel;
    }

    public void setIdMovel(long idMovel) {
        this.idMovel = idMovel;
    }

    public String getNrSerieMovel() {
        return nrSerieMovel;
    }

    public void setNrSerieMovel(String nrSerieMovel) {
        this.nrSerieMovel = nrSerieMovel;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNrNota() {
        return nrNota;
    }

    public void setNrNota(String nrNota) {
        this.nrNota = nrNota;
    }

    public int getVidaUtilMeses() {
        return vidaUtilMeses;
    }

    public void setVidaUtilMeses(int vidaUtilMeses) {
        this.vidaUtilMeses = vidaUtilMeses;
    }

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private CentroCusto nmCentroCusto;

    public CentroCusto getNmCentroCusto() {
        return nmCentroCusto;
    }

    public void setNmCentroCusto(CentroCusto nmCentroCusto) {
        this.nmCentroCusto = nmCentroCusto;
    }

    private String tpBem;

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private Marca nmMarca;

    private String nmModelo;

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    private Item nmItem;

    public Item getNmItem() {
        return nmItem;
    }

    public void setNmItem(Item nmItem) {
        this.nmItem = nmItem;
    }

    public String getTpBem() {
        return tpBem;
    }

    public void setTpBem(String tpBem) {
        this.tpBem = tpBem;
    }

    public Marca getNmMarca() {
        return nmMarca;
    }

    public void setNmMarca(Marca nmMarca) {
        this.nmMarca = nmMarca;
    }

    public String getNmModelo() {
        return nmModelo;
    }

    public void setNmModelo(String nmModelo) {
        this.nmModelo = nmModelo;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public String getLocalInicial() {
        return localInicial;
    }

    public void setLocalInicial(String localInicial) {
        this.localInicial = localInicial;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public void setLocalAtual(String localAtual) {
        this.localAtual = localAtual;
    }

    public String getFormaAquisicao() {
        return formaAquisicao;
    }

    public void setFormaAquisicao(String formaAquisicao) {
        this.formaAquisicao = formaAquisicao;
    }

    public Date getDtDepreciacao() {
        return dtDepreciacao;
    }

    public void setDtDepreciacao(Date dtDepreciacao) {
        this.dtDepreciacao = dtDepreciacao;
    }

    public Float getPercentualDepreciacaoMovel() {
        return percentualDepreciacaoMovel;
    }

    public void setPercentualDepreciacaoMovel(Float percentualDepreciacaoMovel) {
        this.percentualDepreciacaoMovel = percentualDepreciacaoMovel;
    }

    public String getSituacaoBem() {
        return situacaoBem;
    }

    public void setSituacaoBem(String situacaoBem) {
        this.situacaoBem = situacaoBem;
    }

}
