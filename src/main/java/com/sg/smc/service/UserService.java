package com.sg.smc.service;

import java.util.List;

import com.sg.smc.dto.UserDto;

public interface UserService {
	public UserDto addUser(UserDto userDto);
	public UserDto updateUser(UserDto userDto);
	public List<UserDto> findAllUsers();
	public UserDto findByUserId(long userId);
	public UserDto deleteByUserId(long userId);
}
