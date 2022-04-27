package com.wipro.workspace;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "numbersInput")
public class NumbersInput {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id_number;
	@Column(name = "number")
	private int number;
	
	
	
	// Mapping the column of this table 
    @ManyToOne
    //Adding the name
    @JoinColumn(name = "Input_id")
    InputValues ob;
	
	public NumbersInput() {
	}

	

	public NumbersInput(long id, int number, InputValues ob) {
		super();
		this.id_number = id;
		this.number = number;
		this.ob = ob;
	}



	public long getId() {
		return id_number;
	}

	public void setId(long id) {
		this.id_number = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



	public InputValues getOb() {
		return ob;
	}



	public void setOb(InputValues ob) {
		this.ob = ob;
	}

	
	
	
}
