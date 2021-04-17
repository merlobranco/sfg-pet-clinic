package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Speciality;
import merlobranco.springframework.sfgpetclinic.models.Vet;
import merlobranco.springframework.sfgpetclinic.services.SpecialtyService;
import merlobranco.springframework.sfgpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetMapService extends MapService<Vet, Long> implements VetService {
	
	private final SpecialtyService specialtyService;

	public VetMapService(SpecialtyService specialtyService) {
		super();
		this.specialtyService = specialtyService;
	}

	@Override
	public Vet save(Vet object) {
		if (object == null) {
			return null;
		}
		if (object.getSpecialities() == null) {
			return super.save(object);
		}
		object.getSpecialities().forEach(speciality -> {
            if(speciality.getId() == null) {
                Speciality savedSpecialty = specialtyService.save(speciality);
                speciality.setId(savedSpecialty.getId());
            }
        });
		return super.save(object);
	}
	
	
}
