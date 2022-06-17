package by.sobol.project.hotel.web.action.impl.common;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.domain.Type;
import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;
import static by.sobol.project.hotel.web.util.HttpRequestParamFormator.formatInt;

import java.util.List;
import java.util.Map;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_ROOM;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_DETAILS_ABOUT_ROOM_JSP;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_ROOM_TYPE_MAP;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PARAM_ROOM_ID;

public class DetailsAboutRoomImpl extends ActionAssistant implements BaseAction {

	private RoomService roomService = ServiceFactory.getRoomService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		int id = formatInt(request.getParameter(PARAM_ROOM_ID));
		Room room = roomService.getRoomById(id);
		List<Room> roomList = roomService.getListRooms();
		Map<Integer, Type> roomTypeMap = getTypesForRoomList(roomList);
		request.setAttribute(ATTRIBUTE_ROOM_TYPE_MAP, roomTypeMap);
		request.setAttribute(ATTRIBUTE_ROOM, room);
		return PAGE_DETAILS_ABOUT_ROOM_JSP;
	}

}
