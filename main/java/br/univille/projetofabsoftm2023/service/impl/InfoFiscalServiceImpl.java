package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.InfoFiscal;
import br.univille.projetofabsoftm2023.repository.InfoFiscalRepository;
import br.univille.projetofabsoftm2023.service.InfoFiscalService;

@Service
public class InfoFiscalServiceImpl
        implements InfoFiscalService {

    @Autowired
    private InfoFiscalRepository repository;

    @Override
    public List<InfoFiscal> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(InfoFiscal infoFiscal) {
        repository.save(infoFiscal);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
