package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Visit;
import merlobranco.springframework.sfgpetclinic.repositories.VisitRepository;
import merlobranco.springframework.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitJpaService extends JpaService<Visit, Long> implements VisitService {

	public VisitJpaService(VisitRepository repository) {
		super(repository);
	}
}
