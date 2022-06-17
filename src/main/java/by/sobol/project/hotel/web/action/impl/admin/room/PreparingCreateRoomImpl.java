package by.sobol.project.hotel.web.action.impl.admin.room;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.web.action.BaseAction;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_FORM_CREATE_JSP;

public class PreparingCreateRoomImpl implements BaseAction {

	@Override
	public String chooseAction(HttpServletRequest request) {
		return PAGE_FORM_CREATE_JSP;
	}

}
