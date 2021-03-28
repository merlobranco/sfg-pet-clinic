package merlobranco.springframework.sfgpetclinic.services.map;

import merlobranco.springframework.sfgpetclinic.models.Owner;
import merlobranco.springframework.sfgpetclinic.services.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner owner) {
		return save(owner.getId(), owner);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return map.values().stream().filter(e -> e.getLastName().equals(lastName)).findFirst().orElse(null);
	}
}
