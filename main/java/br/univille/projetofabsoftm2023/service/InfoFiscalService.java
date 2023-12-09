package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.InfoFiscal;

public interface InfoFiscalService {
    List<InfoFiscal> getALL();

    void save(InfoFiscal infoFiscal);

    void delete(long id);
}
