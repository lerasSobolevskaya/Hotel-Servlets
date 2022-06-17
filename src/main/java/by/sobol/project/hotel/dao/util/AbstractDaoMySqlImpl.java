package by.sobol.project.hotel.dao.util;

import by.sobol.project.hotel.dao.pool.ConnectionPool;

public class AbstractDaoMySqlImpl {

	public static final ConnectionPool CONNECTION = ConnectionPool.getInstance();

	protected static final String SELECT_ALL_ROOMS = "SELECT room.room_id, room.number, room.number_of_seats, room.status, room.price,room.image,typeRoom.type_id, typeRoom.room_id, type.type_id, type.type FROM rooms room LEFT OUTER JOIN type_room typeRoom ON room.room_id=typeRoom.room_id LEFT OUTER JOIN apartment_type type ON typeRoom.type_id=type.type_id";
	protected static final String SELECT_ROOM = "SELECT room.room_id, room.number, room.number_of_seats, room.price, room.status, room.image ,typeRoom.room_id, typeRoom.type_id, type.type_id, type.type FROM rooms room LEFT OUTER JOIN type_room typeRoom ON room.room_id=typeRoom.room_id LEFT OUTER JOIN apartment_type type ON typeRoom.type_id=type.type_id WHERE room.room_id = ? ";
	protected static final String UPDATE_ROOM = "UPDATE rooms SET number=?, number_of_seats=?, price=?, status=?, image=?  WHERE room_id=?";
	protected static final String DELETE_ROOM = "DELETE FROM rooms WHERE room_id = ?";
	protected static final String INSERT_INTO_ROOMS = "INSERT INTO rooms (number,number_of_seats,price,status) VALUES (?,?,?,?)";

	protected static final String SELECT_ALL_ORDERS = "SELECT order_id,start_date,end_date,user_id,room_id,children,adults FROM orders";
	protected static final String UPDATE_ORDER = "UPDATE orders SET(start_date=?, end_date=?, room_id=?, user_id=?,children,adults) where order_id = ?";
	protected static final String SELECT_ORDER = "SELECT order_id,start_date,end_date,user_id,room_id,children,adults FROM orders WHERE order_id = ?";
	protected static final String DELETE_ORDER = "DELETE FROM orders WHERE order_id = ?";
	protected static final String INSERT_INTO_ORDERS = "INSERT INTO orders (start_date,end_date,user_id,room_id) VALUES (?,?,?,?)";

	protected static final String SELECT_ALL_TYPES = "SELECT type_id,type FROM apartment_type";
	protected static final String UPDATE_TYPE = "UPDATE apartment_type SET(type=?) where type_id=?";
	protected static final String SELECT_TYPE = "SELECT type_id,type FROM apartment_type WHERE type_id = ?";
	protected static final String DELETE_TYPE = "DELETE FROM apartment_type WHERE type_id = ?";
	protected static final String INSERT_INTO_TYPES = "INSERT INTO apartment_type (type) VALUES (?)";

	protected static final String SELECT_ALL_USERS = "SELECT user_id,name,surname,pass_num,login,password,role FROM users";
	protected static final String UPDATE_USER = "UPDATE users SET(name=?, surname=?, pass_num=?) where user_id=?";
	protected static final String SELECT_USER = "SELECT user_id,name,surname,pass_num, login, password, role FROM users WHERE user_id = ?";
	protected static final String DELETE_USER = "DELETE FROM users WHERE user_id = ?";
	protected static final String INSERT_INTO_USERS = "INSERT INTO users (name,surname,pass_num) VALUES (?,?,?,?)";
	protected static final String USER_AUTHENTICATION = "SELECT user_id,name,surname,pass_num,login,password,role FROM users WHERE login = ? AND password = ? ";

	protected static final String SELECT_ALL_BILLS = "SELECT  FROM bills";
	protected static final String UPDATE_BILL = "UPDATE bills SET() where bill_id=?";
	protected static final String SELECT_BILL = "SELECT  FROM bills WHERE bill_id = ?";
	protected static final String DELETE_BILL = "DELETE FROM bills WHERE bill_id = ?";
	protected static final String INSERT_INTO_BILLS = "INSERT INTO bills () VALUES (?,?,?,?)";

