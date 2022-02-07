package com.project.messanger.user.service;

import com.project.messanger.user.dao.UserMapper;
import com.project.messanger.user.model.Group;
import com.project.messanger.user.model.Promise;
import com.project.messanger.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserMapper userMapper;

    public UserService(UserMapper mapper){

        this.userMapper = mapper;
    }

    public List<User> getAllUsers(){

        return userMapper.getAllUsers();
    }

    public User getUser(int id){

        return userMapper.getUser(id);
    }

    public List<Group> getGroupes(int idx) {

        return userMapper.getGroupes(idx);
    }

    public List<Promise> getPromise(int idx) {
        return userMapper.getPromise(idx);
    }
}
