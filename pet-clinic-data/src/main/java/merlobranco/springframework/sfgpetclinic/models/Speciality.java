package merlobranco.springframework.sfgpetclinic.models;

public class Speciality extends BaseEntity {

	private static final long serialVersionUID = -2267980334116048581L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
