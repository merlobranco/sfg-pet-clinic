package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Vet;
import merlobranco.springframework.sfgpetclinic.services.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
}
