package com.example.demo.dao;

import jakarta.persistence.*;

@Entity
@Table
public class Disciplina {
    @Id
    @SequenceGenerator(
            name = "disciplina_sequence",
            sequenceName = "disciplina_sequence",
            allocationSize = 1 // increment by 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "disciplina_sequence"
    )
    private Long id;
    private String name;

    public Disciplina() {
    }

    public Disciplina(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Disciplina(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
