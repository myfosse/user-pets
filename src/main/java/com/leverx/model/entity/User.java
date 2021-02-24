package com.leverx.model.entity;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author Andrei Yahorau */
@Entity
@Table(name = "users",
        uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
@Data
@Builder(builderMethodName = "userBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String firstName;

  private String lastName;

  private String email;

  private LocalDate birthdate;

  private String password;

  @OneToMany(mappedBy = "owner")
  private List<Pet> pets;

  @Enumerated(value = STRING)
  private ERole role;
}