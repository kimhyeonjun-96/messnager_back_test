package com.project.messanger.test.serviceimpl;

import com.project.messanger.test.Model.TestUser;
import com.project.messanger.test.dao.MariadbTestDao;
import com.project.messanger.test.dao.TestDao;
import com.project.messanger.test.daoimpl.MariadbTestDaoImpl;
import com.project.messanger.test.service.MariadbTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MariadbTestServiceImpl implements MariadbTestService {

    private MariadbTestDao dao;

//    public MariadbTestServiceImpl(MariadbTestDaoImpl dao) {
//        this.dao = dao;
//    }

    @Override
    public List<TestUser> getAllUsers() {
        final List<TestUser> userList = dao.getAllUsers();

        return userList;
    }
}
