package by.sobol.project.hotel.test.service;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.sobol.project.hotel.domain.Type;
import by.sobol.project.hotel.service.TypeService;
import by.sobol.project.hotel.service.impl.TypeServiceImpl;

public class TypeServiceImplTests {

	private TypeService typeService;
	private Type type;
	private List<Type> types;

	@Before
	public void initTypeServiceImpl() {
		typeService = mock(TypeServiceImpl.class);
	}

	@Test
	public void getListTypesTest() {
		when(typeService.getListTypes()).thenReturn(types);
		typeService.getListTypes();
		verify(typeService, times(1)).getListTypes();
	}

	@Test
	public void createTypeTest() {
		typeService.createType(type);
		verify(typeService, times(1)).createType(type);
	}

	@Test
	public void getTypeByIdTest() {
		when(typeService.getTypeById(anyInt())).thenReturn(type);
		typeService.getTypeById(anyInt());
		verify(typeService, times(1)).getTypeById(anyInt());
	}

	@Test
	public void updateTypeTest() {
		typeService.updateType(type);
		verify(typeService, times(1)).updateType(type);
	}

	@Test
	public void deleteTypeTest() {
		typeService.deleteType(anyInt());
		verify(typeService, times(1)).deleteType(anyInt());
	}

}
