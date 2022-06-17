package by.sobol.project.hotel.dao;

import by.sobol.project.hotel.domain.User;

public interface UserDao extends BaseDao<User>{

	User authentication(User user);
	
}
