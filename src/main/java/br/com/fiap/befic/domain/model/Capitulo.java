package br.com.fiap.befic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CapituloId.class)
public class Capitulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Long numero;

    @Id
    @EqualsAndHashCode.Include
    private Long historiaId;

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
