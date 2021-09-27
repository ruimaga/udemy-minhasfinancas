package com.ruimagalhaes.minhasfinancas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruimagalhaes.minhasfinancas.domain.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
