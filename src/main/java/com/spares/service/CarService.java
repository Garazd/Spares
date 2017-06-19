package com.spares.service;

import com.spares.entity.Car;
import java.util.List;

public interface CarService {

    Car create(Car car);

    Car update(Car car);

    void delete(Long id);

    Car getById(Long id);

    List<Car> getAll();
}
