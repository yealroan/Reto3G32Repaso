package com.Grupo32.reto3R.dbo;

import com.Grupo32.reto3R.model.GamaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDbo {
    private  int idCar;
    private String name;
    private String brand;
    private String year;
    private String description;
    private GamaModel gama;
}
