package br.com.ulteriorti.api.ulsis.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_States")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID id;

    public UUID getId() {
        return id;
    }

    @Column(nullable = false,length = 2)
    private String sigla;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
