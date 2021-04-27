package merlobranco.springframework.sfgpetclinic.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import merlobranco.springframework.sfgpetclinic.models.Owner;
import merlobranco.springframework.sfgpetclinic.services.OwnerService;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
	
	@Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    Set<Owner> owners;

    MockMvc mockMvc;
    
    @Mock
	Model model;
    
	@BeforeEach
	void setUp() throws Exception {
		owners = new HashSet<>();
        owners.add(Owner.builder().id(1l).build());
        owners.add(Owner.builder().id(2l).build());

        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();
	}

	@Test
	void testListOwnersMockMvc() throws Exception {
		
		when(ownerService.findAll()).thenReturn(owners);
		
		mockMvc.perform(get("/owners"))
        .andExpect(status().isOk())
        .andExpect(view().name("owners/index"))
        .andExpect(model().attribute("owners", hasSize(2)));
		
	}
	
	@Test
	void testListOwners() throws Exception {
		
		// Given
		when(ownerService.findAll()).thenReturn(owners);
		ArgumentCaptor<Set<Owner>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
		
		// When
		String viewName = ownerController.listOwners(model);
		
		// Then
		assertEquals(viewName, "owners/index");
		verify(ownerService).findAll();
		verify(model).addAttribute(eq("owners"), argumentCaptor.capture());
		Set<Owner> setInController = argumentCaptor.getValue();
		assertEquals(2, setInController.size());
		
	}

	@Test
	void testFindOwners() throws Exception {
		mockMvc.perform(get("/owners/find"))
        .andExpect(status().isOk())
        .andExpect(view().name("notImplemented"));

		verifyNoMoreInteractions(ownerService);
	}

}
