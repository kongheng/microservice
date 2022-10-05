package com.kongheng.userservice.controller;

import com.kongheng.userservice.VO.ResponseTemplateVO;
import com.kongheng.userservice.entity.User;
import com.kongheng.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/")
  public User saveUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping("/{userId}")
  public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId) {
    return userService.getUserWithDepartment(userId);
  }
}
