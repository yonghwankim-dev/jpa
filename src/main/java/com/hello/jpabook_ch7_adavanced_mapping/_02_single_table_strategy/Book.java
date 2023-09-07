package com.hello.jpabook_ch7_adavanced_mapping._02_single_table_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {
	private String author;  // 작가
	private String isbn;    // ISBN
}
