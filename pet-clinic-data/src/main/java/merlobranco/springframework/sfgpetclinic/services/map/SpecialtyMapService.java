package merlobranco.springframework.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import merlobranco.springframework.sfgpetclinic.models.Speciality;
import merlobranco.springframework.sfgpetclinic.services.SpecialtyService;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends MapService<Speciality, Long> implements SpecialtyService {

}
