package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.AccountMapper;
import com.example.demo.model.Account;

@RestController
public class CallController {
	@Autowired
	AccountMapper mapper;
	
	@RequestMapping("getAllAccount")
	public List<Account> getName() {
		return mapper.getAllAccount();
	}
	
	@RequestMapping("createUser")
	public String createUser(@RequestBody Account account) {
		mapper.addUser(account);
		return "{\"key\":\"done\"}";
	}
}
