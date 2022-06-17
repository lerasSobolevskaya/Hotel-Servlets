package by.sobol.project.hotel.web.action.impl.admin.room;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LIST_ROOMS_FOR_ADMIN;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_ROOM_TYPE_MAP;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_LIST_ROOMS;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.domain.Type;
import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;
import by.sobol.project.hotel.web.action.impl.common.ActionAssistant;

public class AdminLookListRooms extends ActionAssistant implements BaseAction {

	private RoomService roomService = ServiceFactory.getRoomService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		List<Room> listRooms = roomService.getListRooms();
		request.setAttribute(ATTRIBUTE_LIST_ROOMS, listRooms);
		Map<Integer, Type> roomTypeMap = getTypesForRoomList(listRooms);
		request.setAttribute(ATTRIBUTE_ROOM_TYPE_MAP, roomTypeMap);
		return PAGE_LIST_ROOMS_FOR_ADMIN;
	}

}
