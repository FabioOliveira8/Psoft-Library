package com.project.psoft.genre.repository;
import com.project.psoft.genre.model.Genre;
import org.springframework.cache.annotation.Cacheable;

import java.util.Optional;


public interface GenreRepository{

    Genre save(final Genre genre);
    Optional<Genre> findByGenreName(String genreName);

    default Genre getByGenreName(final String genreName) {
        final Optional<Genre> maybeGenre = findByGenreName(genreName);
        return maybeGenre.get();
    }


    default Optional<Genre> getByGenreNameForValidation(final String genreName) {
        final Optional<Genre> maybeGenre = findByGenreName(genreName);
        return maybeGenre;
    }
    Iterable<Genre> findAll();
}