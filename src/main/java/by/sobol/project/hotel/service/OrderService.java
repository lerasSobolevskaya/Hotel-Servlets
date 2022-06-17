package by.sobol.project.hotel.service;

import java.util.List;

import by.sobol.project.hotel.domain.Order;

public interface OrderService {

	List<Order> getListOrders();

	void createOrder(Order order);

	Order getOrderById(int id);

	void updateOrder(Order order);

	void deleteOrder(int id);

}
