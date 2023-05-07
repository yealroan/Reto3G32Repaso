package com.Grupo32.reto3R.controller;


import com.Grupo32.reto3R.model.GamaModel;
import com.Grupo32.reto3R.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GammaController {

    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtener(){ return gamaService.obtener();    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody GamaModel gamma){  gamaService.crear(gamma);   }

}
