package com.hello.jpabook_ch7_adavanced_mapping._04_mapped_superclass;

import javax.persistence.Entity;

@Entity
public class Seller extends BaseEntity {
	private String shopName;
}
