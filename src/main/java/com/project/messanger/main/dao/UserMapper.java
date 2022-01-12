package com.project.messanger.main.dao;

import com.project.messanger.main.model.Group;
import com.project.messanger.main.model.Promise;
import com.project.messanger.main.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    public User getUser(int id);

    List<Group> getGroupes(int idx);

    List<Promise> getPromise(int idx);
}
