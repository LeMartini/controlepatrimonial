package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.CentroCusto;
import br.univille.projetofabsoftm2023.repository.CentroCustoRepository;
import br.univille.projetofabsoftm2023.service.CentroCustoService;

@Service
public class CentroCustoServiceImpl
        implements CentroCustoService {

    @Autowired
    private CentroCustoRepository repository;

    @Override
    public List<CentroCusto> getALL() {
        return repository.findAll();
    }

    public void save(CentroCusto centroCusto) {
        repository.save(centroCusto);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

}
