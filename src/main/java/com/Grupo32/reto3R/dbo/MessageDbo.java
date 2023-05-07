package com.Grupo32.reto3R.dbo;

import com.Grupo32.reto3R.model.CarModel;
import com.Grupo32.reto3R.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDbo {
    private  int idMessage;
    private String messageText;
    private CarModel car;
    private ClientModel client;
}
