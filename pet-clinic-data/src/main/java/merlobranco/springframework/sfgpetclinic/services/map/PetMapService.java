package merlobranco.springframework.sfgpetclinic.services.map;

import merlobranco.springframework.sfgpetclinic.models.Pet;

public class PetMapService extends AbstractMapService<Pet, Long> {

	@Override
	public Pet save(Pet pet) {
		return save(pet.getId(), pet);
	}
}
