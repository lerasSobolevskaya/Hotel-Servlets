package by.sobol.project.hotel.web.action;

import static by.sobol.project.hotel.web.util.WebControllerConstantPool.*;

import by.sobol.project.hotel.web.action.impl.admin.room.AdminLookListFacilitiesImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.AdminLookListRooms;
import by.sobol.project.hotel.web.action.impl.admin.room.CreateNewRoomImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.DeleteFacilityImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.DeleteRoomImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.PreparingCreateRoomImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.PreparingRoomUpdateImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.PreparingUpdateFacilityImpl;
import by.sobol.project.hotel.web.action.impl.admin.room.UpdateRoomSaveImpl;
import by.sobol.project.hotel.web.action.impl.common.CheckLoginImpl;
import by.sobol.project.hotel.web.action.impl.common.DefaultActionImpl;
import by.sobol.project.hotel.web.action.impl.common.DetailsAboutRoomImpl;
import by.sobol.project.hotel.web.action.impl.common.LookListFacilities;
import by.sobol.project.hotel.web.action.impl.common.LookListRoomImpl;
import by.sobol.project.hotel.web.action.impl.common.PreparingAuthenticationImpl;

public class ActionManager {

	private ActionManager() {
	}

	public static BaseAction determineAction(String action) {
		BaseAction act = null;
		switch (action) {
		case ACTION_LIST_FACILITIES:
			act = new LookListFacilities();
			break;
		case ACTION_DELETE_FACILITIES:
			act = new DeleteFacilityImpl();
			break;
		case ACTION_FORM_UPDATE_FACILITY:
			act = new PreparingUpdateFacilityImpl();
			break;
		case ACTION_LIST_FACILITIES_FOR_ADMIN:
			act = new AdminLookListFacilitiesImpl();
			break;
		case ACTION_DETAILS_ABOUT_ROOM:
			act = new DetailsAboutRoomImpl();
			break;
		case ACTION_LIST_ROOMS:
			act = new LookListRoomImpl();
			break;
		case ACTION_LIST_ROOMS_FOR_ADMIN:
			act = new AdminLookListRooms();
			break;
		case ACTION_SAVE_UPDATE_ROOM:
			act = new UpdateRoomSaveImpl();
			break;
		case ACTION_FORM_UPDATE_ROOM:
			act = new PreparingRoomUpdateImpl();
			break;
		case ACTION_DELETE_ROOM:
			act = new DeleteRoomImpl();
			break;
		case ACTION_FORM_CREATE_ROOM:
			act = new PreparingCreateRoomImpl();
			break;
		case ACTION_SAVE_CREATE_ROOM:
			act = new CreateNewRoomImpl();
			break;
		case ACTION_FORM_AUTHENTICATION:
			act = new PreparingAuthenticationImpl();
			break;
		case ACTION_AUTHENTICATION:
			act = new CheckLoginImpl();
			break;
		default:
			act = new DefaultActionImpl();
		}
		return act;
	}
}
