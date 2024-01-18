package com.ch14.class04;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode(of = {"city", "street", "zipcode"})
public class Address {

	private String city;
	private String street;
	private String zipcode;
}
