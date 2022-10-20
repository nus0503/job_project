package com.example.demo.dao;

import com.example.demo.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface DeptDao {
    public List<Dept> selectList();
}
