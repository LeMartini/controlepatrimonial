package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Item;

public interface ItemService {
    List<Item> getALL();

    void save(Item item);

    void delete(long id);
}
