package com.epam.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Task {

  private int id;
  private String name;
  private String userEmail;
  private String description;
}
