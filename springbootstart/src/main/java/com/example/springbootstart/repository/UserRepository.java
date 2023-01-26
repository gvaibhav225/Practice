package com.example.springbootstart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springbootstart.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

	@Query("select u from User u where u.firstname=:name")
	public List<User> findByFirstName(@Param("name") String firstname);
	
}
