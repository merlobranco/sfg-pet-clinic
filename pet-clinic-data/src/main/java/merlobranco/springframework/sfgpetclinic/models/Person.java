package merlobranco.springframework.sfgpetclinic.models;

public class Person extends BaseEntity {
	
	private static final long serialVersionUID = 4748273250606551747L;

	private String firstName;
	
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fisrtName) {
		this.firstName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
