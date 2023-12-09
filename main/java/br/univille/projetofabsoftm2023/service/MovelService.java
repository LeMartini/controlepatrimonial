package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Movel;

public interface MovelService {
    List<Movel> getALL();

    void save(Movel movel);

    void delete(long id);
}
