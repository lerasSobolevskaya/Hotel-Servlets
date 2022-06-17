package by.sobol.project.hotel.service.impl;

import java.util.List;

import by.sobol.project.hotel.dao.RoomDao;
import by.sobol.project.hotel.dao.factory.DaoFactory;
import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.service.RoomService;

public class RoomServiceImpl implements RoomService {

	private RoomDao roomDao = DaoFactory.getRoomDao();

	@Override
	public List<Room> getListRooms() {
		return roomDao.getList();
	}

	@Override
	public void createRoom(Room room) {
		roomDao.create(room);
	}

	@Override
	public Room getRoomById(int id) {
		return roomDao.read(id);
	}

	@Override
	public void updateRoom(Room room) {
		roomDao.update(room);
	}

	@Override
	public void deleteRoom(int id) {
		roomDao.delete(id);
	}

}
