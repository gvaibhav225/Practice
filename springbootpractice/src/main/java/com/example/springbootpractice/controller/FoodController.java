package com.example.springbootpractice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootpractice.Exception.userdoesnotexistsexception;
import com.example.springbootpractice.Exception.userexistsexception;
import com.example.springbootpractice.entity.Food;
import com.example.springbootpractice.service.FoodService;

@RestController
public class FoodController {

	@Autowired
	private FoodService foodServ;
	
	@PostMapping("/save")
	public ResponseEntity<String> add(@Valid @RequestBody Food food, BindingResult br) throws userexistsexception{
		if(br.hasErrors()) {
			return new ResponseEntity<String>("check input again", HttpStatus.BAD_GATEWAY);
		}
		Food saved=foodServ.add(food);
		return new ResponseEntity<String>("saved successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Food>> listall(){
		List<Food> all= foodServ.listall();
		return new ResponseEntity<List<Food>>(all, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> Updatebyid(@RequestBody Food food,@PathVariable int id) throws userdoesnotexistsexception{
		Food saved=foodServ.Updatebyid(food, id);
		return new ResponseEntity<String>("saved successfully", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> Deletebyid(@PathVariable int id) throws userdoesnotexistsexception{
		foodServ.Deletebyid(id);
		return new ResponseEntity<String>("deleated successfully", HttpStatus.GONE);
	}
	
}
