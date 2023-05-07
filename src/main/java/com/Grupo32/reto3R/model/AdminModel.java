package com.Grupo32.reto3R.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private  int idAdmin;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    private byte age;
}
