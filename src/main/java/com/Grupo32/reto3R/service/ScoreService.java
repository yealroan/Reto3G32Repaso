package com.Grupo32.reto3R.service;



import com.Grupo32.reto3R.model.ScoreModel;
import com.Grupo32.reto3R.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> obtener(){  return scoreRepository.findAll();   }

    public void crear(ScoreModel  score){  scoreRepository.save(score);    }



}
