package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Speciality;
import merlobranco.springframework.sfgpetclinic.services.SpecialtyService;

@Service
public class SpecialtyMapService extends MapService<Speciality, Long> implements SpecialtyService {

}
