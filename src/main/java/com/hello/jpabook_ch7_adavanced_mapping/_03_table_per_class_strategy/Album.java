package com.hello.jpabook_ch7_adavanced_mapping._03_table_per_class_strategy;

import javax.persistence.Entity;

@Entity
public class Album extends Item {
	private String artist;
}
