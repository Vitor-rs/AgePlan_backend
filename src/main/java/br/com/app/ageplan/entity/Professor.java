package br.com.app.ageplan.entity;

import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Pessoa {

    private String especialidade;

    // Setters

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // equals() e hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getEspecialidade(), professor.getEspecialidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEspecialidade());
    }
}