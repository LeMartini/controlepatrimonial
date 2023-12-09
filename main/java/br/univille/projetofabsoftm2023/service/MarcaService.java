package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Marca;

public interface MarcaService {
    List<Marca> getALL();

    void save(Marca marca);

    void delete(long id);
}
