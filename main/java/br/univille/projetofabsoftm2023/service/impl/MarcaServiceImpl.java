package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Marca;
import br.univille.projetofabsoftm2023.repository.MarcaRepository;
import br.univille.projetofabsoftm2023.service.MarcaService;

@Service
public class MarcaServiceImpl
        implements MarcaService {

    @Autowired
    private MarcaRepository repository;

    @Override
    public List<Marca> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Marca marca) {
        repository.save(marca);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
