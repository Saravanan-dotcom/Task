package com.wipro.workspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateServiceImpl implements ValidateService {

	@Autowired
	private ValidateRepo validateRepo;

	@Autowired
	private NumberRepo numberRepo;
	@Autowired
	Output output;

	@Override
	public Output processInput(InputValues input) {
		if(input.equals(null)) throw new EmptyInputException();
		
		InputValues inputSaved = validateRepo.save(input);
		boolean numberValidation = false;

		try {
			Integer.parseInt(input.getNumberValidaion());
			numberValidation = true;
		} catch (Exception e) {
			numberValidation = false;
		}

		output.setSpecialChar(input.getSpecialChar().replaceAll("[A-Za-z0-9]", ""));
		output.setNumber(input.getNumber().stream().max(Integer::compare).get());
		output.setNumberValidaion(numberValidation);
		output.setRandomUUID(input.getRandomUUID());

		NumbersInput number = new NumbersInput();
		for (int i : inputSaved.getNumber()) {
			number.setNumber(i);
			number.setOb(inputSaved);
			numberRepo.save(number);
			number = new NumbersInput();
		}
		return output;
		
		
	}

}
