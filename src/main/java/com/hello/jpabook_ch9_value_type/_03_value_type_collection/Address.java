package com.hello.jpabook_ch9_value_type._03_value_type_collection;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class Address {

	@Column
	private String city;
	private String street;
	private String zipcode;
}
