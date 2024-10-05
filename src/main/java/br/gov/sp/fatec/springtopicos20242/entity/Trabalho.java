package br.gov.sp.fatec.springtopicos20242.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; //ESSE IMPORT EU TIVE QUE COLOCAR NA MÃO, PQ?
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tra_trabalho")
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tra_id")
    private Long id;

    @Column(name = "tra_titulo")
    private String titulo;

    @Column(name = "tra_data_hora_entrega")
    private LocalDateTime entrega;

    @Column(name = "tra_descricao")
    private String descricao;

    @Column(name = "tra_grupo")
    private String grupo;

    @Column(name = "tra_nota")
    private Integer nota;

    @Column(name = "tra_justificativa")
    private String justificativa;


public Trabalho() {}

public Trabalho(Long id, String titulo, LocalDateTime entrega, String descricao, String grupo, Integer nota, String justificativa) {
        this();
        this.titulo = titulo;
        this.entrega = entrega;
        this.descricao = descricao;
        this.grupo = grupo;
        this.nota = nota;
        this.justificativa = justificativa;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public LocalDateTime getEntrega() {
    return entrega;
}

public void setEntrega(LocalDateTime entrega) {
    this.entrega = entrega;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public String getGrupo() {
    return grupo;
}

public void setGrupo(String grupo) {
    this.grupo = grupo;
}

public Integer getNota() {
    return nota;
}

public void setNota(Integer nota) {
    this.nota = nota;
}

public String getJustificativa() {
    return justificativa;
}

public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
}
}



