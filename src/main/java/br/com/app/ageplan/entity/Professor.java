package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_professor")
public class Professor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String especialidade;

    // Equals e HashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        return Objects.equals(getId(), professor.getId()) &&
                Objects.equals(getEspecialidade(), professor.getEspecialidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getEspecialidade());
    }
}