package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.PetType;
import merlobranco.springframework.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends MapService<PetType, Long> implements PetTypeService {
}
