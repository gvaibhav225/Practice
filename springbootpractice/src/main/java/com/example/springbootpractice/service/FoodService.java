package com.example.springbootpractice.service;
import java.util.List;

import com.example.springbootpractice.Exception.userdoesnotexistsexception;
import com.example.springbootpractice.Exception.userexistsexception;
import com.example.springbootpractice.entity.Food;
public interface FoodService {
	
	public Food add(Food food) throws userexistsexception;
	public List<Food> listall();
	public Food Updatebyid(Food food,int id) throws userdoesnotexistsexception;
	public void Deletebyid(int id) throws userdoesnotexistsexception;
}
