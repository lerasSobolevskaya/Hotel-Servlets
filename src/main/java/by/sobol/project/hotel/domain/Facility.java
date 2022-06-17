package by.sobol.project.hotel.domain;

public class Facility extends Entity {

	private String nameFacilities;
	private String image;

	public Facility() {
	}

	public Facility(int id) {
		super(id);
	}

	public Facility(String nameFacilities, String image) {
		super();
		this.nameFacilities = nameFacilities;
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNameFacilities() {
		return nameFacilities;
	}

	public void setNameFacilities(String nameFacilities) {
		this.nameFacilities = nameFacilities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((nameFacilities == null) ? 0 : nameFacilities.hashCode());
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
		Facility other = (Facility) obj;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (nameFacilities == null) {
			if (other.nameFacilities != null)
				return false;
		} else if (!nameFacilities.equals(other.nameFacilities))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Facility [nameFacilities=" + nameFacilities + ", image=" + image + "]";
	}

}
