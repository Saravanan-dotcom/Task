package com.wipro.workspace;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Output {

	private String RandomUUID;
	private String specialChar;

	private int number;

	private boolean numberValidaion;
	private String error;

	public Output() {
	}

	public Output(String randomUUID, String specialChar, int number, boolean numberValidaion, String error) {
		super();
		RandomUUID = randomUUID;
		this.specialChar = specialChar;
		this.number = number;
		this.numberValidaion = numberValidaion;
		this.error = error;
	}

	public String getRandomUUID() {
		return RandomUUID;
	}

	public void setRandomUUID(String randomUUID) {
		RandomUUID = randomUUID;
	}

	public String getSpecialChar() {
		return specialChar;
	}

	public void setSpecialChar(String specialChar) {
		this.specialChar = specialChar;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isNumberValidaion() {
		return numberValidaion;
	}

	public void setNumberValidaion(boolean numberValidaion) {
		this.numberValidaion = numberValidaion;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
