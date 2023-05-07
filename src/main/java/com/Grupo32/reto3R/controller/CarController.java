package com.Grupo32.reto3R.controller;


import com.Grupo32.reto3R.model.CarModel;
import com.Grupo32.reto3R.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarModel> obtenerCarros(){    return carService.obtener();    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crearCarros(@RequestBody CarModel car){
        carService.crear(car);

    }

}
