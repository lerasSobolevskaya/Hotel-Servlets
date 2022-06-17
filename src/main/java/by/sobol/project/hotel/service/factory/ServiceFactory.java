package by.sobol.project.hotel.service.factory;

import by.sobol.project.hotel.service.BillService;
import by.sobol.project.hotel.service.FacilityService;
import by.sobol.project.hotel.service.OrderService;
import by.sobol.project.hotel.service.RoomService;
import by.sobol.project.hotel.service.TypeService;
import by.sobol.project.hotel.service.UserService;
import by.sobol.project.hotel.service.impl.BillServiceImpl;
import by.sobol.project.hotel.service.impl.FacilityServiceImpl;
import by.sobol.project.hotel.service.impl.OrderServiceImpl;
import by.sobol.project.hotel.service.impl.RoomServiceImpl;
import by.sobol.project.hotel.service.impl.TypeServiceImpl;
import by.sobol.project.hotel.service.impl.UserServiceImpl;

public class ServiceFactory {

	public static UserService getUserService() {
		return new UserServiceImpl();
	}

	public static BillService getBillService() {
		return new BillServiceImpl();
	}

	public static OrderService getOrderService() {
		return new OrderServiceImpl();
	}

	public static TypeService getTypeService() {
		return new TypeServiceImpl();
	}

	public static RoomService getRoomService() {
		return new RoomServiceImpl();
	}

	public static FacilityService getFacilityService() {
		return new FacilityServiceImpl();
	}

}
