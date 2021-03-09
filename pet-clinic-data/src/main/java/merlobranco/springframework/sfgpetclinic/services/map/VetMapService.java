package merlobranco.springframework.sfgpetclinic.services.map;

import merlobranco.springframework.sfgpetclinic.models.Vet;

public class VetMapService extends AbstractMapService<Vet, Long> {

	@Override
	public Vet save(Vet vet) {
		return save(vet.getId(), vet);
	}

}
