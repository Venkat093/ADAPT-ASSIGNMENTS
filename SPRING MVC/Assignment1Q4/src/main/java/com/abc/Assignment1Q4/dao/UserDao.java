package com.abc.Assignment1Q4.dao;

import com.madhu.springMVC4.model.User;
public interface UserDao 
{
	public int registerUser(User user);
	public String loginUser(User user);
}
