package br.crudspring.models;


import com.fasterxml.jackson.annotation.JsonIgnore;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "telefone")
public class Telefone  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tipo;
    private String telefone;


    //ligacao com user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


   public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
