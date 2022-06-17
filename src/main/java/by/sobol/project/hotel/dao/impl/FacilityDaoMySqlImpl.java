package by.sobol.project.hotel.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.sobol.project.hotel.dao.FacilityDao;
import by.sobol.project.hotel.dao.util.AbstractDaoMySqlImpl;
import by.sobol.project.hotel.domain.Facility;

public class FacilityDaoMySqlImpl extends AbstractDaoMySqlImpl implements FacilityDao {

	static final Logger LOG = Logger.getLogger(FacilityDaoMySqlImpl.class);

	@Override
	public List<Facility> getList() {
		List<Facility> facilities = new ArrayList<>();
		ResultSet result = null;
		Connection connection = CONNECTION.getConnect();
		try (Statement stm = connection.createStatement()) {
			result = stm.executeQuery(SELECT_ALL_FACILITIES);
			while (result.next()) {
				facilities.add(buildFacility(result));
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_FACILITY_LIST, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return facilities;
	}

	@Override
	public void create(Facility facility) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement ps = connection.prepareStatement(INSERT_INTO_FACILITY)) {
			ps.setString(1, facility.getNameFacilities());
			ps.setString(2, facility.getImage());
			ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_CREATE_FACILITY, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public Facility read(int id) {
		Facility facility = new Facility();
		Connection connection = CONNECTION.getConnect();
		ResultSet result = null;
		try (PreparedStatement ps = connection.prepareStatement(SELECT_FACILITY)) {
			ps.setInt(1, id);
			result = ps.executeQuery();
			if (result.next()) {
				facility = buildFacility(result);
			}
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_GET_FACILITY, ex);
		} finally {
			CONNECTION.disconnect(connection);
			closeResultSet(result);
		}
		return facility;
	}

	@Override
	public void update(Facility facility) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement ps = connection.prepareStatement(UPDATE_FACILITY)) {
			ps.setString(1, facility.getNameFacilities());
			ps.setString(2, facility.getImage());
			ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_UDATE_FACILITY, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	@Override
	public void delete(int id) {
		Connection connection = CONNECTION.getConnect();
		try (PreparedStatement ps = connection.prepareStatement(DELETE_FACILITY)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException ex) {
			LOG.error(ERROR_IN_DAO_DELETE_FACILITY, ex);
		} finally {
			CONNECTION.disconnect(connection);
		}
	}

	private Facility buildFacility(ResultSet result) throws SQLException {
		Facility facility = new Facility();
		facility.setId(result.getInt(FACILITY_ID));
		facility.setNameFacilities(result.getString(FACILITY_FACILITY));
		facility.setImage(result.getString(FACILITY_IMAGE));
		return facility;

	}
}
