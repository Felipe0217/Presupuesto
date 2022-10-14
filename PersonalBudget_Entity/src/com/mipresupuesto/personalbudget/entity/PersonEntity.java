package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

public  final class PersonEntity {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;

	public PersonEntity() {
		setId();
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		
	}

	public PersonEntity( final UUID id,final String idCard,final String firstName,final String middlename,final String firstSurname,final String secondSurname) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middlename);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);

	}
	
	public static final PersonEntity create() {
		return new PersonEntity();
	}
	
	public final UUID getId() {
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public final String getFirstName() {
		if (firstName== null) {
			setFirstName("");
		}
		return firstName.trim();
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getMiddleName() {
		if (middleName== null) {
			setMiddleName("");
		}
		return middleName.trim();
	}

	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final String getFirstSurname() {
		if (firstSurname== null) {
			setFirstSurname("");
		}
		
		return firstSurname.trim();
	}

	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public final String getSecondSurname() {
		if (secondSurname== null) {
			setSecondSurname("");
		}
		
		return secondSurname.trim();
	}

	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	
}
