package com.example.springbootstart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springbootstart.entity.User;
import com.example.springbootstart.exception.UserAlreadyExistsException;

public interface UserService {
	
  public User saveUser(User user) throws UserAlreadyExistsException;
public List<User> getAllUsers();
public Optional<User> getUserbyid(int id);


public void deleteUserById(int id);
	 public User updateUser(User user, int id);
	 
	 public List<User> getUserbyname(String firstname);
}
