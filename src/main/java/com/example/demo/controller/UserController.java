package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import com.example.demo.service.UserConsumerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    private UserConsumerService userConsumerService;

    public UserController(UserConsumerService userConsumerService) {
        this.userConsumerService = userConsumerService;
    }

    @GetMapping("/")
    public String getHome(){
        return "redirect:/home.html";
    }

    @ResponseBody
    @GetMapping("/users")
    public User[] getUsers() {
        return userConsumerService.getUsers();
    }

    @ResponseBody
    @GetMapping("/users/{id}/posts")
    public Post[] getPostsByUser(@PathVariable int id) {
        return userConsumerService.getPostsByUser(id);
    }
}