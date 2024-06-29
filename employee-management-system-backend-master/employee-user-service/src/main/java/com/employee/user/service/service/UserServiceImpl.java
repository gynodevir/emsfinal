package com.employee.user.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.user.service.dao.UserDao;
import com.employee.user.service.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User registerUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User getUserById(int userId) {
		return userDao.findById(userId).get();
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		return userDao.findByEmailIdAndPassword(email, password);
	}

	@Override
	public User getUserByEmailAndPasswordAndRole(String email, String password, String role) {
		return userDao.findByEmailIdAndPasswordAndRole(email, password, role);
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.findByEmailId(email);
	}

	@Override
	public List<User> getUsersByRoleAndStatus(String role, int status) {
		return userDao.findByRoleAndStatus(role, status);
	}

	@Override
	public User getUserByEmailAndRole(String email, String role) {
		return userDao.findByEmailIdAndRole(email, role);
	}

	@Override
	public List<User> getUsersByRoleAndStatusAndDepartmentId(String role, int status, int departmentId) {
		return userDao.findByRoleAndStatusAndDepartmentId(role, status, departmentId);
	}


}
