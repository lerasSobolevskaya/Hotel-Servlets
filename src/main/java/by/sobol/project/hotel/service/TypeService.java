package by.sobol.project.hotel.service;

import java.util.List;

import by.sobol.project.hotel.domain.Type;

public interface TypeService {

	List<Type> getListTypes();

	void createType(Type type);

	Type getTypeById(int id);

	void updateType(Type type);

	void deleteType(int id);
}
