package br.gov.sp.fatec.springtopicos20242.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20242.entity.Alerta;
import br.gov.sp.fatec.springtopicos20242.service.AlertaServiceImplement;

@RestController
@CrossOrigin
@RequestMapping(value = "/alerta")

public class AlertaController {
    @Autowired
    private AlertaServiceImplement service;

    @GetMapping(value = "listar")
    public List<Alerta> buscarAlertas() {
        return service.buscarTodos();
    }

    @PostMapping
    public Alerta novoAlerta(@RequestBody Alerta alerta) {
        return service.novoAlerta(alerta);
    }

    @GetMapping("/buscar")
    public List<Alerta> buscarAlertaDataNivel(
            @RequestParam("dataGeracao") LocalDateTime dataGeracao,
            @RequestParam("nivel") Integer nivel) {
        return service.burcarAlertaDataNivel(dataGeracao, nivel);
    }
}
