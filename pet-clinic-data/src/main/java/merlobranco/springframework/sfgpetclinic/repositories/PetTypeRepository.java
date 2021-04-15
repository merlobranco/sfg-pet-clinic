package merlobranco.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import merlobranco.springframework.sfgpetclinic.models.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>{

}
