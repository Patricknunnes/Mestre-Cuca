package br.com.produto.mestrecuca.repository;

import br.com.produto.mestrecuca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}