package com.spares.service;

import com.spares.entity.Spares;
import java.util.List;

public interface SparesService {

    Spares create(Spares spares);

    Spares update(Spares spares);

    void delete(Long id);

    Spares getById(Long id);

    List<Spares> getAll();
}
