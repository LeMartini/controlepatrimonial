package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.CentroCusto;

public interface CentroCustoService {
    List<CentroCusto> getALL();

    void save(CentroCusto centroCusto);

    void delete(long id);
}