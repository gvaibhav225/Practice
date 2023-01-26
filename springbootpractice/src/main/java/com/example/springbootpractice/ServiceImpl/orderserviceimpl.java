package com.example.springbootpractice.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootpractice.entity.order;
import com.example.springbootpractice.repository.orderrepository;
import com.example.springbootpractice.service.orderservice;

@Service
public class orderserviceimpl implements orderservice {

	@Autowired
	public orderrepository orderRepo;
	@Override
	public Optional<order> getorder(int id) {
		Optional<order> user=orderRepo.findById(id);
		return user;
	}
	@Override
	public order saveorder(order order) {
		// TODO Auto-generated method stub
		order savedo=orderRepo.save(order);
		return savedo;
		
	}

}
