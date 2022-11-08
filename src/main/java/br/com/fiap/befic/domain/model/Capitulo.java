package br.com.fiap.befic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate dtPublicacao;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDate dtAtualizacao;

    @Column(nullable = false)
    private String conteudo;

    @Column(nullable = false)
    private String notasIniciais;

    @Column(nullable = false)
    private String notasFinais;

}
