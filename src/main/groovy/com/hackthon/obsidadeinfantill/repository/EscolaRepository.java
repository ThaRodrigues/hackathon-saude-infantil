package com.hackthon.obsidadeinfantill.repository;

import com.hackthon.obsidadeinfantill.domain.Escola.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola,Long> {
}
