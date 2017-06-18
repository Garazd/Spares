package com.spares.service;

import com.spares.entity.Spares;
import com.spares.repository.SparesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class SparesServiceImpl implements SparesService {

    @Autowired
    SparesRepository sparesRepository;

    @Override
    public Spares create(Spares spares) {
        return sparesRepository.saveAndFlush(spares);
    }

    @Override
    public Spares update(Spares spares) {
        return sparesRepository.saveAndFlush(spares);
    }

    @Override
    public void delete(Long id) {
        sparesRepository.delete(id);
    }

    @Override
    public Spares getById(Long id) {
        return sparesRepository.findOne(id);
    }

    @Override
    public List<Spares> getAll() {
        return sparesRepository.findAll();
    }
}
