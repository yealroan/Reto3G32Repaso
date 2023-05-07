package com.Grupo32.reto3R.controller;

import com.Grupo32.reto3R.dbo.ReservationDbo;
import com.Grupo32.reto3R.dbo.ScoreDbo;
import com.Grupo32.reto3R.model.MessageModel;
import com.Grupo32.reto3R.model.ScoreModel;
import com.Grupo32.reto3R.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> obtener(){
        return scoreService.obtener();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ScoreModel score){
        scoreService.crear(score);

    }

}
