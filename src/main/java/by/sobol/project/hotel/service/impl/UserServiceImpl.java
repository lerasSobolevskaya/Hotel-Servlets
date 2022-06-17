package by.sobol.project.hotel.service.impl;

import java.util.List;

import by.sobol.project.hotel.dao.UserDao;
import by.sobol.project.hotel.dao.factory.DaoFactory;
import by.sobol.project.hotel.domain.User;
import by.sobol.project.hotel.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = DaoFactory.getUserDao();

	@Override
	public List<User> getListUsers() {
		return userDao.getList();
	}

	@Override
	public void createUser(User user) {
		userDao.create(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.read(id);
	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);
	}

	@Override
	public void deleteUser(int id) {
		userDao.delete(id);
	}

	@Override
	public User authorizeUser(String login, String password) {
		User user = new User(login, password);
		return userDao.authentication(user);
	}

}