package com.example.springbootstart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootstart.entity.User;
import com.example.springbootstart.exception.UserAlreadyExistsException;
import com.example.springbootstart.service.UserService;

//TO TERINATE PORT : open cmd-> netstat -ano | findstr :8080-> taskkill /PID 26168 /F          (26168 is shown there)

@RestController
public class UserController {

@Autowired
private UserService userServ;
	
	//@RequestMapping(method=RequestMethod.Post)
	@PostMapping("/User")
	public ResponseEntity<String> saveUser(@RequestBody User user) throws UserAlreadyExistsException {
		User savedUser=userServ.saveUser(user);
		return new ResponseEntity<String>("user is saved successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/Users")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> list=userServ.getAllUsers();
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/User/{id}")
	public ResponseEntity<Optional<User>> getUserbyid(@PathVariable int id){
		Optional<User> user=userServ.getUserbyid(id);
		return new ResponseEntity<Optional<User>>(user,HttpStatus.OK);
	}
	
	@PutMapping("/User/{id}")
	public String updateUser(@RequestBody User user, @PathVariable int id) {
		User updatedUser =userServ.updateUser(user, id);
		return "updated successfully";
	}
	
	
	@DeleteMapping("/Userdlt/{id}")
    public String deleteUserById(@PathVariable int id)
    {
        userServ.deleteUserById(id);
        return "Deleted Successfully";
    }
	
	
	@GetMapping("/Userr/{firstname}")
	public ResponseEntity<List<User>> getUserbyname(@PathVariable String firstname){
		List<User> usernames=userServ.getUserbyname(firstname);
		return new ResponseEntity<List<User>>(usernames,HttpStatus.OK);
	}
}

//request(json) -> map json with entity class object
// request-> controller->service->repository->response->service->controller->request done