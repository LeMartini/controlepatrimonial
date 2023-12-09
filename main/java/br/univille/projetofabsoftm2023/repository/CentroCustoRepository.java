package br.univille.projetofabsoftm2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetofabsoftm2023.entity.CentroCusto;

@Repository
public interface CentroCustoRepository
        extends JpaRepository<CentroCusto, Long> {

}