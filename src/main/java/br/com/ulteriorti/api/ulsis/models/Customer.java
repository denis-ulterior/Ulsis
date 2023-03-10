package br.com.ulteriorti.api.ulsis.models;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_Clients")
public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID id;
    @Column(nullable = false, unique = true, length = 64)
    private String nomeRazaoSocial;
    @Column(unique = true, length = 32)
    private String identificador;//cpf ou cnpj, pode ser nulo para manter confidencialidade

    @Column(length = 32)
    private String codigoPostal;

    @Column(length = 64)
    private String endereco;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cidade_id")
    private City city;

    @Column(length = 32)
    private String contato;

    @Column(length = 16)
    private String telefone;

    public UUID getId() {
        return id;
    }

    @Column(length = 16)
    private String celular;

    @Column(nullable = false, unique = true, length = 32)
    private String email;

    @Column(nullable = false, unique = true, length = 128)
    private String senha;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(City cidade) {
        this.city = cidade;
    }

    public City getCidade() {
        return city;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
