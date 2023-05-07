package com.Grupo32.reto3R.service;


import com.Grupo32.reto3R.model.CarModel;
import com.Grupo32.reto3R.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){  return carRepository.findAll(); }

    public void crear(CarModel car){  carRepository.save(car);    }



}
