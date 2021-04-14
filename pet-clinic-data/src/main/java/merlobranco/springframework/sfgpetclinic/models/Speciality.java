package merlobranco.springframework.sfgpetclinic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

	private static final long serialVersionUID = -2267980334116048581L;
	
	@Column(name="description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
