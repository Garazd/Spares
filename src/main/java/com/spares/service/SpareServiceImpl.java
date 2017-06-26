package com.spares.service;

import com.spares.entity.Spare;
import com.spares.repository.SpareRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpareServiceImpl implements SpareService {

    @Autowired
    SpareRepository spareRepository;

    @Override
    public Spare create(Spare spare) {
        return spareRepository.saveAndFlush(spare);
    }

    @Override
    public Spare update(Spare spare) {
        return spareRepository.saveAndFlush(spare);
    }

    @Override
    public void delete(Long id) {
        spareRepository.delete(id);
    }

    @Override
    public Spare getById(Long id) {
        return spareRepository.findOne(id);
    }

    @Override
    public List<Spare> getAll() {
        return spareRepository.findAll();
    }
}
