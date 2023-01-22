package br.com.ulteriorti.api.ulsis.models;


import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "TB_Equipamentos")
public class Equipment {
    @Id
    @Column(columnDefinition = "uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 256)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //getters and setters
}