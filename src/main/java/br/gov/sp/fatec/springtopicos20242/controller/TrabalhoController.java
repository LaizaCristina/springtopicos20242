package br.gov.sp.fatec.springtopicos20242.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20242.service.TrabalhoServiceImplemet;
import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;



@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")

public class TrabalhoController {
    @Autowired
    private TrabalhoServiceImplemet service;

    @GetMapping(value="listar")
    public List<Trabalho> buscarTodos (){
        return service.buscarTodos();
    }

    @PostMapping
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho){
        return service.novoTrabalho(trabalho);
    }

    @GetMapping(value = "buscar")
    public List<Trabalho> buscarTrabalhoNotaTitulo(@RequestParam("palavra") String palavra, @RequestParam("nota") Integer nota){
        return service.buscarTrabalhoNotaTitulo(palavra, nota);
    }

}
