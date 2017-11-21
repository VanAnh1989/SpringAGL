package com.example.demo.configuration;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.Account;

public interface AccountMapper {
	public void addUser(@Param("account") Account account);
	public List<Account> getAllAccount();
}
