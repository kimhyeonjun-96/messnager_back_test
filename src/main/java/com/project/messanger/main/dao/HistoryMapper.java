package com.project.messanger.main.dao;

import com.project.messanger.main.model.Promise;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryMapper {

    List<Promise> getPromiseHistory();
}
