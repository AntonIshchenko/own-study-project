package com.epam.crm.service;

import com.epam.crm.dao.TaskRepository;
import com.epam.crm.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

  private final TaskRepository taskRepository;

  @Autowired
  public TaskServiceImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Task addTask(Task task) {
    return null;
  }

  @Override
  public Task deleteTask(int taskId) {
    return null;
  }
}
