package com.example.springbootpractice.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootpractice.entity.order;
import com.example.springbootpractice.entity.userentity;
import com.example.springbootpractice.repository.userrepository;
import com.example.springbootpractice.service.userservice;

@Service
public class userserviceimpl implements userservice {

	@Autowired
	public userrepository userRepo;
	
	@Override
	public userentity saveuser(userentity user) {
		userentity saved=userRepo.save(user);
		return saved;
	}
	@Override
	public Optional<userentity>  getUser(int id) {
		Optional<userentity>  userr=userRepo.findById(id);
		return userr;
	}
	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	
	}
	
	
}
