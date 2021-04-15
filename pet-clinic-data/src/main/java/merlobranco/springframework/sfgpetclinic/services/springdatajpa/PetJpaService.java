package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Pet;
import merlobranco.springframework.sfgpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetJpaService  extends JpaService<Pet, Long> implements PetService {

	public PetJpaService(CrudRepository<Pet, Long> repository) {
		super(repository);
	}

}

