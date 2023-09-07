package com.hello.jpabook_ch7_adavanced_mapping._02_single_table_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {
	private String artist;
}
