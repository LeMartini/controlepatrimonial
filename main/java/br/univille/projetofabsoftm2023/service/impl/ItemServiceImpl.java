package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Item;
import br.univille.projetofabsoftm2023.repository.ItemRepository;
import br.univille.projetofabsoftm2023.service.ItemService;

@Service
public class ItemServiceImpl
        implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public List<Item> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Item item) {
        repository.save(item);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
