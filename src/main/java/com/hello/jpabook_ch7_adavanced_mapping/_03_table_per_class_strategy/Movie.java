package com.hello.jpabook_ch7_adavanced_mapping._03_table_per_class_strategy;

import javax.persistence.Entity;

@Entity
public class Movie extends Item {
	private String director; // 감독
	private String actor; // 배우

}


