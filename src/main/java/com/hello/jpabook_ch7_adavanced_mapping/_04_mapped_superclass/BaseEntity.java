package com.hello.jpabook_ch7_adavanced_mapping._04_mapped_superclass;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
}
