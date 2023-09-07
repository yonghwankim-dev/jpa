package com.hello.jpabook_ch9_value_type._02_embeded_type;

import javax.persistence.Embeddable;

@Embeddable
public class Zipcode {

	private String zip;
	private String plusFour;
}
