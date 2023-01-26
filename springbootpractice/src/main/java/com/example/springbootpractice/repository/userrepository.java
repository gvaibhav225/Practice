package com.example.springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootpractice.entity.userentity;

@Repository
public interface userrepository extends JpaRepository<userentity,Integer> {

}
