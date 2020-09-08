package pers.rong.onism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import pers.rong.onism.common.lang.Result;
import pers.rong.onism.entity.User;
import pers.rong.onism.service.UserService;

/**
 * @author
 * @since 2020-09-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get")
    public Result get(){
        User byId = userService.getById(1L);
        return Result.success(byId);
    }
}
