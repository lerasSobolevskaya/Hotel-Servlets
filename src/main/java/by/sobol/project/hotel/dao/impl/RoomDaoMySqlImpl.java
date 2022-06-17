package by.sobol.project.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.sobol.project.hotel.dao.RoomDao;
import by.sobol.project.hotel.dao.util.AbstractDaoMySqlImpl;
import by.sobol.project.hotel.domain.Room;

public class RoomDaoMySqlImpl extends AbstractDaoMySqlImpl implements RoomDao {

	static final Logger LOG = Logger.getLogger(RoomDaoMySqlImpl.class);

	@Override
	public List<Room> getList() {
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		List<Room> rooms = new ArrayList<>();
		try (Statement stm = connection.createStatement();) {
			result = stm.executeQuery(SELECT_ALL_ROOMS);
			while (result.next()) {
				rooms.add(buildRoom(result));
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_ROOM_LIST,  ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return rooms;
	}

	@Override
	public Room read(int id) {
		Room room = new Room();
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		try (PreparedStatement statement = connection.prepareStatement(SELECT_ROOM)) {
			statement.setInt(1, id);
			result = statement.executeQuery();
			if (result.next()) {
				room = buildRoom(result);
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_ROOM, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return room;
	}

	@Override
	public void create(Room room) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_ROOMS)) {
			statement.setInt(1, room.getNumber());
			statement.setInt(2, room.getNumberOfSeats());
			statement.setInt(3, room.getPrice());
			statement.setString(4, room.getStatus());
			// statement.setInt(5, room.getTypeId());
			//statement.setString(5, room.getImage());
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_CREATE_ROOM, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public void update(Room room) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement statement = connection.prepareStatement(UPDATE_ROOM)) {
			statement.setInt(1, room.getNumber());
			statement.setInt(2, room.getNumberOfSeats());
			statement.setInt(3, room.getPrice());
			statement.setString(4, room.getStatus());
			statement.setInt(5, room.getId());
			statement.setString(6, room.getImage());
			statement.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_UPDATE_ROOM, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public void delete(int id) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement ps = connection.prepareStatement(DELETE_ROOM)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_DELETE_ROOM, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	private Room buildRoom(ResultSet result) throws SQLException {
		Room room = new Room();
		room.setId(result.getInt(ROOM_ID));
		room.setNumber(result.getInt(ROOM_NUMBER));
		room.setNumberOfSeats(result.getInt(ROOM_NUMBER_OF_SEATS));
		room.setTypeId(result.getInt(TYPE_ID));
		room.setPrice(result.getInt(ROOM_PRICE));
		room.setStatus(result.getString(ROOM_STATUS));
		room.setImage(result.getString(ROOM_IMAGE));
		return room;
	}

}
