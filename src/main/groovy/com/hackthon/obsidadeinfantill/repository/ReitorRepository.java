package com.hackthon.obsidadeinfantill.repository;

import com.hackthon.obsidadeinfantill.domain.Escola.Reitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReitorRepository extends JpaRepository<Reitor,Long> {
}
