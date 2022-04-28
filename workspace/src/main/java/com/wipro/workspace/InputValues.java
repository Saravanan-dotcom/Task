package com.wipro.workspace;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "validaion")
public class InputValues {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "ramdomuuid")
	private String RandomUUID;
	@Column(name = "specialChar")
	private String specialChar;

	//@Column(name = "number")
	@Transient
	private List<Integer> number;
	//private int number;
	
	@Column(name = "numberValidaion")
	private String numberValidaion;

	// Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    private List<NumbersInput> ob;
	
	
	public InputValues() {
	}


	public InputValues(String randomUUID, String specialChar, List<Integer> number, String numberValidaion) {
		super();
		RandomUUID = randomUUID;
		this.specialChar = specialChar;
		this.number = number;
		this.numberValidaion = numberValidaion;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSpecialChar() {
		return specialChar;
	}

	public void setSpecialChar(String specialChar) {
		this.specialChar = specialChar;
	}
	public String getRandomUUID() {
		return RandomUUID;
	}

	public void setRandomUUID(String randomUUID) {
		RandomUUID = randomUUID;
	}

	public String getNumberValidaion() {
		return numberValidaion;
	}

	public void setNumberValidaion(String numberValidaion) {
		this.numberValidaion = numberValidaion;
	}


	public List<Integer> getNumber() {
		return number;
	}


	public void setNumber(List<Integer> number) {
		this.number = number;
	}


	public List<NumbersInput> getOb() {
		return ob;
	}


	public void setOb(List<NumbersInput> ob) {
		this.ob = ob;
	}
	
	
	

}
