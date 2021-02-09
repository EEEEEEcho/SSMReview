package com.echo.mapper;

import com.echo.pojo.Task;

import java.util.List;
import java.util.Map;

public interface TaskMapper {
    //插入一条任务
    int insertTask(Task task);
    //开始任务
    int startTask(Task task);
    //完成任务
    int finishTask(Task task);
    //分页查询任务
    List<Task> queryListByPage(Map<String,Object> map);
}
