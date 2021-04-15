package merlobranco.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import merlobranco.springframework.sfgpetclinic.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
