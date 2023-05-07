package com.Grupo32.reto3R.service;



import com.Grupo32.reto3R.model.GamaModel;
import com.Grupo32.reto3R.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener(){  return gamaRepository.findAll();   }

    public void crear(GamaModel gama){  gamaRepository.save(gama);    }



}
