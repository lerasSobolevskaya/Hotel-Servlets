package by.sobol.project.hotel.web.action.impl.admin.room;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;

import static by.sobol.project.hotel.web.util.HttpRequestParamFormator.formatInt;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PARAM_ROOM_ID;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_LIST_ROOMS;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LIST_ROOMS_FOR_ADMIN;
import java.util.List;

public class DeleteRoomImpl implements BaseAction {

	private RoomService roomService = ServiceFactory.getRoomService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		int id = formatInt(request.getParameter(PARAM_ROOM_ID));
		Room room = new Room();
		room.setId(id);
		roomService.deleteRoom(id);
		List<Room> rooms = roomService.getListRooms();
		request.setAttribute(ATTRIBUTE_LIST_ROOMS, rooms);
		return PAGE_LIST_ROOMS_FOR_ADMIN;
	}

}
