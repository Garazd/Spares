package com.spares.service;

import com.spares.entity.Car;
import com.spares.repository.CarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public Car create(Car car) {
        return carRepository.saveAndFlush(car);
    }

    @Override
    public Car update(Car car) {
        return carRepository.saveAndFlush(car);
    }

    @Override
    public void delete(Long id) {
        carRepository.delete(id);
    }

    @Override
    public Car getById(Long id) {
        return carRepository.findOne(id);
    }

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
