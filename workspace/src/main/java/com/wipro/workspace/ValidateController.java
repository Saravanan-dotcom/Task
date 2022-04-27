package com.wipro.workspace;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ValidateController {

	@Autowired
	private ValidateService validateService;

	@PostMapping("/input")
	public ResponseEntity<Object> createTutorial(@RequestBody InputValues input, HttpServletRequest reques) {
//		try {
//			input.setRandomUUID(reques.getHeader("UUID"));
//			Output _output = validateService.processInput(input);
//			return new ResponseEntity<>(_output, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
//		}
		
		input.setRandomUUID(reques.getHeader("UUID"));
		Output _output = validateService.processInput(input);
		return new ResponseEntity<>(_output, HttpStatus.CREATED);
	}

}
