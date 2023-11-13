package br.univille.projetofabsoftm2023.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idItem;
    private String nmItem;

    public long getIdItem() {
        return idItem;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }

    public String getNmItem() {
        return nmItem;
    }

    public void setNmItem(String nmItem) {
        this.nmItem = nmItem;
    }

}
