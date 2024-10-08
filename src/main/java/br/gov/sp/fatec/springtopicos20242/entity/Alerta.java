package br.gov.sp.fatec.springtopicos20242.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alt_alerta")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_id")
    private Long id;

    @Column(name = "alt_mensagem")
    private String mensagem;

    @Column(name = "alt_detalhe")
    private String detalhe;

    @Column(name = "alt_data_hora_geracao")
    private LocalDateTime dataGeracao;

    @Column(name = "alt_data_hora_verificacao")
    private LocalDateTime dataVerificacao;

    @Column(name = "alt_nivel")
    private Integer nivel;

public Alerta() {}

public Alerta(Long id, String mensagem, String detalhe, LocalDateTime dataGeracao, LocalDateTime dataVerificacao,
Integer nivel) {
this();
this.mensagem = mensagem;
this.detalhe = detalhe;
this.dataGeracao = dataGeracao;
this.dataVerificacao = dataVerificacao;
this.nivel = nivel;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getMensagem() {
    return mensagem;
}

public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
}

public String getDetalhe() {
    return detalhe;
}

public void setDetalhe(String detalhe) {
    this.detalhe = detalhe;
}

public LocalDateTime getDataGeracao() {
    return dataGeracao;
}

public void setDataGeracao(LocalDateTime dataGeracao) {
    this.dataGeracao = dataGeracao;
}

public LocalDateTime getDataVerificacao() {
    return dataVerificacao;
}

public void setDataVerificacao(LocalDateTime dataVerificacao) {
    this.dataVerificacao = dataVerificacao;
}

public Integer getNivel() {
    return nivel;
}

public void setNivel(Integer nivel) {
    this.nivel = nivel;
}


}
