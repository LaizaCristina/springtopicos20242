package br.gov.sp.fatec.springtopicos20242.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.springtopicos20242.entity.Alerta;

public interface AlertaRepository extends JpaRepository<Alerta, Long>{
    @Query("SELECT a FROM Alerta a WHERE a.dataGeracao > :dataGeracao AND a.nivel < :nivel")
    List<Alerta> buscarAlerta(
        @Param("dataGeracao") LocalDateTime dataGeracao, 
        @Param("nivel") int nivel);
}
