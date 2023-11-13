package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Movimentacao;
import br.univille.projetofabsoftm2023.repository.MovimentacaoRepository;
import br.univille.projetofabsoftm2023.service.MovimentacaoService;

@Service
public class MovimentacaoServiceImpl
        implements MovimentacaoService {

    @Autowired
    private MovimentacaoRepository repository;

    @Override
    public List<Movimentacao> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Movimentacao movel) {
        repository.save(movel);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
