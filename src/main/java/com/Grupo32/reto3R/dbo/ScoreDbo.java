package com.Grupo32.reto3R.dbo;

import com.Grupo32.reto3R.model.ReservationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDbo {
    private  int idScore;
    private Float value;
    private ReservationModel reservation;
}
