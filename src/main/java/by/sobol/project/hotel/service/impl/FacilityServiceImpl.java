package by.sobol.project.hotel.service.impl;

import java.util.List;

import by.sobol.project.hotel.dao.FacilityDao;
import by.sobol.project.hotel.dao.factory.DaoFactory;
import by.sobol.project.hotel.domain.Facility;
import by.sobol.project.hotel.service.FacilityService;

public class FacilityServiceImpl implements FacilityService{

	private FacilityDao facilityDao = DaoFactory.getFacilityDao();
	
	@Override
	public List<Facility> getListFacilities() {
		return facilityDao.getList();
	}

	@Override
	public void createFacility(Facility facility) {
		facilityDao.create(facility);
		
	}

	@Override
	public Facility getFacilityById(int id) {
		return facilityDao.read(id);
	}

	@Override
	public void updateFacility(Facility facility) {
		facilityDao.update(facility);
		
	}

	@Override
	public void deleteFacility(int id) {
		facilityDao.delete(id);
		
	}

	

}
