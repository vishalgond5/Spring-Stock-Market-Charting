package com.sg.smc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.sg.smc.bean.User;
import com.sg.smc.dto.UserDto;

public class UserUtilities {
	
	public static UserDto convertToUserDto(User user) {
		
		UserDto userDto = new UserDto();
		
		userDto.setId(user.getId());
		userDto.setUserName(user.getUserName());
		userDto.setPassword(user.getPassword());
		userDto.seteMail(user.geteMail());
		userDto.setMobileNo(user.getMobileNo());
		userDto.setUserType(user.getUserType());
		userDto.setConfirmed(user.isConfirmed());
		
		return userDto;
		
		
	}
	
	public static User convertToUser(UserDto userDto) {
		
		User user = new User();
		
		user.setId(userDto.getId());
		user.setUserName(userDto.getUserName());
		user.setPassword(userDto.getPassword());
		user.seteMail(userDto.geteMail());
		user.setMobileNo(userDto.getMobileNo());
		user.setUserType(userDto.getUserType());
		user.setConfirmed(userDto.isConfirmed());
		
		return user;
		
		
	}
	
	public static List<UserDto> convertToUserDtoList(List<User> list){
		List<UserDto> dtolist = new ArrayList<UserDto>();
		for(User user : list) 
			dtolist.add(convertToUserDto(user));
		return dtolist;
	}

}
