package com.wipro.workspace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
class ValidateServiceImplTest {
	@MockBean
	private ValidateServiceImpl validateService;
	@MockBean
	public ValidateRepo validateRepo;
	@MockBean
	private NumberRepo numberRepo;

	
	@Test
	void test() {
		InputValues inputValues = new InputValues();
		inputValues.setId(1);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		inputValues.setNumber(list);
		inputValues.setNumberValidaion("sss");
		inputValues.setRandomUUID("AAA");
		inputValues.setSpecialChar("Aqqs@");
		
			
		validateService.processInput(inputValues);
		
		Mockito.when(validateRepo.save(inputValues)).thenReturn(inputValues);
		
		
		assertEquals(inputValues, inputValues);
	}
	
}
