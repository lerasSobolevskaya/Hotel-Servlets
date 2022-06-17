package by.sobol.project.hotel.web.action.impl.admin.room;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Facility;
import by.sobol.project.hotel.service.FacilityService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LIST_FACILITIES_FOR_ADMIN;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_LIST_FACILITIES;

public class AdminLookListFacilitiesImpl implements BaseAction {

	private FacilityService facilityService = ServiceFactory.getFacilityService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		List<Facility> listFacilities = facilityService.getListFacilities();
		request.setAttribute(ATTRIBUTE_LIST_FACILITIES, listFacilities);
		return PAGE_LIST_FACILITIES_FOR_ADMIN;
	}

}
