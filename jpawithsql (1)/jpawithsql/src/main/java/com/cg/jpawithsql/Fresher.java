package com.cg.jpawithsql;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Fresher")
public class Fresher extends Employee{
	@Column
	private String Training;

	public String getTraining() {
		return Training;
	}

	public void setTraining(String training) {
		Training = training;
	}

	@Override
	public String toString() {
		return "Fresher [Training=" + Training + "]";
	}

}
