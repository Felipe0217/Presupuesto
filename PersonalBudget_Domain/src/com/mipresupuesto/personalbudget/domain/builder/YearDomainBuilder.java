package com.mipresupuesto.personalbudget.domain.builder;
import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.YearDomain;

public class YearDomainBuilder {

	private  UUID id;
	private  int year;
	
	private YearDomainBuilder() {
		setYear(0);
		
	}

	private final UUID getId() {
		return id;
	}

	private final int getYear() {
		return year;
	}

	public final YearDomainBuilder setId(UUID id) {
		this.id = (id == null) ? UUID.randomUUID() : id;
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}
	
	public YearDomain build() {
		return YearDomain.create(getId(), getYear());
		
	}

}
