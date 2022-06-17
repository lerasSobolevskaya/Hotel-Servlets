package by.sobol.project.hotel.test.service;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.sobol.project.hotel.domain.User;
import by.sobol.project.hotel.service.UserService;
import by.sobol.project.hotel.service.impl.UserServiceImpl;

public class UserServiceImplTests {

	private UserService userService;
	private List<User> users;
	private User user;

	@Before
	public void initUserServiceImpl() {
		userService = mock(UserServiceImpl.class);

	}

	@Test
	public void authorizeUserTest() {
		when(userService.authorizeUser(anyString(), anyString())).thenReturn(user);
		userService.authorizeUser(anyString(), anyString());
		verify(userService, times(1)).authorizeUser(anyString(), anyString());

	}

	@Test
	public void getListUsersTest() {
		when(userService.getListUsers()).thenReturn(users);
		userService.getListUsers();
		verify(userService, times(1)).getListUsers();
	}

	@Test
	public void createUserTestTest() {
		userService.createUser(user);
		verify(userService, times(1)).createUser(user);

	}

	@Test
	public void getUserByIdTest() {
		when(userService.getUserById(anyInt())).thenReturn(user);
		userService.getUserById(anyInt());
		verify(userService, times(1)).getUserById(anyInt());
	}

	@Test
	public void updateUserTest() {
		userService.updateUser(user);
		verify(userService, times(1)).updateUser(user);
	}

	@Test
	public void deleteUserTest() {
		userService.deleteUser(anyInt());
		verify(userService, times(1)).deleteUser(anyInt());
	}
}
