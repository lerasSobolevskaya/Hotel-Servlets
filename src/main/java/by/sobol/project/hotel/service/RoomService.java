package by.sobol.project.hotel.service;

import java.util.List;

import by.sobol.project.hotel.domain.Room;

public interface RoomService {

	List<Room> getListRooms();

	void createRoom(Room room);

	Room getRoomById(int id);

	void updateRoom(Room room);

	void deleteRoom(int id);
}
