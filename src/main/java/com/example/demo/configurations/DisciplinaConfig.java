package com.example.demo.configurations;

import com.example.demo.dao.Disciplina;
import com.example.demo.repositories.DisciplinaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DisciplinaConfig {

    @Bean
    CommandLineRunner disciplinaCommandLineRunner(DisciplinaRepository repository) {
       return args -> {
           Disciplina disciplina1 = new Disciplina(
                   "Matemática Discreta"
           );
           Disciplina disciplina2 = new Disciplina(
                   "Matemática 1"
           );
           Disciplina disciplina3 = new Disciplina(
                   "Matemática 2"
           );
           Disciplina disciplina4 = new Disciplina(
                   "Álgebra Linear"
           );

           repository.saveAll(
                   List.of(disciplina1, disciplina2, disciplina3, disciplina4)
           );
       };
    };
}
