package com.jpabook_ch9_value_type._02_embeded_type;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneServiceProvider {
	@Id
	private String name;
}
