package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Imovel;
import br.univille.projetofabsoftm2023.repository.ImovelRepository;
import br.univille.projetofabsoftm2023.service.ImovelService;

@Service
public class ImovelServiceImpl
        implements ImovelService {

    @Autowired
    private ImovelRepository repository;

    @Override
    public List<Imovel> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Imovel imovel) {
        repository.save(imovel);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
