package br.com.produto.mestrecuca.service;

import br.com.produto.mestrecuca.dto.ReceitaDto;
import br.com.produto.mestrecuca.model.Receita;

import java.util.List;

public interface ReceitaService {

    List<Receita> getAll();

    Receita getById(Integer id);

    Receita getByNameContaining(String nome);

    Receita save(ReceitaDto receitaDto);
}