	protected static final String SELECT_ALL_FACILITIES = "SELECT facility_id, facility, image FROM facilities";
	protected static final String UPDATE_FACILITY = "UPDATE facilities SET(facility, image) where facility_id=?";
	protected static final String SELECT_FACILITY = "SELECT facility_id, facility, image FROM facilities WHERE facility_id = ?";
	protected static final String DELETE_FACILITY = "DELETE FROM facilities WHERE facility_id = ?";
	protected static final String INSERT_INTO_FACILITY = "INSERT INTO facilities (facility_id,facility,image) VALUES (?,?)";

	protected static final String ERROR_IN_DAO_GET_ROOM_LIST = "Error in getList() method in RoomDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_GET_ROOM = "Error in read() method in RoomDaoMySqlImpl.class  ";
	protected static final String ERROR_IN_DAO_UPDATE_ROOM = "Error in update() method in RoomDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_DELETE_ROOM = "Error in delete() method in RoomDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_CREATE_ROOM = "Error in create() method in RoomDaoMySqlImpl.class";

	protected static final String ERROR_IN_DAO_GET_TYPE_LIST = "Error in getList() method  in TypeDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_GET_TYPE = "Error in read() method in TypeDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_UPDATE_TYPE = "Error in update() method in TypeDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_DELETE_TYPE = "Error in delete() method in TypeDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_CREATE_TYPE = "Error in create() method in TypeDaoMySqlImpl.class ";

	protected static final String ERROR_IN_DAO_GET_ORDER_LIST = "Error in getList() method in OrderDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_GET_ORDER = "Error in read() method in OrderDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_DELETE_ORDER = "Error in delete() method in OrderDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_UPDATE_ORDER = "Error in update() method in OrderDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_CREATE_ORDER = "Error while creating order in OrderDaoMySqlImpl.class";

	protected static final String ERROR_IN_DAO_GET_FACILITY_LIST = "Error in getList() method in FacilityDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_CREATE_FACILITY = "Error in create() method in in FacilityDaoMySqlImpl.class";
	protected static final String ERROR_IN_DAO_GET_FACILITY = "Error in read() method in FacilityDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_UDATE_FACILITY = "Error in update() method in FacilityDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_DELETE_FACILITY = "Error in delete() method in FacilityDaoMySqlImpl.class ";

	protected static final String ERROR_IN_DAO_GET_USER_LIST = "Error in getList() method in UserDaoMySqlImpl ";
	protected static final String ERROR_IN_DAO_GET_USER = "Error in read() method in UserDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_UPDATE_USER = "Error in update() method in UserDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_DELETE_USER = "Error in delete() method in UserDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_CREATE_USER = "Error in create() method in UserDaoMySqlImpl.class ";
	protected static final String ERROR_IN_DAO_AUTHENTICATION = "Error in authentication() method in UserDaoMySqlImpl.class ";

	public static final String ERROR_IN_POOL_DISCONENCT = "Connection is not in the usedConnections queue";
	public static final String ERROR_IN_POOL_DRIVER = "Driver not found in ConnectionPool.class ";
	
	
	protected static final String ROOM_ID = "room_id";
	protected static final String ROOM_NUMBER = "number";
	protected static final String ROOM_NUMBER_OF_SEATS = "number_of_seats";
	protected static final String ROOM_PRICE = "price";
	protected static final String ROOM_STATUS = "status";
	protected static final String ROOM_IMAGE = "image";

	protected static final String TYPE_ID = "type_id";
	protected static final String TYPE_TYPE = "type";

	protected static final String ORDER_ID = "order_id";
	protected static final String ORDER_END_DATE = "end_date";
	protected static final String ORDER_START_DATE = "start_date";
	protected static final String ORDER_ROOM_ID = "room_id";
	protected static final String ORDER_USER_ID = "user_id";
	protected static final String ORDER_ADULTS = "adults";
	protected static final String ORDER_CHILDREN = "children";

	protected static final String FACILITY_ID = "facility_id";
	protected static final String FACILITY_FACILITY = "facility";
	protected static final String FACILITY_IMAGE = "image";

	protected static final String USER_ID = "user_id";
	protected static final String USER_NAME = "name";
	protected static final String USER_SURNAME = "surname";
	protected static final String USER_PASS_NUM = "pass_num";
	protected static final String USER_LOGIN = "login";
	protected static final String USER_PASSWORD = "password";
	protected static final String USER_ROLE = "role";

}
