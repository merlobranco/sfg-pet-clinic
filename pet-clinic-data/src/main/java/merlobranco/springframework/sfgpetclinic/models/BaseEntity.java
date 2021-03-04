package merlobranco.springframework.sfgpetclinic.models;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 977239366157661339L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
