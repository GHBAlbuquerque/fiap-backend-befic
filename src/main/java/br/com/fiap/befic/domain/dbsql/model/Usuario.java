package br.com.fiap.befic.domain.dbsql.model;

import br.com.fiap.befic.domain.dbsql.model.enums.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome; //TODO: ADICIONAR NO FORM

    @Column(nullable = false)
    private LocalDate dtNasc; //TODO: ADICIONAR NO FORM

    @Column(nullable = false)
    private String celular;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GeneroEnum genero;

    @Column(nullable = false)
    private String perfil;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate dtCadastro;

}

