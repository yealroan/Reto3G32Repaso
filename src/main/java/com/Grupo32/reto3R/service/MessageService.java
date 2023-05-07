package com.Grupo32.reto3R.service;




import com.Grupo32.reto3R.model.MessageModel;
import com.Grupo32.reto3R.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> obtener(){  return messageRepository.findAll();   }

    public void crear(MessageModel messaje){  messageRepository.save(messaje);    }



}
