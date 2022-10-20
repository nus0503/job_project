package com.example.demo.controller;

import com.example.demo.dao.DeptDao;
import com.example.demo.model.Dept;
import com.example.demo.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptServiceImpl service;

    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = service.getSelectList();
        return list;
    }


}
