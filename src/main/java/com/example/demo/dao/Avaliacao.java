package com.example.demo.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Avaliacao {

    @Id
    @SequenceGenerator(
            name = "avaliacao_sequence",
            sequenceName = "avaliacao_sequence",
            allocationSize = 1 // increment by 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "avaliacao_sequence"
    )
    private Long id;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;
    private String tipoAvaliacao;
    private Integer nivelDeDificuldade;
    private String observacoes;
    private String dataDaAvaliacao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao", nullable = false, updatable = false)
    private Date dataCriacao;

    @PrePersist
    protected void onCreate() {
        dataCriacao = new Date();
    }

    public Avaliacao() {
    }

    public Avaliacao(Long id, Disciplina disciplina, String tipoAvaliacao, Integer nivelDeDificuldade, String observacoes, String dataDaAvaliacao) {
        this.id = id;
        this.disciplina = disciplina;
        this.tipoAvaliacao = tipoAvaliacao;
        this.nivelDeDificuldade = nivelDeDificuldade;
        this.observacoes = observacoes;
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public Avaliacao(Disciplina disciplina, String tipoAvaliacao, Integer nivelDeDificuldade, String observacoes, String dataDaAvaliacao) {
        this.disciplina = disciplina;
        this.tipoAvaliacao = tipoAvaliacao;
        this.nivelDeDificuldade = nivelDeDificuldade;
        this.observacoes = observacoes;
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }

    public Integer getNivelDeDificuldade() {
        return nivelDeDificuldade;
    }

    public void setNivelDeDificuldade(Integer nivelDeDificuldade) {
        this.nivelDeDificuldade = nivelDeDificuldade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(String dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", disciplina='" + disciplina + '\'' +
                ", tipoAvaliacao='" + tipoAvaliacao + '\'' +
                ", nivelDeDificuldade=" + nivelDeDificuldade +
                ", observacoes='" + observacoes + '\'' +
                ", dataDaAvaliacao=" + dataDaAvaliacao +
                ", dataCriacao=" + dataCriacao +
                '}';
    }
}
