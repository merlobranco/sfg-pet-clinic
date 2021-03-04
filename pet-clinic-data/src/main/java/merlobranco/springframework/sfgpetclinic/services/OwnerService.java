package merlobranco.springframework.sfgpetclinic.services;

import java.util.Set;

import merlobranco.springframework.sfgpetclinic.models.Owner;

public interface OwnerService {
	
	public Set<Owner> findAll();
	
	public Owner findById(Long id);
	
	public Owner findByLastName(String lastName);
	
	public Owner save(Owner owner);

}
