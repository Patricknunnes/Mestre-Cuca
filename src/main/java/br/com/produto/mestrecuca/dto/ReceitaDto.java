package br.com.produto.mestrecuca.dto;

import br.com.produto.mestrecuca.model.Ingrediente;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReceitaDto {

    private String nome;

    private String modoPreparo;

    private List<IngredienteDto> ingredientesDto;

}
