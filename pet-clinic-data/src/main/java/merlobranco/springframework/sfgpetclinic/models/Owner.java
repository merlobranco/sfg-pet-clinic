package merlobranco.springframework.sfgpetclinic.models;

import java.util.Set;

public class Owner extends Person {

	private static final long serialVersionUID = -4690876960225846075L;
	
	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
