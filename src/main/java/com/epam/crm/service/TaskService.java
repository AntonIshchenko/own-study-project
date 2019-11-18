package com.epam.crm.service;

import com.epam.crm.entity.Task;

public interface TaskService {

  Task addTask(Task task);

  Task deleteTask(int taskId);

}
