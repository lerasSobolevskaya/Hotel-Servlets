package by.sobol.project.hotel.web.action.impl.admin.room;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.User;
import by.sobol.project.hotel.service.UserService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_LIST_USERS;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LIST_USERS_JSP;

public class LookListUsersImpl implements BaseAction {

	private UserService userService = ServiceFactory.getUserService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		List<User> users = userService.getListUsers();
		request.setAttribute(ATTRIBUTE_LIST_USERS, users);
		return PAGE_LIST_USERS_JSP;
	}

}
