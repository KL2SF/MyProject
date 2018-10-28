package com.qf.service;

import java.sql.SQLException;

import com.qf.domain.User;

public interface UserService {
	void userRegister(User user) throws SQLException;
	void uerUpdate(User user) throws SQLException;
	User userLogin(User user) throws SQLException;
}
