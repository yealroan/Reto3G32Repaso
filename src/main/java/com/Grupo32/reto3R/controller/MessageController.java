package com.Grupo32.reto3R.controller;


import com.Grupo32.reto3R.model.MessageModel;
import com.Grupo32.reto3R.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> obtener(){   return messageService.obtener();    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody MessageModel Message){  messageService.crear(Message);    }

}
