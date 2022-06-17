package by.sobol.project.hotel.web.action.impl.admin.room;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;
import static by.sobol.project.hotel.web.util.HttpRequestParamFormator.formatInt;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PARAM_ROOM_ID;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_FORM_UPDATE_JSP;

public class PreparingRoomUpdateImpl implements BaseAction {

	private RoomService roomService = ServiceFactory.getRoomService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		int id = formatInt(request.getParameter(PARAM_ROOM_ID));
		request.setAttribute(PARAM_ROOM_ID, roomService.getRoomById(id));
		return PAGE_FORM_UPDATE_JSP;
	}

}
