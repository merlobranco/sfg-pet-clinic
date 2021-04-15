package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import merlobranco.springframework.sfgpetclinic.models.Owner;
import merlobranco.springframework.sfgpetclinic.repositories.OwnerRepository;
import merlobranco.springframework.sfgpetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerJpaService extends JpaService<Owner, Long> implements OwnerService {
	
	private final OwnerRepository repository;

	public OwnerJpaService(OwnerRepository repository) {
		super(repository);
		this.repository = repository;
	}

	@Transactional(readOnly=true)
	@Override
	public Owner findByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}
}
