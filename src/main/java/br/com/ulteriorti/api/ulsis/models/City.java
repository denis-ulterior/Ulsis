package br.com.ulteriorti.api.ulsis.models;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_Cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private State estado;
// getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public UUID getId() {
        return id;
    }
}