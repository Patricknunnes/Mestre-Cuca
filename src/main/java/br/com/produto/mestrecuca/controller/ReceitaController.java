package br.com.produto.mestrecuca.controller;

import br.com.produto.mestrecuca.dto.ReceitaDto;
import br.com.produto.mestrecuca.model.Receita;
import br.com.produto.mestrecuca.service.ReceitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/receitas")
public class ReceitaController {

    private final ReceitaService receitaService;

    @GetMapping
    public List<Receita> getAll(@PathVariable (required = false) String nome) {
        return receitaService.getAll(nome);
    }

    @GetMapping("/{id}")
    public Receita getById(@PathVariable Integer id) {
        return receitaService.getById(id);
    }

    @PostMapping
    public Receita save(@RequestBody ReceitaDto receitaDto) {
        return receitaService.save(receitaDto);
    }

}
