package by.sobol.project.hotel.web.action.impl.common;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.*;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.domain.Type;
import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;

public class LookListRoomImpl extends ActionAssistant implements BaseAction {

	private RoomService roomService = ServiceFactory.getRoomService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		List<Room> roomList = roomService.getListRooms();
		request.setAttribute(ATTRIBUTE_LIST_ROOMS, roomList);
		Map<Integer, Type> roomTypeMap = getTypesForRoomList(roomList);
		request.setAttribute(ATTRIBUTE_ROOM_TYPE_MAP, roomTypeMap);
		return PAGE_LIST_ROOMS_JSP;
	}
}