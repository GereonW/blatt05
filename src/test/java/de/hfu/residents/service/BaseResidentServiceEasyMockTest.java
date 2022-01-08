package de.hfu.residents.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import de.hfu.residents.domain.Resident;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.easymock.EasyMock.*;


public class BaseResidentServiceEasyMockTest {

	@Test
	public void testMain() throws ResidentServiceException {
		@SuppressWarnings("serial")
		List<Resident> people = new ArrayList<Resident>() {{
			add(new Resident("Hanelore", "Müller", "Maximilianstraße", "Berlin", new Date()));
			add(new Resident("Peter", "Müller", "Maximilianstraße", "Berlin", new Date()));
			add(new Resident("Niels", "Schillinger", "Hans-Bunte Straße", "Freiburg", new Date()));
		}};
		
		BaseResidentService service = createMock(BaseResidentService.class);
		expect(service.getUniqueResident(people.get(0))).andReturn(people.get(0));
		expect(service.getFilteredResidentsList(people.get(0))).andReturn(people.subList(0, 0));
		replay(service);
	}

}
