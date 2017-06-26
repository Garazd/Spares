package com.spares.service;

import com.spares.entity.Spare;
import java.util.List;

public interface SpareService {

    Spare create(Spare spare);

    Spare update(Spare spare);

    void delete(Long id);

    Spare getById(Long id);

    List<Spare> getAll();
}
