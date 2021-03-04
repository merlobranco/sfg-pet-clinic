package merlobranco.springframework.sfgpetclinic.services;

import java.util.Set;

import merlobranco.springframework.sfgpetclinic.models.Vet;

public interface VetService {
	
	public Set<Vet> findAll();
	
	public Vet findById(Long id);
	
	public Vet save(Vet vet);

}
