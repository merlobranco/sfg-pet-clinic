package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import merlobranco.springframework.sfgpetclinic.models.BaseEntity;
import merlobranco.springframework.sfgpetclinic.services.CrudService;

public class JpaService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID>{
	
	private final CrudRepository<T, ID> repository;
	
	public JpaService(CrudRepository<T, ID> repository) {
		this.repository = repository;
	}

	@Transactional(readOnly=true)
	@Override
	public Set<T> findAll() {
		return new HashSet<T>((Collection<? extends T>) repository.findAll());
	}

	@Transactional(readOnly=true)
	@Override
	public T findById(ID id) {
		return repository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public T save(T object) {
		return repository.save(object);
	}

	@Transactional
	@Override
	public void delete(T object) {
		repository.delete(object);	
	}

	@Transactional
	@Override
	public void deleteById(ID id) {
		repository.deleteById(id);
	}

}
