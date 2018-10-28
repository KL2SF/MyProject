package com.qf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.qf.dao.UserDao;
import com.qf.domain.User;
import com.qf.utils.JDBCUtils;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class UserDaoImpl implements UserDao {

	@Override
	public void userRegister(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql="INSERT INTO USER VALUES()";
	}

	@Override
	public void uerUpdate(User user) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public User userLogin(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select * from user where username =? and password=?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanHandler<User>(User.class),user);
	}

}
