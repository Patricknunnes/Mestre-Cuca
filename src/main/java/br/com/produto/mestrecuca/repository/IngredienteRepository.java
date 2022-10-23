package br.com.produto.mestrecuca.repository;

import br.com.produto.mestrecuca.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer> {
}