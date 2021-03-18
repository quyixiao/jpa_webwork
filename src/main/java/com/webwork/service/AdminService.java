package com.webwork.service;

import com.webwork.entity.Admin;

public interface AdminService {

    Admin findByUsername(String username);

    Admin findByUsernameAndPassword(String username,String password);
}
