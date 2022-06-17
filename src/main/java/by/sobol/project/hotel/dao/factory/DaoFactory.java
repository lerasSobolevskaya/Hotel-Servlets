package by.sobol.project.hotel.dao.factory;

import by.sobol.project.hotel.dao.BillDao;
import by.sobol.project.hotel.dao.FacilityDao;
import by.sobol.project.hotel.dao.OrderDao;
import by.sobol.project.hotel.dao.RoomDao;
import by.sobol.project.hotel.dao.TypeDao;
import by.sobol.project.hotel.dao.UserDao;
import by.sobol.project.hotel.dao.impl.BillDaoMySqlImpl;
import by.sobol.project.hotel.dao.impl.FacilityDaoMySqlImpl;
import by.sobol.project.hotel.dao.impl.OrderDaoMySqlImpl;
import by.sobol.project.hotel.dao.impl.RoomDaoMySqlImpl;
import by.sobol.project.hotel.dao.impl.TypeDaoMySqlImpl;
import by.sobol.project.hotel.dao.impl.UserDaoMySqlImpl;

public class DaoFactory {

	public static RoomDao getRoomDao() {
		return new RoomDaoMySqlImpl();
	}

	public static OrderDao getOrderDao() {
		return new OrderDaoMySqlImpl();
	}

	public static TypeDao getTypeDao() {
		return new TypeDaoMySqlImpl();
	}

	public static UserDao getUserDao() {
		return new UserDaoMySqlImpl();
	}

	public static BillDao getBillDao() {
		return new BillDaoMySqlImpl();
	}

	public static FacilityDao getFacilityDao() {
		return new FacilityDaoMySqlImpl();
	}

}
