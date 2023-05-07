package com.Grupo32.reto3R.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDbo {
    private  int idClient;
    private String name;
    private String email;
    private String password;
    private byte age;

}
