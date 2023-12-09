package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Movimentacao;

public interface MovimentacaoService {
    List<Movimentacao> getALL();

    void save(Movimentacao movel);

    void delete(long id);
}
