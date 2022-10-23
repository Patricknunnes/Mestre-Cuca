package br.com.produto.mestrecuca.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    private String nome;

    private String modoPreparo;

    private BigDecimal avaliacao;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ingrediente> ingredientes;
}
