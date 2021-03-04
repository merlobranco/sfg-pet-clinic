package merlobranco.springframework.sfgpetclinic.services;

import java.util.Set;

import merlobranco.springframework.sfgpetclinic.models.Pet;

public interface PetService {
	
	public Set<Pet> findAll();
	
	public Pet findById(Long id);
	
	public Pet save(Pet pet);

}
