package merlobranco.springframework.sfgpetclinic.services;

import merlobranco.springframework.sfgpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	public Owner findByLastName(String lastName);
}
