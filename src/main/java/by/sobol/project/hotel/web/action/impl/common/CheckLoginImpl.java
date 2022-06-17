package by.sobol.project.hotel.web.action.impl.common;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.User;
import by.sobol.project.hotel.service.UserService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;
import static by.sobol.project.hotel.web.util.RequestParamValidator.validateLoginAndPass;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.*;

public class CheckLoginImpl implements BaseAction {

	private UserService userService = ServiceFactory.getUserService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		String login = request.getParameter(PARAM_LOGIN);
		String password = request.getParameter(PARAM_PASSWORD);
		validateLoginAndPass(login, password);
		User user = userService.authorizeUser(login, password);
		if (user != null) {
			if (user.getRole().equals(ROLE_ADMIN)) {
				return PAGE_ADMIN_JSP;
			} else if (user.getRole().equals(ROLE_USER)) {
				return PAGE_USER_JSP;
			}
		} else {
			return PAGE_ERROR_JSP;
		}
		return PAGE_INDEX_JSP;

	}

}
