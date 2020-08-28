package com.brave.solid.controller;

import com.brave.solid.common.ActionResult;
import com.brave.solid.domain.entity.User;
import com.brave.solid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/userAll")
    public ActionResult getUserAll(){
        List<User> name = userService.getUserAll();
        return ActionResult.success("查询成功",name);
    }

    @GetMapping("/nosql")
    public ActionResult testNoSql(){
        return ActionResult.success("不查数据，直接调用成功",null);
    }

}
