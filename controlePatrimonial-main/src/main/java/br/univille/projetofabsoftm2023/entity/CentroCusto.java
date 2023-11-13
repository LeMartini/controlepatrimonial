package br.univille.projetofabsoftm2023.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CentroCusto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idCentroCusto;
    private String nmCentroCusto;

    public long getIdCentroCusto() {
        return idCentroCusto;
    }

    public void setIdCentroCusto(long idCentroCusto) {
        this.idCentroCusto = idCentroCusto;
    }

    public String getNmCentroCusto() {
        return nmCentroCusto;
    }

    public void setNmCentroCusto(String nmCentroCusto) {
        this.nmCentroCusto = nmCentroCusto;
    }

}
