package br.com.ulteriorti.api.ulsis.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "TB_Servicos")
public class ServiceModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID id;


    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private int garantiaEmDias;

    @Column(nullable = false)
    private int tempoEstimado;

    @Column(nullable = false, length = 128)
    private String name;

    @Column(nullable = false, length = 256)
    private String descricao;

    public double getValor() {
        return valor;
    }

    public UUID getId() {
        return id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getGarantiaEmDias() {
        return garantiaEmDias;
    }

    public void setGarantiaEmDias(int garantiaEmDias) {
        this.garantiaEmDias = garantiaEmDias;
    }


    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




    //getters and setters
}
