package br.com.app.ageplan.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
}