package br.univille.projetofabsoftm2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetofabsoftm2023.entity.InfoFiscal;

@Repository
public interface InfoFiscalRepository
        extends JpaRepository<InfoFiscal, Long> {

}