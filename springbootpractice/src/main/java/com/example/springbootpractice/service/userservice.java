package com.example.springbootpractice.service;



import java.util.Optional;

import com.example.springbootpractice.entity.order;
import com.example.springbootpractice.entity.userentity;


public interface userservice {
public userentity saveuser(userentity user);
public Optional<userentity> getUser(int id);
public void deleteuser(int id);


}
