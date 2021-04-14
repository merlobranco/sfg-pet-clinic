package merlobranco.springframework.sfgpetclinic.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {
	
	private static final long serialVersionUID = 4748273250606551747L;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
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
