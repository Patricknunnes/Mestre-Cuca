package br.com.produto.mestrecuca.repository;

import br.com.produto.mestrecuca.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
    List<Receita> getByNomeContaining(String nome);
}