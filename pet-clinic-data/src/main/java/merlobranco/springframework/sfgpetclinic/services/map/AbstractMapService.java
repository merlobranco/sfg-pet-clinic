package merlobranco.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import merlobranco.springframework.sfgpetclinic.services.CrudService;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
	
	protected Map<ID, T> map = new HashMap<>();

	@Override
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	@Override
	public T findById(ID id) {
		return map.get(id);
	}

	@Override
	public void delete(T object) {
		map.entrySet().removeIf(e -> e.getValue().equals(object));
	}

	@Override
	public void deleteById(ID id) {
		map.remove(id);
	}
	
	public T save(ID id, T object) {
		map.put(id, object);
		return object;
	}
}
