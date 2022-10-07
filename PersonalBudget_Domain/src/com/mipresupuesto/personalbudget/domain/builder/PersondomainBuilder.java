package com.mipresupuesto.personalbudget.domain.builder;

public class PersondomainBuilder {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private PersondomainBuilder() {
		
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
	
}
