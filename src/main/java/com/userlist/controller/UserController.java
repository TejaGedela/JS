	package com.userlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userlist.entity.User;
import com.userlist.service.UserService;

@RestController 
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userservice;
	@GetMapping("/all")
	public List<User>getAll(){
		return userservice.getAll();
	}
@GetMapping("/get/{id}")
public User getUserDetails(@PathVariable("id") int id) {
	return userservice.getUserDetails(id);
}
@PostMapping("/create")
public User createUser(@RequestBody User user) {
	return userservice.createUserDetails(user);
	
}
@DeleteMapping("/delete/{id}")
public void deleteUserDetails(@PathVariable("id") int id) {
	userservice.deleteUserDetails(id);
}
@PutMapping("/update")
public User createUserDetails(@RequestBody User user) {
	return userservice.updateUserDetails(user);
}

}
