package merlobranco.springframework.sfgpetclinic.models;

import java.util.Set;

public class Vet extends Person {

	private static final long serialVersionUID = 405138796902956638L;
	
	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
