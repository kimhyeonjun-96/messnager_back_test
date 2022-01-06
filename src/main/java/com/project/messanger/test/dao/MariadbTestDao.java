package com.project.messanger.test.dao;

import com.project.messanger.test.Model.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface MariadbTestDao {

    @Select("SELECT * FROM users")
    public List<TestUser> getAllUsers();
}
