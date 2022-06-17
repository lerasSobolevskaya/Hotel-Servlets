package by.sobol.project.hotel.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import by.sobol.project.hotel.domain.Entity;

public interface BaseDao<T extends Entity> {

	static final Logger LOG = Logger.getLogger(BaseDao.class);

	List<T> getList();

	void create(T entity);

	T read(int id);

	void update(T entity);

	void delete(int id);

	default void closeResultSet(ResultSet result) {
		if (result != null) {
			try {
				result.close();
			} catch (SQLException ex) {
				LOG.error("Can't close ResultSet ", ex);
			}
		}
	}
}
