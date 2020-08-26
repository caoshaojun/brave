package com.brave.solid.controller;

import com.brave.solid.common.ActionResult;
import com.brave.solid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aaa")
public class testController {

    @Autowired
    private UserService userService;

    @GetMapping("/testAction")
    public ActionResult testAction(@RequestParam Integer id){
        String name = userService.getNameById(id);
        return ActionResult.success("查询成功",name);
    }
}
