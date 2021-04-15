package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.PetType;
import merlobranco.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeJpaService extends JpaService<PetType, Long> implements PetTypeService {

	public PetTypeJpaService(CrudRepository<PetType, Long> repository) {
		super(repository);
	}

}
