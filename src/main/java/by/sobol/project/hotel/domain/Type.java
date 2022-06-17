package by.sobol.project.hotel.domain;

public class Type extends Entity {
	
	private String type;
	private int roomId;

	public Type() {
	}

	public Type(int id) {
		super(id);
	}

	public Type(String type, int roomId) {
		super();
		this.type = type;
		this.roomId = roomId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		result = prime * result + roomId;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Type other = (Type) obj;
		if (roomId != other.roomId)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Type: " + type + " Room id: " + roomId;
	}

}
