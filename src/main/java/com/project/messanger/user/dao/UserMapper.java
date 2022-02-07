package com.project.messanger.user.dao;

import com.project.messanger.user.model.Group;
import com.project.messanger.user.model.Promise;
import com.project.messanger.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    public User getUser(int id);

    List<Group> getGroupes(int idx);

    List<Promise> getPromise(int idx);
}
