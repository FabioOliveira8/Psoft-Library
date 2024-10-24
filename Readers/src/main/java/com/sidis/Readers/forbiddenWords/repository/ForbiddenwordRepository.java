package com.sidis.Readers.forbiddenWords.repository;

import com.sidis.Readers.forbiddenWords.model.Forbiddenword;

public interface ForbiddenwordRepository {
    Forbiddenword save(Forbiddenword f);
    int findForbiddenword(String fw);

    boolean isForbiddenword(String name);
}
