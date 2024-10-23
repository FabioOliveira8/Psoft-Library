package com.sidis.Users.forbiddenWords.repository;

import com.sidis.Users.forbiddenWords.model.Forbiddenword;

public interface ForbiddenwordRepository {
    Forbiddenword save(Forbiddenword f);
    int findForbiddenword(String fw);

    boolean isForbiddenword(String name);
}
