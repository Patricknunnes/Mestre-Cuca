package br.com.produto.mestrecuca.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDto {

    private String nome;

    private BigDecimal quantidade;

}
