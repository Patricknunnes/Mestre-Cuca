package br.com.produto.mestrecuca.repository;

import br.com.produto.mestrecuca.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
}