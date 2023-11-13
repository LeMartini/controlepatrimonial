package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Depreciacao;

public interface DepreciacaoService {
    List<Depreciacao> getALL();

    void save(Depreciacao depreciacao);

    void delete(long id);
}
