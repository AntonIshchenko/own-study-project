package com.epam.crm.entity;

import com.epam.crm.enums.Subscription;
import com.epam.crm.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private int id;
  private UserRole userRole;
  private String email;
  private String phoneNumber;
  private String password;
  private Subscription subscription;

}
