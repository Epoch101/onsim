package pers.rong.onism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    /**
     * 测试实体校验
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user) {
        return user.toString();
    }

}
