package com.userlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.userlist.entity.User;
import com.userlist.repository.UserRepository;
@Service
public class UserService {
@Autowired
private UserRepository userrepo;
	public List<User>getAll(){
		return userrepo.findAll();
	}
	public User getUserDetails(int  id) {
		return userrepo.getById(id);
	}
	public User createUserDetails(User user) {
		return userrepo.save(user);
	}
	public User updateUserDetails(User user) {
		return userrepo.save(user);
		
	}
	public void deleteUserDetails(int id) {
		userrepo.deleteById(id);
	}

}
