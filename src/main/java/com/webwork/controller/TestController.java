package com.webwork.controller;

import com.webwork.entity.Admin;
import com.webwork.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: djc
 * @Desc:
 * @Date: 2021/1/26 10:48
 */
@RestController
public class TestController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/test")
    @ResponseBody
    public int loginUser(HttpServletRequest request){
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        Admin byUsername = adminService.findByUsername(name);
        Admin byUsernameAndPassword = adminService.findByUsernameAndPassword(name, pwd);
        return 1;


    }

}
