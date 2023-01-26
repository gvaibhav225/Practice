package com.example.springbootpractice.ServiceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootpractice.Exception.userdoesnotexistsexception;
import com.example.springbootpractice.Exception.userexistsexception;
import com.example.springbootpractice.entity.Food;
import com.example.springbootpractice.repository.FoodRepository;
import com.example.springbootpractice.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{

	
	@Autowired
	public FoodRepository foodRepo;
	
	
	@Override
	public Food add(Food food) throws userexistsexception {
		// TODO Auto-generated method stub
		if(foodRepo.existsById(food.getId())) {
			throw new userexistsexception();
		}
		
		return foodRepo.save(food);
	}

	@Override
	public List<Food> listall() {
		// TODO Auto-generated method stub
		return foodRepo.findAll();
	}

	@Override
	public Food Updatebyid(Food food,int id) throws userdoesnotexistsexception {
		// TODO Auto-generated method stub
		if(foodRepo.existsById(id)) {
			Food pre=foodRepo.getById(id);
			if(Objects.nonNull(food.getDescription())&&!"".equalsIgnoreCase(food.getDescription())) {
				pre.setDescription(food.getDescription());
			}
			if(Objects.nonNull(food.getName())&&!"".equalsIgnoreCase(food.getName())) {
				pre.setName(food.getName());
			}
			if(Objects.nonNull(food.getPrice())&&food.getPrice()!=0) {
				pre.setPrice(food.getPrice());
			}
			if(Objects.nonNull(food.getServe_qty())&&food.getServe_qty()!=0) {
				pre.setServe_qty(food.getServe_qty());
			}
			return foodRepo.save(pre);
		}
		else {
			throw new userdoesnotexistsexception();
		}
		
	
	}

	@Override
	public void Deletebyid(int id) throws userdoesnotexistsexception {
		// TODO Auto-generated method stub
		if(foodRepo.existsById(id)) {
		foodRepo.deleteById(id);
		}else {
			throw new userdoesnotexistsexception();
		}
		
		
	}

}
