package com.epam.crm.dao;

import com.epam.crm.entity.User;

public interface UserRepository {

  User saveUser(User user);

  User findUserByEmail(String email);

  void subscribe();
}
