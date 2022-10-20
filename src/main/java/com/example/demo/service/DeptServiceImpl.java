package com.example.demo.service;

import com.example.demo.dao.DeptDao;
import com.example.demo.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl{

    @Autowired
    private DeptDao deptDao;


    public List<Dept> getSelectList() {
        return deptDao.selectList();
    }

}
