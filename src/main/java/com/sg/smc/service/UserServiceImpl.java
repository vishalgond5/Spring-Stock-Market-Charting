package com.sg.smc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.smc.dto.UserDto;
import com.sg.smc.repository.UserRepository;
import com.sg.smc.utilities.UserUtilities;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDto addUser(UserDto userDto) {
		
		return UserUtilities.convertToUserDto(userRepo.save(UserUtilities.convertToUser(userDto)));
	}

	@Override
	public UserDto updateUser(UserDto userDto) {
		// TODO Auto-generated method stub
		return UserUtilities.convertToUserDto(userRepo.save(UserUtilities.convertToUser(userDto)));
	}

	@Override
	public List<UserDto> findAllUsers() {
		// TODO Auto-generated method stub
		return UserUtilities.convertToUserDtoList(userRepo.findAll());
	}

	@Override
	public UserDto findByUserId(long userId) {
		// TODO Auto-generated method stub
		return UserUtilities.convertToUserDto(userRepo.findById(userId).orElse(null));
	}

	@Override
	public UserDto deleteByUserId(long userId) {
		UserDto userDto = findByUserId(userId);
		userRepo.deleteById(userId);
		return userDto;
	}
	
	

}
