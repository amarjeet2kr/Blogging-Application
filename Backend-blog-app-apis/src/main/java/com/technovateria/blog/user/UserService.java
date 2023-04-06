package com.technovateria.blog.user;

import java.util.List;

public interface UserService {
	
	//create a user
	UserDto createUser(UserDto userDto);
	
	//update a user
	UserDto updateUser(UserDto userDto, Integer userId);
	
	//get single user
	UserDto getUserById(Integer userId);
	
	//get all users
	List<UserDto> getAllUsers();
	
	//delete a user
	void deleteUser(Integer userId);
}
