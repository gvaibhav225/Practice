package com.example.springbootpractice.service;

import java.util.Optional;

import com.example.springbootpractice.entity.order;

public interface orderservice {
	public Optional<order> getorder(int id);
	public order saveorder(order order);
}
