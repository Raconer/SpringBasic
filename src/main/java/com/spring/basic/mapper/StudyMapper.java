package com.spring.basic.mapper;

import java.util.List;

import com.spring.basic.model.Study;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudyMapper {
    @Select("SELECT * FROM list")
    List<Study> findAll();
}