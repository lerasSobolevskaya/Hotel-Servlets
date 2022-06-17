package by.sobol.project.hotel.service.impl;

import java.util.List;

import by.sobol.project.hotel.dao.OrderDao;
import by.sobol.project.hotel.dao.factory.DaoFactory;
import by.sobol.project.hotel.domain.Order;
import by.sobol.project.hotel.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao = DaoFactory.getOrderDao();

	@Override
	public List<Order> getListOrders() {
		return orderDao.getList();
	}

	@Override
	public void createOrder(Order order) {
		orderDao.create(order);
		;
	}

	@Override
	public Order getOrderById(int id) {
		return orderDao.read(id);
	}

	@Override
	public void updateOrder(Order order) {
		orderDao.update(order);
	}

	@Override
	public void deleteOrder(int id) {
		orderDao.delete(id);
	}

}
