package br.unipar.programacaointernet.servicecep.bibliotecaapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(length = 120 ) // limitando o tamanho
    private String autor;


}
