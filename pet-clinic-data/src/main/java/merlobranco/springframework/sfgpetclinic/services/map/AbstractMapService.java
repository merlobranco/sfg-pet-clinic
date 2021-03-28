package merlobranco.springframework.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import merlobranco.springframework.sfgpetclinic.models.BaseEntity;
import merlobranco.springframework.sfgpetclinic.services.CrudService;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
	
	protected Map<Long, T> map = new HashMap<>();

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
	
	@Override
	public T save(T object) {
		
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
			map.put(object.getId(), object);
			return object;
		}
		throw new RuntimeException("Object cannot be null");
	}
	
	private Long getNextId() {
		return map.isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
	}
}
