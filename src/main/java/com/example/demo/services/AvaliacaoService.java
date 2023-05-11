package com.example.demo.services;

import com.example.demo.dao.Avaliacao;
import com.example.demo.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AvaliacaoService {

    private final AvaliacaoRepository avaliacaoRepository;

    @Autowired
    public AvaliacaoService(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacaoRepository.findAll();
    }
}
