package com.wipro.workspace;

import static org.junit.jupiter.api.Assertions.*;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest
class ValidateControllerTest {
	
	@Autowired
	private ValidateController validateController;
	@MockBean
	public ValidateService validateService;
	

	@Test
	void test() {
		InputValues inputValues = new InputValues();
		inputValues.setId(1);
		inputValues.setNumberValidaion("sss");
		inputValues.setRandomUUID("AAA");
		inputValues.setSpecialChar("Aqqs@");
		
		Output o = new Output();
		o.setNumber(1);
		o.setNumberValidaion(true);
		o.setRandomUUID("AAa");
		o.setSpecialChar("##");
		
		MockHttpServletRequest request = new MockHttpServletRequest();

		request.addHeader("UUID", "test");
		
		validateController.createTutorial(inputValues,request);
		Mockito.when(validateService.processInput(inputValues)).thenReturn(o);
		
		
		assertEquals(inputValues, inputValues);
	}
	
}
