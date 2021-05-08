package com.brave.solid.controller;

import com.brave.solid.common.dto.ActionResult;
import com.brave.solid.domain.entity.HostIps;
import com.brave.solid.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

   /* @GetMapping("/get/userAll")
    public ActionResult getUserAll() {
        List<User> name = userService.getUserAll();
        return ActionResult.success("查询成功", name);
    }*/

    @GetMapping("/nosql")
    public ActionResult testNoSql() {
        return ActionResult.success("不查数据，直接调用成功", null);
    }


    @GetMapping("/param")
    public ActionResult testAopParamLog(@RequestParam String name, @RequestParam int age) {
        return ActionResult.success("success",name);
    }

    @GetMapping("/param1")
    public void testAopParamLog1(@RequestBody HostIps hostIps) {
        String name = "";
    }
}
