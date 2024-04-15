package br.unipar.programacaointernet.servicecep.bibliotecaapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Estante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@Column(length = 60)
    private String descricao;
   @Column(length = 60)
    private String estou_lendo;

    // falta adc a chave do banco

   /* @OneToMany  // é as relações várias ligações

    @Override
    public String toString() {
        return "Estante{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", estou_lendo='" + estou_lendo + '\'' +
                '}';
    */}


