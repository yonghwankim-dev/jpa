package com.hello.jpabook_ch7_adavanced_mapping._02_single_table_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Movie extends Item {
	private String director; // 감독
	private String actor; // 배우

}


