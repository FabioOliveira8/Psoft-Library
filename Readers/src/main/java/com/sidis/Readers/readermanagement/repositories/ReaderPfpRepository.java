package com.sidis.Readers.readermanagement.repositories;

import com.sidis.Readers.readermanagement.model.ReaderPfp;

public interface ReaderPfpRepository {
    ReaderPfp save(ReaderPfp obj);

    ReaderPfp getByReaderNumber(final String readerNumber);
}
