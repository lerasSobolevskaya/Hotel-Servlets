package by.sobol.project.hotel.test.service;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import by.sobol.project.hotel.domain.Facility;
import by.sobol.project.hotel.service.FacilityService;
import by.sobol.project.hotel.service.impl.FacilityServiceImpl;

public class FacilityServiceImplTests {

	private FacilityService facilityService;
	private Facility facility;
	private List<Facility> facilities;

	@Before
	public void initFacilityServiceImpl() {
		facilityService = mock(FacilityServiceImpl.class);
	}

	@Test
	public void getListFacilitiesTest() {
		when(facilityService.getListFacilities()).thenReturn(facilities);
		facilityService.getListFacilities();
		verify(facilityService, times(1)).getListFacilities();
	}

	@Test
	public void getFacilityByIdTest() {
		when(facilityService.getFacilityById(anyInt())).thenReturn(facility);
		facilityService.getFacilityById(anyInt());
		verify(facilityService, times(1)).getFacilityById(anyInt());
	}

	@Test
	public void deleteFacilityTest() {
		facilityService.deleteFacility(anyInt());
		verify(facilityService, times(1)).deleteFacility(anyInt());
	}

	@Test
	public void createFacilityTest() {
		facilityService.createFacility(facility);
		verify(facilityService, times(1)).createFacility(facility);
	}

	@Test
	public void updateFacilityTest() {
		facilityService.updateFacility(facility);
		verify(facilityService, times(1)).updateFacility(facility);
	}
}