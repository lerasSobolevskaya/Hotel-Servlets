package by.sobol.project.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.sobol.project.hotel.dao.UserDao;
import by.sobol.project.hotel.dao.util.AbstractDaoMySqlImpl;
import by.sobol.project.hotel.domain.User;

public class UserDaoMySqlImpl extends AbstractDaoMySqlImpl implements UserDao {

	static final Logger LOG = Logger.getLogger(UserDaoMySqlImpl.class);

	@Override
	public List<User> getList() {
		List<User> users = new ArrayList<>();
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		try (Statement statement = connection.createStatement()) {
			result = statement.executeQuery(SELECT_ALL_USERS);
			while (result.next()) {
				users.add(buildUser(result));
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_USER_LIST, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return users;
	}

	@Override
	public void create(User user) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_USERS)) {
			statement.setString(1, user.getName());
			statement.setString(2, user.getSurname());
			statement.setString(3, user.getPassNum());
			statement.setString(4, user.getRole());
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_CREATE_USER, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public User read(int id) {
		User user = new User();
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		try (PreparedStatement statement = connection.prepareStatement(SELECT_USER)) {
			statement.setInt(1, id);
			result = statement.executeQuery();
			if (result.next()) {
				user = buildUser(result);
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_USER, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return user;
	}

	@Override
	public void update(User user) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE_USER)) {
			statement.setString(1, user.getName());
			statement.setString(2, user.getSurname());
			statement.setString(3, user.getPassNum());
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_UPDATE_USER, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}

	}

	@Override
	public void delete(int id) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(DELETE_USER)) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_DELETE_USER, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}

	}

	@Override
	public User authentication(User userIn) {
		User user = new User();
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		try (PreparedStatement statement = connection.prepareStatement(USER_AUTHENTICATION)) {
			statement.setString(1, userIn.getLogin());
			statement.setString(2, userIn.getPassword());
			result = statement.executeQuery();
			while (result.next()) {
				user = buildUser(result);
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_AUTHENTICATION, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return user;
	}

	private User buildUser(ResultSet result) throws SQLException {
		User user = new User();
		user.setId(result.getInt(USER_ID));
		user.setLogin(result.getString(USER_LOGIN));
		user.setName(result.getString(USER_NAME));
		user.setPassword(result.getString(USER_PASSWORD));
		user.setPassNum(result.getString(USER_PASS_NUM));
		user.setRole(result.getString(USER_ROLE));
		user.setSurname(result.getString(USER_SURNAME));
		return user;
	}
}
