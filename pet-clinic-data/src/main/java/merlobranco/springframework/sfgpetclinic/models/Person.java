package merlobranco.springframework.sfgpetclinic.models;

public class Person extends BaseEntity {
	
	private static final long serialVersionUID = 4748273250606551747L;

	private String fisrtName;
	
	private String lastName;

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
