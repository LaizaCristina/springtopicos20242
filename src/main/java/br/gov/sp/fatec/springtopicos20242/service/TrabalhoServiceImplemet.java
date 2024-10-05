package br.gov.sp.fatec.springtopicos20242.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20242.repository.TrabalhoRepository;

@Service
public class TrabalhoServiceImplemet implements TrabalhoService {
    @Autowired
    private TrabalhoRepository trabalhoRepo;


    public Trabalho novoTrabalho(Trabalho trabalho) {
        if (trabalho == null ||
                trabalho.getTitulo() == null ||
                trabalho.getGrupo() == null) {
            throw new IllegalArgumentException("Título e Grupo inválidos");
        }

        if (trabalho.getEntrega() == null) {
            trabalho.setEntrega(LocalDateTime.now());
        }
        return trabalhoRepo.save(trabalho);
    }

    public List<Trabalho> buscarTodos() {
        return trabalhoRepo.findAll();
    }

    public List<Trabalho> buscarTrabalhoNotaTitulo(String palavra, Integer nota) {
        return trabalhoRepo.buscarTrabalho(palavra, nota);
    }
}
