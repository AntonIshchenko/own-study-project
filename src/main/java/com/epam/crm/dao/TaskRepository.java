package com.epam.crm.dao;

import com.epam.crm.entity.Task;
import com.epam.crm.enums.TaskPriority;

public interface TaskRepository {

  Task saveTask(Task task);

  Task findTaskById(int id);

  TaskPriority getTaskPriority(int id);

  void setTaskPriority(int id, TaskPriority priority);

}
