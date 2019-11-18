package com.epam.crm.dao;

import com.epam.crm.entity.Task;
import com.epam.crm.enums.TaskPriority;

public class JdbcTaskRepository implements TaskRepository {

  @Override
  public Task saveTask(Task task) {
    return null;
  }

  @Override
  public Task findTaskById(int id) {
    return null;
  }

  @Override
  public TaskPriority getTaskPriority(int id) {
    return null;
  }

  @Override
  public void setTaskPriority(int id, TaskPriority priority) {

  }
}
