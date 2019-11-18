package com.epam.crm.service;

import com.epam.crm.entity.User;
import com.epam.crm.enums.UserRole;

public interface UserService {

  User addUser(User user);
  User deleteUser(String email);
  boolean checkSubscription(String email);
  void setRole(String email, UserRole role);

}
