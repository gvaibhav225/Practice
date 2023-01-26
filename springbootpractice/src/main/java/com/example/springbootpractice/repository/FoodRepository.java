package com.example.springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootpractice.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer>{

}
