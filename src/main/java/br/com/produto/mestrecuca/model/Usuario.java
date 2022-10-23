package br.com.produto.mestrecuca.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(nullable = false)
    private String login;

    private String senha;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Receita> receitas;

}
