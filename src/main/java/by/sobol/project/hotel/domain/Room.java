package by.sobol.project.hotel.domain;

public class Room extends Entity {

	private int number;
	private int price;
	private int numberOfSeats;
	private String status;
	private int typeId;
	private String image;

	public Room() {
	}

	public Room(int id) {
		super(id);
	}

	public Room(int id, int number, int price, int numberOfSeats, String status) {
		super();
		this.number = number;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		this.status = status;
	}

	public Room(int number, int price, int numberOfSeats, String status, int typeId, String image) {
		super();
		this.number = number;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		this.status = status;
		this.typeId = typeId;
		this.image = image;
	}

	
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + number;
		result = prime * result + numberOfSeats;
		result = prime * result + price;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + typeId;
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
		Room other = (Room) obj;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (number != other.number)
			return false;
		if (numberOfSeats != other.numberOfSeats)
			return false;
		if (price != other.price)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (typeId != other.typeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", price=" + price + ", numberOfSeats=" + numberOfSeats + ", status=" + status
				+ ", typeId=" + typeId + ", image=" + image + "]";
	}

	

}
