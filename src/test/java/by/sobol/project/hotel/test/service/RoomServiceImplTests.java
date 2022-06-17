package by.sobol.project.hotel.test.service;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.service.RoomService;

public class RoomServiceImplTests {

	private List<Room> rooms;
	private Room room;
	private RoomService roomService;

	@Before
	public void initomService() {
		roomService = mock(RoomService.class);
	}

	@Test
	public void getRoomByIdTestTest() {
		when(roomService.getRoomById(anyInt())).thenReturn(room);
		roomService.getRoomById(anyInt());
		verify(roomService, times(1)).getRoomById(anyInt());
	}

	@Test
	public void createRoomTest() {
		roomService.createRoom(room);
		verify(roomService, times(1)).createRoom(room);
	}

	@Test
	public void getRoomListTest() {
		roomService = mock(RoomService.class);
		when(roomService.getListRooms()).thenReturn(rooms);
		rooms = roomService.getListRooms();
		verify(roomService, times(1)).getListRooms();

	}

	@Test
	public void updateRoomTest() {
		roomService = mock(RoomService.class);
		roomService.updateRoom(room);
		verify(roomService, times(1)).updateRoom(room);
	}

	@Test
	public void deleteRoomTest() {
		roomService = mock(RoomService.class);
		roomService.deleteRoom(anyInt());
		verify(roomService, times(1)).deleteRoom(anyInt());

	}

}
