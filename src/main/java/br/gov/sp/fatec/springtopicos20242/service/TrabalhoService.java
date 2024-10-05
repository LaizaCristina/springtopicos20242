package br.gov.sp.fatec.springtopicos20242.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;

public interface TrabalhoService {
    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarTodos();

    public List<Trabalho> buscarTrabalhoNotaTitulo(String palavra, Integer nota);
}
