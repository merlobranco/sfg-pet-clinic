package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Pet;
import merlobranco.springframework.sfgpetclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
