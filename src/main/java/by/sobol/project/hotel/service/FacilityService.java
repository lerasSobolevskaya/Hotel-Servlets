package by.sobol.project.hotel.service;

import java.util.List;

import by.sobol.project.hotel.domain.Facility;

public interface FacilityService {

	List<Facility> getListFacilities();

	void createFacility(Facility facility);

	Facility getFacilityById(int id);

	void updateFacility(Facility facility);

	void deleteFacility(int id);

}
