package com.example.chatglmspringboot.service;


import com.example.chatglmspringboot.entity.chatglmQos;
import com.example.chatglmspringboot.mapper.chatglmQosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class qosService {
    @Resource
    chatglmQosMapper chatglmQosMapper;
    public int insertQOS(chatglmQos chatglmQos)
    {
        System.out.println(chatglmQos.getAnswer());
        return chatglmQosMapper.insert(chatglmQos);
    }



}
