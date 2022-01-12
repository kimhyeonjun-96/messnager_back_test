package com.project.messanger.main.controller;


import com.project.messanger.main.model.Group;
import com.project.messanger.main.model.Promise;
import com.project.messanger.main.model.User;
import com.project.messanger.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    UserService userService;

    // Test
    @GetMapping("")
    public List<User> getAllUsers(){
        List<User> userList = userService.getAllUsers();

        return userList;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){

        return userService.getUser(id);
    }

    @GetMapping("/{idx}")
    public List<Group> getGroup(@PathVariable int idx){
        System.out.println("idx : " + idx);
        List<Group> userGroupList = userService.getGroupes(idx);

        return userGroupList;
    }

    @GetMapping("/{idx}")
    public List<Promise> getPromise(@PathVariable int idx){
        System.out.println("idx : " + idx);

        List<Promise> userPromise = userService.getPromise(idx);

        return userPromise;
    }



}
