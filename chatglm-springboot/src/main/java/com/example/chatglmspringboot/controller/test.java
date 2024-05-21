package com.example.chatglmspringboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.chatglmspringboot.common.netUtil;
@RestController
@CrossOrigin
public class test {

    @RequestMapping(value = "/getConnnum", method = RequestMethod.GET)
    String getConnnum(){
        netUtil netUtil=new netUtil();
        String result=netUtil.getConnnum("http://127.0.0.1:5000/getConnnum");//与python端flask交互
        if(Integer.valueOf(result)<1)
        {
            return "OK";
        }
        else{
            return "NO";
        }
        //return "Hello " + userName;
    }

    }


