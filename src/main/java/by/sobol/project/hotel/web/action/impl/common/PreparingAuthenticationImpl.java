package by.sobol.project.hotel.web.action.impl.common;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.web.action.BaseAction;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LOGIN_JSP;

public class PreparingAuthenticationImpl implements BaseAction {
	
	@Override
	public String chooseAction(HttpServletRequest request) {
		return PAGE_LOGIN_JSP;
	}

}
