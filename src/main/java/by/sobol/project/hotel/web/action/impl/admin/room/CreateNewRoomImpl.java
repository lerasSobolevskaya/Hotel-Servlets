package by.sobol.project.hotel.web.action.impl.admin.room;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;
import static by.sobol.project.hotel.web.util.HttpRequestParamFormator.formatInt;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.*;

import java.util.List;

public class CreateNewRoomImpl implements BaseAction {

	private RoomService roomService = ServiceFactory.getRoomService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		int number = formatInt(request.getParameter(PARAM_ROOM_NUMBER));
		int numberOfSeats = formatInt(request.getParameter(PARAM_ROOM_NUMBER_OF_SEATS));
		int price = formatInt(request.getParameter(PARAM_ROOM_PRICE));
		String status = request.getParameter(PARAM_ROOM_STATUS);
		Room room = new Room();
		room.setNumber(number);
		room.setNumberOfSeats(numberOfSeats);
		room.setPrice(price);
		room.setStatus(status);
		roomService.createRoom(room);
		List<Room> rooms = roomService.getListRooms();
		request.setAttribute(ATTRIBUTE_LIST_ROOMS, rooms);
		return PAGE_ADMIN_JSP;
	}

}
