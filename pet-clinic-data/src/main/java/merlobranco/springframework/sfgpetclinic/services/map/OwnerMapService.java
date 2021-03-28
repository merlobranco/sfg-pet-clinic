package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Owner;
import merlobranco.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return map.values().stream().filter(e -> e.getLastName().equals(lastName)).findFirst().orElse(null);
	}
}
