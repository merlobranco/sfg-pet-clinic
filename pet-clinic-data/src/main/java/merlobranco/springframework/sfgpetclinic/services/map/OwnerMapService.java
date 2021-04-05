package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Owner;
import merlobranco.springframework.sfgpetclinic.models.Pet;
import merlobranco.springframework.sfgpetclinic.services.OwnerService;
import merlobranco.springframework.sfgpetclinic.services.PetService;
import merlobranco.springframework.sfgpetclinic.services.PetTypeService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner findByLastName(String lastName) {
		return map.values().stream().filter(e -> e.getLastName().equals(lastName)).findFirst().orElse(null);
	}

	/**
	 * Simulating the typical JPA save behavior 
	 */
	@Override
	public Owner save(Owner object) {
		if (object == null) {
			return null;
		}
		if (object.getPets() == null) {
			return super.save(object);
		}
		
		object.getPets().forEach(pet -> {
			if (pet.getPetType() != null) {
				if (pet.getPetType().getId() == null) {
					pet.setPetType(petTypeService.save(pet.getPetType()));
				}
			} else {
				throw new RuntimeException("Pet Type is required");
			}

			if (pet.getId() == null) {
				Pet savedPet = petService.save(pet);
				pet.setId(savedPet.getId());
			}
		});

		return super.save(object);

	}

}
