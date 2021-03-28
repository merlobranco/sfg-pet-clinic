package merlobranco.springframework.sfgpetclinic.services.map;

import merlobranco.springframework.sfgpetclinic.models.Vet;
import merlobranco.springframework.sfgpetclinic.services.VetService;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet vet) {
		return save(vet.getId(), vet);
	}

}
