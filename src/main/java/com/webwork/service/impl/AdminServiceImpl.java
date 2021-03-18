package com.webwork.service.impl;

import com.webwork.dao.AdminDao;
import com.webwork.entity.Admin;
import com.webwork.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin findByUsername(String username) {

        return adminDao.findByUsername(username);

    }

    @Override
    public Admin findByUsernameAndPassword(String username, String password) {
        return adminDao.findByUsernameAndPassword(username,password);
    }
}
