package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.entity.Admin;
import com.mphasis.service.AdminService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminRestController {
    
    @Autowired
    AdminService adminService;
    Admin admin;
    
    @PostMapping("/adminLogin")
    public Admin adminLogin(@RequestBody Admin admin) {
        adminService.adminLogin(admin);
        return admin;
    }
}