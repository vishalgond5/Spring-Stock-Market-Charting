package com.sg.smc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.smc.dto.UserDto;
import com.sg.smc.service.UserService;

@RestController
@RequestMapping("/smc/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
		
		return new ResponseEntity<UserDto>(userService.addUser(userDto),HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto){
		
		return new ResponseEntity<UserDto>(userService.addUser(userDto),HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<UserDto>> findAll(){
		
		return new ResponseEntity<List<UserDto>>(userService.findAllUsers(),HttpStatus.OK);
		
	}
	
	@GetMapping("/byId/{userId}")
	public ResponseEntity<UserDto> findByUserId(@PathVariable("userId") long userId){
		
		return new ResponseEntity<UserDto>(userService.findByUserId(userId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<UserDto> deleteByUserId(@PathVariable("userId") long userId){
		
		return new ResponseEntity<UserDto>(userService.deleteByUserId(userId),HttpStatus.OK);
		
	}

}
