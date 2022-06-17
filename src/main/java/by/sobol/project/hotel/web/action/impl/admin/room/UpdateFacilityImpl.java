package by.sobol.project.hotel.web.action.impl.admin.room;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.ATTRIBUTE_LIST_FACILITIES;
import static by.sobol.project.hotel.web.util.HttpRequestParamFormator.formatInt;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PAGE_LIST_FACILITIES_FOR_ADMIN;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PARAM_FACILITY;
import static by.sobol.project.hotel.web.util.WebControllerConstantPool.PARAM_FACILITY_ID;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.sobol.project.hotel.domain.Facility;
import by.sobol.project.hotel.service.FacilityService;
import by.sobol.project.hotel.service.factory.ServiceFactory;
import by.sobol.project.hotel.web.action.BaseAction;

public class UpdateFacilityImpl implements BaseAction {

	private FacilityService facilityService = ServiceFactory.getFacilityService();

	@Override
	public String chooseAction(HttpServletRequest request) {
		int id = formatInt(request.getParameter(PARAM_FACILITY_ID));
		String failityName = request.getParameter(PARAM_FACILITY);
		Facility facility = new Facility();
		facility.setId(id);
		facility.setNameFacilities(failityName);
		facilityService.updateFacility(facility);
		List<Facility> listFacility = facilityService.getListFacilities();
		request.setAttribute(ATTRIBUTE_LIST_FACILITIES, listFacility);
		return PAGE_LIST_FACILITIES_FOR_ADMIN;
	}

}
