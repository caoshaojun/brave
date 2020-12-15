package com.brave.solid.controller;

import com.brave.solid.common.ActionResult;
import com.brave.solid.domain.entity.HostIps;
import com.brave.solid.domain.entity.User;
import com.brave.solid.model.Student;
import com.brave.solid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    @GetMapping("/ttt")
    public ActionResult ttt(@RequestBody HostIps hostIps) {
        return ActionResult.success("不查数据，直接调用成功", null);
    }



}
