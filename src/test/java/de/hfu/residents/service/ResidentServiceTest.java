package de.hfu.residents.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import de.hfu.residents.domain.Resident;
import de.hfu.residents.repository.ResidentRepositoryStub;


public class ResidentServiceTest {

	@Test
	public void testGetUniqueResident() throws ResidentServiceException {
		@SuppressWarnings("serial")
		List<Resident> people = new ArrayList<Resident>() {{
			add(new Resident("Hanelore", "Müller", "Maximilianstraße", "Berlin", new Date()));
			add(new Resident("Peter", "Müller", "Maximilianstraße", "Berlin", new Date()));
			add(new Resident("Niels", "Schillinger", "Hans-Bunte Straße", "Freiburg", new Date()));
		}};
		ResidentRepositoryStub stub1 = new ResidentRepositoryStub(people);
		
		BaseResidentService service = new BaseResidentService();
		service.setResidentRepository(stub1);
		assert(people.get(0) == service.getUniqueResident(people.get(0)));
		assert(people.get(1) == service.getUniqueResident(people.get(1)));
		assert(people.get(2) == service.getUniqueResident(people.get(2)));
	}

	@Test
	public void testGetFilteredResidentsList() {
		@SuppressWarnings("serial")
		List<Resident> people = new ArrayList<Resident>() {{
			add(new Resident("Hanelore", "Müller", "Maximilianstraße", "Berlin", new Date()));
			add(new Resident("Peter", "Müller", "Maximilianstraße", "Berlin", new Date()));
			add(new Resident("Niels", "Schillinger", "Hans-Bunte Straße", "Freiburg", new Date()));
		}};
		ResidentRepositoryStub stub1 = new ResidentRepositoryStub(people);
		
		BaseResidentService service = new BaseResidentService();
		service.setResidentRepository(stub1);

		assert(people.get(0) == service.getFilteredResidentsList(people.get(0)).get(0));
		assert(people.get(1) == service.getFilteredResidentsList(people.get(1)).get(0));
		assert(people.get(2) == service.getFilteredResidentsList(people.get(2)).get(0));
	}

}
