package br.com.fiap.befic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Capitulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long numero;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Historia historia;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private LocalDate dt_publicacao;

    @Column(nullable = false)
    private LocalDate dt_atualizacao;

    @Column(nullable = false)
    private String conteudo;

    @Column(nullable = false)
    private String notasIniciais;

    @Column(nullable = false)
    private String notasFinais;

}
