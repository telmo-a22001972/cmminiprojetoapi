package com.example.demo.repositories;

import com.example.demo.dao.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    @Query("SELECT d FROM Disciplina d WHERE d.name = ?1")
    Disciplina findByNome(String nome);
}
