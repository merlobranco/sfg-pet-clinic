package merlobranco.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import merlobranco.springframework.sfgpetclinic.models.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

	public Owner findByLastName(String lastName);

}
