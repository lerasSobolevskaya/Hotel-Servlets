package by.sobol.project.hotel.web.action.impl.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.sobol.project.hotel.domain.Room;
import by.sobol.project.hotel.domain.Type;
import by.sobol.project.hotel.service.TypeService;
import by.sobol.project.hotel.service.factory.ServiceFactory;

public class ActionAssistant {
	
	private TypeService typeService = ServiceFactory.getTypeService();

	protected Map<Integer, Type> getTypesForRoomList(List<Room> roomList) {
		Map<Integer, Type> roomTypeMap = new HashMap<Integer, Type>();
		for (Room room : roomList) {
			int typeId = room.getTypeId();
			Type type = typeService.getTypeById(typeId);
			roomTypeMap.put(room.getId(), type);
		}
		return roomTypeMap;
	}

}
