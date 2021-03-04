package merlobranco.springframework.sfgpetclinic.models;

public class PetType extends BaseEntity {
	
	private static final long serialVersionUID = 5881079236936720109L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
