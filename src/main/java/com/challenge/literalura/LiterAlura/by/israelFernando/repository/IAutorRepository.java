package com.challenge.literalura.LiterAlura.by.israelFernando.repository;

import com.challenge.literalura.LiterAlura.by.israelFernando.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IAutorRepository extends JpaRepository<Autor, Long> {

    Optional<Autor> findByNombreIgnoreCase(String nombre);

    //determinar que autores estan viso en determinaod año
    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento <= :anio AND a.fechaMuerte >= :anio")
    List<Autor> autoresVivosEnUnDeterminadoAnio(@Param("anio") Integer anio);
}
