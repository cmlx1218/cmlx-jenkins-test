package com.cmlx.jenkins.cmlxjenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cmlx
 * @Date 2019-6-28 0028 16:56
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/getUserInfo")
    public String getUserInfo(){

        return "我是赤名莉香";

    }


}
