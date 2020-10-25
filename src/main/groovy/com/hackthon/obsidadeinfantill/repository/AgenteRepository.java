package com.hackthon.obsidadeinfantill.repository;

import com.hackthon.obsidadeinfantill.domain.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenteRepository extends JpaRepository<Agente,Long> {
}
