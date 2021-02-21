package com.pensasha.abba.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//Adding a user
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	//Editing a user
	public User editUser(User user) {
		return userRepository.save(user);
	}
	
	//Deleting a user
	public void deleteUserById(String userName) {
		userRepository.deleteById(userName);
	}
	
	//Listing all users
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Getting a single user
	public User getUserByUsername(String username) {
		return userRepository.findById(username).get();
	}
	
	//Does user exist
	public Boolean doesUserExist(String username) {
		return userRepository.existsById(username);
	}
}
