package com.sidis.Readers.readermanagement.model;

import com.sidis.Readers.genre.model.Genre;
import com.sidis.Readers.genre.repository.GenreRepository;

import java.util.Optional;
import java.util.Set;

public class InterestList {

    public boolean validate(final Set<String> interestList, final GenreRepository genreRepo)
    {
        //its not required
        if(interestList.isEmpty())
        {
            return true;
        }

        for (String s : interestList) {
            Optional<Genre> g1 = genreRepo.getByGenreNameForValidation(s);
            if (g1.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
