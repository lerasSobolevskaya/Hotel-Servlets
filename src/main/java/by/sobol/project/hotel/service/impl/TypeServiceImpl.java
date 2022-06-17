package by.sobol.project.hotel.service.impl;

import java.util.List;

import by.sobol.project.hotel.dao.TypeDao;
import by.sobol.project.hotel.dao.factory.DaoFactory;
import by.sobol.project.hotel.domain.Type;
import by.sobol.project.hotel.service.TypeService;

public class TypeServiceImpl implements TypeService {

	private TypeDao typeDao = DaoFactory.getTypeDao();

	@Override
	public List<Type> getListTypes() {
		return typeDao.getList();
	}

	@Override
	public void createType(Type type) {
		typeDao.create(type);
	}

	@Override
	public Type getTypeById(int id) {
		return typeDao.read(id);
	}

	@Override
	public void updateType(Type type) {
		typeDao.update(type);
	}

	@Override
	public void deleteType(int id) {
		typeDao.delete(id);
	}

}
