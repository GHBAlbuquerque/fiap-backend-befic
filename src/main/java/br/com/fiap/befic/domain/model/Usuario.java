package br.com.fiap.befic.domain.model;

import br.com.fiap.befic.domain.model.enums.GeneroEnum;
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
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome; //TODO: ADICIONAR NO FORM

    @Column(nullable = false)
    private LocalDate dt_nasc; //TODO: ADICIONAR NO FORM

    @Column(nullable = false)
    private String celular;

    @Column(nullable = false)
    private String email;

    @Enumerated
    @Column(nullable = false)
    private GeneroEnum genero;

    @Column(nullable = false)
    private String perfil;

}

