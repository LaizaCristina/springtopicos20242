package br.gov.sp.fatec.springtopicos20242.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20242.entity.Alerta;
import br.gov.sp.fatec.springtopicos20242.repository.AlertaRepository;

@Service
public class AlertaServiceImplement implements AlertaService {
    @Autowired
    private AlertaRepository alertaRepo;

    @Override
    public Alerta novoAlerta(Alerta alerta) {
        if (alerta.getDataGeracao() == null) {
            alerta.setDataGeracao(LocalDateTime.now());
        }

        if (alerta.getNivel() == null) {
            alerta.setNivel(5);
        }
        return alertaRepo.save(alerta);
    }

    @Override
    public List<Alerta> buscarTodos() {
        return alertaRepo.findAll();
    }

    @Override
    public List<Alerta> burcarAlertaDataNivel(LocalDateTime dataGeracao, int nivel) {
        return alertaRepo.buscarAlerta(dataGeracao, nivel);
    }

}
