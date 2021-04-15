package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Vet;
import merlobranco.springframework.sfgpetclinic.repositories.VetRepository;
import merlobranco.springframework.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetJpaService extends JpaService<Vet, Long> implements VetService {

	public VetJpaService(VetRepository repository) {
		super(repository);
	}

}
