package br.gov.sp.fatec.springtopicos20242.service;

import java.time.LocalDateTime;
import java.util.List;

import br.gov.sp.fatec.springtopicos20242.entity.Alerta;

public interface AlertaService {
    public Alerta novoAlerta(Alerta alerta);

    public List<Alerta> buscarTodos();

    public List<Alerta> burcarAlertaDataNivel (LocalDateTime dataGeracao, int nivel);
}
