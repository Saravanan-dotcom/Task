package com.wipro.workspace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ValidateServiceImplTest {
	
	private ValidateService validateService;
	@Mock
	public ValidateRepo validateRepo;
	@Mock
	private NumberRepo numberRepo;
	@Mock
	Output output;
	

    @BeforeEach
    void initUseCase() {
    	validateService = new ValidateServiceImpl(validateRepo,numberRepo,output);
    }
	
	@Test
	void test() {
		InputValues inputValues = new InputValues();
		inputValues.setId(1);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		inputValues.setNumber(list);
		inputValues.setNumberValidaion("3");
		inputValues.setRandomUUID("AAA");
		inputValues.setSpecialChar("AAAA$$$");
		Mockito.when(validateRepo.save(inputValues)).thenReturn(inputValues);
		
		Mockito.when(validateRepo.save(inputValues)).thenReturn(inputValues);
			
		validateService.processInput(inputValues);
		//output.se
		
		assertEquals(inputValues, inputValues);
	}
	
}
