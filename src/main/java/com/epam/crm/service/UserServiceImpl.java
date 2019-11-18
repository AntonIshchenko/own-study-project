package com.epam.crm.service;

import com.epam.crm.dao.UserRepository;
import com.epam.crm.entity.User;
import com.epam.crm.enums.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

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
