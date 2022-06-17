package by.sobol.project.hotel.web.action.impl.common;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.web.action.BaseAction;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_INDEX_JSP;

public class DefaultActionImpl implements BaseAction {

	@Override
	public String chooseAction(HttpServletRequest request) {
		return PAGE_INDEX_JSP;
	}

}
