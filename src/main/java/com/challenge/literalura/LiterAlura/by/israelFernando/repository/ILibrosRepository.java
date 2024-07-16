package com.challenge.literalura.LiterAlura.by.israelFernando.repository;

import com.challenge.literalura.LiterAlura.by.israelFernando.modelos.Idioma;
import com.challenge.literalura.LiterAlura.by.israelFernando.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ILibrosRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findByTituloIgnoreCase(String titulo);

    List<Libro> findByIdioma(Idioma idioma);

}
