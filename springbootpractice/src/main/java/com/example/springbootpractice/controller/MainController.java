package com.example.springbootpractice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootpractice.entity.order;
import com.example.springbootpractice.entity.userentity;
import com.example.springbootpractice.service.orderservice;
import com.example.springbootpractice.service.userservice;


@RestController
public class MainController {

	@Autowired
	public userservice userServ;
	@Autowired
	public orderservice orderServ;
	
	@RequestMapping("/")
	public String show() {
		return "home";
	}
	//we can also return string instad of jsp file via response body
	
	@RequestMapping("/yo")
	@ResponseBody
	public String showa() {
		return "this is nothing";
	}

	@PostMapping("/saved")
	public String saveuser(@RequestBody userentity user) {
		userServ.saveuser(user);
		return "done";
	}
	@GetMapping("/User/{id}")
	public ResponseEntity<Optional<userentity>> getUser(@PathVariable int id){
		Optional<userentity> user=userServ.getUser(id);
		return new ResponseEntity<Optional<userentity>>(user,HttpStatus.OK);
	}
	@GetMapping("/order/{id}")
	public ResponseEntity<Optional<order>> getorder(@PathVariable int id){
		Optional<order> user=orderServ.getorder(id);
		return new ResponseEntity<Optional<order>>(user,HttpStatus.OK);
	}
	@PostMapping("/order")
	public String saveorder(@RequestBody order order) {
		orderServ.saveorder(order);
		return "done";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteuser(@PathVariable int id) {
		userServ.deleteuser(id);
		return "done";
	}
	
}
