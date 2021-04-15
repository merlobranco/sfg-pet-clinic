package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Speciality;
import merlobranco.springframework.sfgpetclinic.repositories.SpecialityRepository;
import merlobranco.springframework.sfgpetclinic.services.SpecialtyService;

@Service
@Profile("springdatajpa")
public class SpecialityJpaService extends JpaService<Speciality, Long> implements SpecialtyService {

	public SpecialityJpaService(SpecialityRepository repository) {
		super(repository);
	}

}
