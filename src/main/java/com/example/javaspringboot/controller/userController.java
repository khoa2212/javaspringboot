package com.example.javaspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javaspringboot.mapper.UsersMapper;
import com.example.javaspringboot.model.Users;
import com.example.javaspringboot.model.UsersExample;
import com.google.gson.Gson;

@RestController
@RequestMapping("/api")
public class userController {

	@Autowired
	UsersMapper userMapper;
	
	@GetMapping("/users")
	public String GetAllUsers() {
		
		UsersExample example  = new UsersExample();
		List<Users> list = userMapper.selectByExample(example);
		
		
		System.out.println("so luong: " + list.size());
		
		String json = new Gson().toJson(list);
		
		return json;
	}
	
	@PostMapping("/users/signup")
	public Users SignUp(@RequestBody Users user) {
		userMapper.insert(user);
		return user;
	}
}
