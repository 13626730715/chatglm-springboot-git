package com.example.chatglmspringboot.controller;

import com.example.chatglmspringboot.entity.chatglmQos;
import com.example.chatglmspringboot.service.qosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/qos")
public class qosController {
    @Autowired
    qosService qosService;
    @RequestMapping(value = "/insertQos", method = RequestMethod.POST)
    public String insertQos(@RequestBody chatglmQos chatglmQos)
    {
        int rows=qosService.insertQOS(chatglmQos);
        if(rows>0)
        {
            return "OK";
        }
        return "FAIL";
    }


}
