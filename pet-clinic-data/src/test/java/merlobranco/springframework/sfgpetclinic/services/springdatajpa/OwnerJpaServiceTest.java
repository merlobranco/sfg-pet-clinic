package merlobranco.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import merlobranco.springframework.sfgpetclinic.models.Owner;
import merlobranco.springframework.sfgpetclinic.repositories.OwnerRepository;
import merlobranco.springframework.sfgpetclinic.repositories.PetRepository;
import merlobranco.springframework.sfgpetclinic.repositories.PetTypeRepository;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {
	
	public static final String LAST_NAME = "Smith";
	public static final Long ID = 1L;
	
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerJpaService service;
    
    Owner returnOwner;

	@BeforeEach
	void setUp() throws Exception {
		returnOwner = Owner.builder().id(ID).lastName(LAST_NAME).build();
	}

	@Test
	void testFindByLastName() {
		when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        
		Owner smith = service.findByLastName(LAST_NAME);
		assertEquals(LAST_NAME, smith.getLastName());
		assertNotNull(smith);
        verify(ownerRepository).findByLastName(any());
	}

	@Test
	void testFindAll() {
		Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(ID).build());
        returnOwnersSet.add(Owner.builder().id(2l).build());
        
        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);
        Set<Owner> owners = service.findAll();
        assertEquals(2, owners.size());
        assertNotNull(owners);
        verify(ownerRepository).findAll();
        
	}

	@Test
	void testFindById() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
		
		Owner owner = service.findById(ID);
		
		assertEquals(ID, owner.getId());
		assertNotNull(owner);
		verify(ownerRepository).findById(ID);
	}
	
	@Test
    void testFindByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(ID);
        assertNull(owner);
        verify(ownerRepository).findById(ID);
    }

	@Test
	void testSaveExistingId() {
		when(ownerRepository.save(any())).thenReturn(returnOwner);
		
		Owner ownerToSave = Owner.builder().id(ID).build();
		Owner savedOwner = service.save(ownerToSave);
        
		assertEquals(ownerToSave.getId(), savedOwner.getId());
		assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
		
	}
	
	@Test
    void testSaveNoId() {
		when(ownerRepository.save(any())).thenReturn(returnOwner);
		Owner ownerToSave = new Owner();
		Owner savedOwner = service.save(ownerToSave);
		assertNotNull(savedOwner);
		assertNotNull(savedOwner.getId());		
        verify(ownerRepository).save(any());	
	}

	@Test
	void testDelete() {
		service.delete(returnOwner);
		
		assertEquals(0, service.findAll().size());
        // Default is 1 times
        verify(ownerRepository).delete(any());
	}

	@Test
	void testDeleteById() {
		service.deleteById(1L);
		
		assertEquals(0, service.findAll().size());
        verify(ownerRepository).deleteById(anyLong());
	}

}
