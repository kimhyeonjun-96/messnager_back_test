package com.project.messanger.main.service;

import com.project.messanger.main.dao.HistoryMapper;
import com.project.messanger.main.model.Promise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    HistoryMapper historyMapper;

    public List<Promise> getPromiseHistory(){

        return historyMapper.getPromiseHistory();
    }

}
