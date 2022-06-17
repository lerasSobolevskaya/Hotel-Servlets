package by.sobol.project.hotel.web.action.impl.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Facility;
import by.sobol.project.hotel.service.FacilityService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LIST_FACILITIES_JSP;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_LIST_FACILITIES;

public class LookListFacilities implements BaseAction {

	private FacilityService facilityService = ServiceFactory.getFacilityService();
	
	@Override
	public String chooseAction(HttpServletRequest request) {
		List<Facility> facilities = facilityService.getListFacilities();
		request.setAttribute(ATTRIBUTE_LIST_FACILITIES, facilities);
		return PAGE_LIST_FACILITIES_JSP;
	}


}
