package br.com.ulteriorti.api.ulsis.models;


import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "TB_Equipamentos")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 256)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //getters and setters
}