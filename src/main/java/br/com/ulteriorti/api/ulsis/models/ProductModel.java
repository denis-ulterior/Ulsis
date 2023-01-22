package br.com.ulteriorti.api.ulsis.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_Products")
public class ProductModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID id;


    @Column(nullable = false)
    private double valorCusto;
    @Column(nullable = false)
    private double valorVenda;
    @Column(nullable = false)
    private int garantiaEmDias;

    @Column(nullable = false, length = 64)
    private String nome;
    @Column(nullable = false, length = 256)
    private String descricao;

    public double getValorVenda() {
        return valorVenda;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public void setValorVenda(double valor) {
        this.valorVenda = valorVenda;
    }

    public int getGarantiaEmDias() {
        return garantiaEmDias;
    }

    public void setGarantiaEmDias(int garantiaEmDias) {
        this.garantiaEmDias = garantiaEmDias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    //getters and setters
}
