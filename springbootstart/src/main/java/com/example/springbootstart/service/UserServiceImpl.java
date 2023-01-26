package com.example.springbootstart.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springbootstart.entity.User;
import com.example.springbootstart.exception.UserAlreadyExistsException;
import com.example.springbootstart.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
       
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User saveUser(User user) throws UserAlreadyExistsException {
		// TODO Auto-generated method stub
		if(userRepo.existsById(user.getId())) {
			throw new UserAlreadyExistsException();
		}
		else {
			User savedUser=userRepo.save(user);
		return savedUser;
		}
	}
	
	@Override
	public List<User> getAllUsers(){
		List<User> list=userRepo.findAll();
		return list;
	}
	
	@Override
	public Optional<User> getUserbyid(int id) {
		Optional<User> user = userRepo.findById(id);
		return user;
	}
	@Override
	 public void deleteUserById(int id)
	    {
	        userRepo.deleteById(id);
	    }
	@Override
	 public User updateUser(User user,int id)
	    {
		User userpresent=userRepo.getById(id);
		if(Objects.nonNull(user.getAge())&& user.getAge()!=0){
			userpresent.setAge(user.getAge());
		}
		if(Objects.nonNull(user.getFirstname())&&user.getFirstname()!=""){
			userpresent.setFirstname(user.getFirstname());
		}
	      User updatedUser= userRepo.save(userpresent);
	      return updatedUser;
	    }
	
	@Override
	public List<User> getUserbyname(String firstname){
		List<User> usernames=userRepo.findByFirstName(firstname);
		return usernames;
	}
	
}
