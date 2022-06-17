package by.sobol.project.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.sobol.project.hotel.dao.TypeDao;
import by.sobol.project.hotel.dao.util.AbstractDaoMySqlImpl;
import by.sobol.project.hotel.domain.Type;

public class TypeDaoMySqlImpl extends AbstractDaoMySqlImpl implements TypeDao {

	static final Logger LOG = Logger.getLogger(TypeDaoMySqlImpl.class);

	@Override
	public List<Type> getList() {
		List<Type> types = new ArrayList<>();
		ResultSet result = null;
		Connection connection = CONNECTION.getConnect();
		try (Statement stm = connection.createStatement();) {
			result = stm.executeQuery(SELECT_ALL_TYPES);
			while (result.next()) {
				types.add(buildType(result));
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_TYPE_LIST, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);

		}
		return types;
	}

	@Override
	public void create(Type type) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_TYPES)) {
			statement.setString(1, type.getType());
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_CREATE_TYPE, ex);
		} finally {
			CONNECTION.disconnect(connection);

		}

	}

	@Override
	public Type read(int id) {
		Type type = new Type();
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		try (PreparedStatement statement = connection.prepareStatement(SELECT_TYPE)) {
			statement.setInt(1, id);
			result = statement.executeQuery();
			if (result.next()) {
				type = buildType(result);
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_TYPE, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return type;
	}

	@Override
	public void update(Type entity) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE_TYPE)) {
			statement.setString(1, TYPE_TYPE);
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_UPDATE_TYPE, ex);
		} finally {
			CONNECTION.disconnect(connection);

		}

	}

	@Override
	public void delete(int id) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(DELETE_TYPE)) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_DELETE_TYPE, ex);
		} finally {
			CONNECTION.disconnect(connection);

		}

	}

	private Type buildType(ResultSet result) throws SQLException {
		Type type = new Type();
		type.setId(result.getInt(TYPE_ID));
		type.setType(result.getString(TYPE_TYPE));
		return type;
	}

}
