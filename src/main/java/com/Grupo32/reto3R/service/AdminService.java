package com.Grupo32.reto3R.service;

import com.Grupo32.reto3R.model.AdminModel;
import com.Grupo32.reto3R.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;


    public List<AdminModel> obtenerAdministradores(){
        return adminRepository.findAll();

    }
    public String crearAdministradores(AdminModel adminModel){
        adminRepository.save(adminModel);
        return "se creo el usuario";

    }

}
