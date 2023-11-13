package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Depreciacao;
import br.univille.projetofabsoftm2023.repository.DepreciacaoRepository;
import br.univille.projetofabsoftm2023.service.DepreciacaoService;

@Service
public class DepreciacaoServiceImpl
        implements DepreciacaoService {

    @Autowired
    private DepreciacaoRepository repository;

    @Override
    public List<Depreciacao> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Depreciacao depreciacao) {
        repository.save(depreciacao);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
