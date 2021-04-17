package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Pet;
import merlobranco.springframework.sfgpetclinic.services.PetService;

@Service
@Profile({"default", "map"})
public class PetMapService extends MapService<Pet, Long> implements PetService {
}
