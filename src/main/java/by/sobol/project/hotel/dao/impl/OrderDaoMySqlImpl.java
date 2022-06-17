package by.sobol.project.hotel.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.sobol.project.hotel.dao.OrderDao;
import by.sobol.project.hotel.dao.util.AbstractDaoMySqlImpl;
import by.sobol.project.hotel.domain.Order;

public class OrderDaoMySqlImpl extends AbstractDaoMySqlImpl implements OrderDao {

	static final Logger LOG = Logger.getLogger(OrderDaoMySqlImpl.class);

	@Override
	public List<Order> getList() {
		List<Order> orders = new ArrayList<>();
		ResultSet result = null;
		Connection connection = CONNECTION.getConnect();
		try (Statement stm = connection.createStatement()) {
			result = stm.executeQuery(SELECT_ALL_ORDERS);
			while (result.next()) {
				orders.add(buildOrder(result));
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_ORDER_LIST, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return orders;
	}

	@Override
	public void create(Order entity) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_ORDERS)) {
			statement.setDate(1, (Date) entity.getStartDate());
			statement.setDate(2, (Date) entity.getEndDate());
			statement.setInt(3, entity.getRoomId());
			statement.setInt(4, entity.getUserId());
			statement.setString(5, entity.getAdults());
			statement.setString(6, entity.getChildren());
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_CREATE_ORDER, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public Order read(int id) {
		Order order = new Order();
		ResultSet result = null;
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(SELECT_ORDER)) {
			statement.setInt(1, id);
			result = statement.executeQuery();
			if (result.next()) {
				order = buildOrder(result);
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_ORDER, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return order;
	}

	@Override
	public void update(Order entity) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE_ORDER)) {
			statement.setDate(1, (Date) entity.getStartDate());
			statement.setDate(2, (Date) entity.getEndDate());
			statement.setInt(3, entity.getRoomId());
			statement.setInt(4, entity.getUserId());
			statement.setString(5, entity.getAdults());
			statement.setString(6, entity.getChildren());
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_UPDATE_ORDER, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public void delete(int id) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(DELETE_ORDER)) {
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_DELETE_ORDER, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	private Order buildOrder(ResultSet result) throws SQLException {
		Order order = new Order();
		order.setId(result.getInt(ORDER_ID));
		order.setEndDate(result.getDate(ORDER_END_DATE));
		order.setStartDate(result.getDate(ORDER_START_DATE));
		order.setRoomId(result.getInt(ORDER_ROOM_ID));
		order.setUserId(result.getInt(ORDER_USER_ID));
		order.setAdults(result.getString(ORDER_ADULTS));
		order.setChildren(result.getString(ORDER_CHILDREN));
		return order;
	}
}