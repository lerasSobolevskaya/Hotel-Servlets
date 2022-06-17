package by.sobol.project.hotel.test.service;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.sobol.project.hotel.domain.Order;
import by.sobol.project.hotel.service.OrderService;
import by.sobol.project.hotel.service.impl.OrderServiceImpl;

public class OrderServiceImplTests {

	private OrderService orderService;
	private Order order;
	private List<Order> orders;

	@Before
	public void initOrderServiceImpl() {
		orderService = mock(OrderServiceImpl.class);
	}

	@Test
	public void getListOrders() {
		when(orderService.getListOrders()).thenReturn(orders);
		orderService.getListOrders();
		verify(orderService, times(1)).getListOrders();
	}

	@Test
	public void createOrderTest() {
		orderService.createOrder(order);
		verify(orderService, times(1)).createOrder(order);
	}

	@Test
	public void getOrderByIdTest() {
		when(orderService.getOrderById(anyInt())).thenReturn(order);
		orderService.getOrderById(anyInt());
		verify(orderService, times(1)).getOrderById(anyInt());
	}

	@Test
	public void updateOrderTest() {
		orderService.updateOrder(order);
		verify(orderService, times(1)).updateOrder(order);
	}

	@Test
	public void deleteOrderTest() {
		orderService.deleteOrder(anyInt());
		verify(orderService, times(1)).deleteOrder(anyInt());
	}
}
