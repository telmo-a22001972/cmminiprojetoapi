package com.example.demo.configurations;

import com.example.demo.dao.Avaliacao;
import com.example.demo.dao.Disciplina;
import com.example.demo.repositories.AvaliacaoRepository;
import com.example.demo.repositories.DisciplinaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class AvaliacaoConfig {
    @Bean
    CommandLineRunner avaliacaoCommandLineRunner(AvaliacaoRepository avaliacaoRepository, DisciplinaRepository disciplinaRepository) {
        //TODO: Fix this, está a ficar como NULL
        Disciplina matematicaDiscreta = disciplinaRepository.findByNome("Matemática Discreta");
        Disciplina matematica = disciplinaRepository.findByNome("Matemática 1");

        System.out.println("Matemática Discreta: " + matematicaDiscreta);
        System.out.println("Matemática: " + matematica);


        return args -> {
            Avaliacao avaliacao1 = new Avaliacao(
                    matematicaDiscreta,
                    "Frequência",
                    5,
                    "Vai ser fdd",
                    "2021-05-05"
            );
            Avaliacao avaliacao2 = new Avaliacao(
                    matematica,
                    "Frequência",
                    2,
                    "Vai ser ez",
                    "2021-05-07"
            );

            System.out.println("Avaliação 1 - Disciplina: " + avaliacao1.getDisciplina());
            System.out.println("Avaliação 2 - Disciplina: " + avaliacao2.getDisciplina());

            avaliacaoRepository.saveAll(
                    List.of(avaliacao1, avaliacao2)
            );
        };
    }
}
