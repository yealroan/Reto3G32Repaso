package com.Grupo32.reto3R.service;



import com.Grupo32.reto3R.model.ReservationModel;
import com.Grupo32.reto3R.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> obtener(){  return reservationRepository.findAll();   }

    public void crear(ReservationModel  reservation){  reservationRepository.save(reservation);    }



}
