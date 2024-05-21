package com.example.chatglmspringboot.mapper;

import com.example.chatglmspringboot.entity.chatglmQos;

import java.util.List;

import com.example.chatglmspringboot.entity.chatglmQosExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component
public interface chatglmQosMapper {
    int countByExample(chatglmQosExample example);

    int deleteByExample(chatglmQosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(chatglmQos record);

    int insertSelective(chatglmQos record);

    List<chatglmQos> selectByExample(chatglmQosExample example);

    chatglmQos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") chatglmQos record, @Param("example") chatglmQosExample example);

    int updateByExample(@Param("record") chatglmQos record, @Param("example") chatglmQosExample example);

    int updateByPrimaryKeySelective(chatglmQos record);

    int updateByPrimaryKey(chatglmQos record);
}