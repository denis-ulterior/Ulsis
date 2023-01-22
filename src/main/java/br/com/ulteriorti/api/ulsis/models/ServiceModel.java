package br.com.ulteriorti.api.ulsis.models;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;



@Entity
@Table(name = "TB_Servicos")
public class ServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    private LocalDate dataPrestacao;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private int garantiaEmDias;

    @Column(nullable = false)
    private LocalTime horaInicio;

    @Column(nullable = false)
    private int tempoGastoEmMinutos;

    @Column(nullable = false, length = 128)
    private String name;

    @Column(nullable = false, length = 256)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "equipamento_id")
    private Equipment equipamento;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //getters and setters
}
