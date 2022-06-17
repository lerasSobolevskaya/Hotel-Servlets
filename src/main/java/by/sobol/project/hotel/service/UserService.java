package by.sobol.project.hotel.service;

import java.util.List;

import by.sobol.project.hotel.domain.User;

public interface UserService {
	
	List<User> getListUsers();

	void createUser(User user);

	User getUserById(int id);

	void updateUser(User user);

	void deleteUser(int id);
	
	User authorizeUser(String login, String password);
}
