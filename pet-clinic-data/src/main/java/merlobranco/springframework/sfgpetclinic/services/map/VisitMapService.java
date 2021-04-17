package merlobranco.springframework.sfgpetclinic.services.map;

import merlobranco.springframework.sfgpetclinic.models.Visit;
import merlobranco.springframework.sfgpetclinic.services.VisitService;

public class VisitMapService extends MapService<Visit, Long> implements VisitService {

	@Override
	public Visit save(Visit object) {
		if (object.getPet() == null || object.getPet().getId() == null || object.getPet().getOwner() == null  || object.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}

		return super.save(object);
	}
	
	
}
