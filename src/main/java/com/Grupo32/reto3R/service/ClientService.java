package com.Grupo32.reto3R.service;



import com.Grupo32.reto3R.model.ClientModel;
import com.Grupo32.reto3R.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){  return clientRepository.findAll();    }

    public void crear(ClientModel client){  clientRepository.save(client);    }



}
