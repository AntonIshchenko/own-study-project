package com.epam.crm.service;

import com.epam.crm.entity.User;
import com.epam.crm.enums.UserRole;

public class UserServiceImpl implements UserService {

  @Override
  public User addUser(User user) {
    return null;
  }

  @Override
  public User deleteUser(String email) {
    return null;
  }

  @Override
  public boolean checkSubscription(String email) {
    return false;
  }

  @Override
  public void setRole(String email, UserRole role) {

  }
}
