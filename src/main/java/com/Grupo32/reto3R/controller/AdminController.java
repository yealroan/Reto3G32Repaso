package com.Grupo32.reto3R.controller;

import com.Grupo32.reto3R.dbo.AdminDbo;
import com.Grupo32.reto3R.model.AdminModel;
import com.Grupo32.reto3R.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> obtenerAdministradores(){
        return adminService.obtenerAdministradores();
    }

    //Todo: solucionar error
    @PostMapping("/save")
    public String crearAdministradores(@RequestBody AdminDbo admin){
    //  return adminService.crearAdministradores(admin);
        return null;

    }

}
