package by.sobol.project.hotel.domain;

import java.util.Date;

public class Order extends Entity {

	private Date startDate;
	private Date endDate;
	private int userId;
	private int roomId;
	private String children;
	private String adults;

	public Order() {
	}

	public Order(int id) {
		super(id);
	}

	public Order(Date startDate, Date endDate, int userId, int roomId, String children, String adults) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.userId = userId;
		this.roomId = roomId;
		this.children = children;
		this.adults = adults;

	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getAdults() {
		return adults;
	}

	public void setAdults(String adults) {
		this.adults = adults;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((adults == null) ? 0 : adults.hashCode());
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + roomId;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (adults == null) {
			if (other.adults != null)
				return false;
		} else if (!adults.equals(other.adults))
			return false;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (roomId != other.roomId)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [startDate=" + startDate + ", endDate=" + endDate + ", userId=" + userId + ", roomId=" + roomId
				+ ", children=" + children + ", adults=" + adults + "]";
	}

}