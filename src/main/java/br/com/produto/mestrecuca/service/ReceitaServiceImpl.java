package br.com.produto.mestrecuca.service;

import br.com.produto.mestrecuca.dto.ReceitaDto;
import br.com.produto.mestrecuca.model.Ingrediente;
import br.com.produto.mestrecuca.model.Receita;
import br.com.produto.mestrecuca.repository.ReceitaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceitaServiceImpl implements ReceitaService{

    private final ReceitaRepository receitaRepository;

    @Override
    public List<Receita> getAll() {
        List<Receita> receitas = receitaRepository.findAll();
        return receitas;
    }

    @Override
    public Receita getById(Integer id) {
        Receita receita = receitaRepository.findById(id).orElseThrow(RuntimeException::new);
        return receita;
    }

    @Override
    public Receita getByNameContaining(String nome) {
        return null;
    }

    @Override
    public Receita save(ReceitaDto receitaDto) {

        List<Ingrediente> ingredientes = new ArrayList<>();

        for (int i=0; i<receitaDto.getIngredientesDto().size(); i++) {
            ingredientes.add(Ingrediente.builder()
                            .nome(receitaDto.getIngredientesDto().get(i).getNome())
                            .quantidade(receitaDto.getIngredientesDto().get(i).getQuantidade())
                    .build());
        }

        return receitaRepository.save(Receita.builder()
                        .nome(receitaDto.getNome())
                        .modoPreparo(receitaDto.getModoPreparo())
                        .ingredientes(ingredientes)
                .build());
    }
}
