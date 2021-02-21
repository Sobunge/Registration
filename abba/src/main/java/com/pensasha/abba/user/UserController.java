package com.pensasha.abba.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users/{username}")
	public User getUser(@PathVariable String username) {
		
		return userService.getUserByUsername(username); 
	}
	
	@PostMapping("/users/{username}")
	public User editUser(@RequestBody User user, String username) {
		
		if(userService.doesUserExist(username) == true) {
			return userService.addUser(user);
		}
		else {
			return user;
		}
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@DeleteMapping("/users/{username}")
	public void deleteUser(@PathVariable String userName) {
		userService.deleteUserById(userName);
	}
}
