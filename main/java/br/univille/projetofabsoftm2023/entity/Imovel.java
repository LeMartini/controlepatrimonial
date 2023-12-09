package br.univille.projetofabsoftm2023.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idImovel;
    private String nrSerieImovel;
    private String forma;
    private String zona;
    private String matriculaImovel;
    private String localRegistro;
    private String proprietarioAnterior;

    public long getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(long idImovel) {
        this.idImovel = idImovel;
    }

    public String getNrSerieImovel() {
        return nrSerieImovel;
    }

    public void setNrSerieImovel(String nrSerieImovel) {
        this.nrSerieImovel = nrSerieImovel;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getMatriculaImovel() {
        return matriculaImovel;
    }

    public void setMatriculaImovel(String matriculaImovel) {
        this.matriculaImovel = matriculaImovel;
    }

    public String getLocalRegistro() {
        return localRegistro;
    }

    public void setLocalRegistro(String localRegistro) {
        this.localRegistro = localRegistro;
    }

    public String getProprietarioAnterior() {
        return proprietarioAnterior;
    }

    public void setProprietarioAnterior(String proprietarioAnterior) {
        this.proprietarioAnterior = proprietarioAnterior;
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

    private String estadoConservacao;
    private String localInicial;
    private String localAtual;
    private String formaAquisicao;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtDepreciacao;
    @Column(name = "percentualDepreciacaoImovel")
    private Float percentualDepreciacaoImovel;
    private String situacaoBem;

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

    public Float getPercentualDepreciacaoImovel() {
        return percentualDepreciacaoImovel;
    }

    public void setPercentualDepreciacaoImovel(Float percentualDepreciacaoImovel) {
        this.percentualDepreciacaoImovel = percentualDepreciacaoImovel;
    }

    public String getSituacaoBem() {
        return situacaoBem;
    }

    public void setSituacaoBem(String situacaoBem) {
        this.situacaoBem = situacaoBem;
    }

}
