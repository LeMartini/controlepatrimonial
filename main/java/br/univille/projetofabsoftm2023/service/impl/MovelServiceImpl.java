package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Movel;
import br.univille.projetofabsoftm2023.repository.MovelRepository;
import br.univille.projetofabsoftm2023.service.MovelService;

@Service
public class MovelServiceImpl
        implements MovelService {

    @Autowired
    private MovelRepository repository;

    @Override
    public List<Movel> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Movel movel) {
        repository.save(movel);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
