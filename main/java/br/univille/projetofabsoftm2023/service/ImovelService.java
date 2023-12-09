package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Imovel;

public interface ImovelService {
    List<Imovel> getALL();

    void save(Imovel imovel);

    void delete(long id);
}
